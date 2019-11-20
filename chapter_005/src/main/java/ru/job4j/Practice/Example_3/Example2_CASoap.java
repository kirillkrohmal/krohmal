package ru.job4j.Practice.Example_3;

import ru.CryptoPro.JCP.JCP;
import ru.CryptoPro.JCP.tools;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

class CASoap {
    private static final Logger LOGGER = Logger.getLogger(CASoap.class.getName());
    private String LogStr = "";
    ResponseCASoap objResponseCASoap = new ResponseCASoap();


    public ResponseCASoap CreateUser(String Email, String ADLogin, String FIO, HashMap Params) throws Exception {
        String description = "�������������� ������� � ��";
        String managerComment = "�������������� ������� � ��";
        String webLogin_value = "";
        String webPassword_value = "";
        char[] charPwd = Params.get("PasswordKeyStoreJCP").toString().toCharArray();
        List<List<String>> resultParseXML = new ArrayList<>();
        List<String> parseAttrs = new ArrayList<String>();
        CASoap objCASoap = new CASoap();

        try {

            //��������� KeyStore

            KeyStore keyStore = KeyStore.getInstance("HDImageStore");
            keyStore.load(null, null);
            PrivateKey privateKey = (PrivateKey) keyStore.getKey("CA", charPwd);
            X509Certificate cert = (X509Certificate) keyStore.getCertificate("CA");

            objCASoap.SignRequestCA("1", privateKey, cert);
            return objResponseCASoap;

        } catch (Exception e) {
            String ss = getStackTrace(e);
            objCASoap.setErrorLog(ss);
            return objResponseCASoap;
        }

    }

    public String SignRequestCA(String StrRequest, PrivateKey privateKey, X509Certificate cert) throws Exception {
        //������� ��� PKCS7 � �������������� CMS
        byte[] data = StrRequest.getBytes("UTF-16LE");
        setLog("Set private key");
        final PrivateKey[] keys = new PrivateKey[1];
        keys[0] = privateKey;
        setLog("Set certificate");
        final Certificate[] certs = new Certificate[1];
        certs[0] = cert;
        String DIGEST_OID = "1.2.643.2.2.9";
        String SIGN_OID = "1.2.643.2.2.19";
        boolean isCMS = true;

        try {
            setLog("CreateCMS");
            byte[] res = createCMS(data, keys, certs, false);
            res = createCMS(res, keys, certs, false);
            ru.CryptoPro.JCP.tools.Encoder encoder = new ru.CryptoPro.JCP.tools.Encoder();
            setLog("Sign string");
            String resBase64String = encoder.encode(res);
            return resBase64String;
        } catch (Exception e) {
            String ss = getStackTrace(e);
            setErrorLog(ss);
            LOGGER.log(Level.SEVERE, "Error signed request CA:" + StrRequest, e);
            return "";
        }
        return DIGEST_OID;
    }

    public static byte[] createCMS(byte[] data, PrivateKey[] keys,
                                   Certificate[] certs, boolean detached)
            throws Exception {
        return createCMSEx(data, keys, certs, detached,
                "1.2.643.2.2.9", "1.2.643.2.2.19", "GOST3411withGOST3410EL",
                "JCP");
    }

    public static byte[] createCMSEx(byte[] data, PrivateKey[] keys,
                                     Certificate[] certs, boolean detached, String digestOid,
                                     String signOid, String signAlg, String providerName) throws Exception {

        //������� CMS
        String STR_CMS_OID_SIGNED = "1.2.840.113549.1.7.2";
        String STR_CMS_OID_DATA = "1.2.840.113549.1.7.1";
        //���������

        final String asnBuf = "CryptoString";

        return asnBuf.getBytes();
    }

    public static String getStackTrace(Throwable e) {
        StringWriter sw = new StringWriter();
        e.printStackTrace(new PrintWriter(sw));
        return sw.toString();
    }

    private void setErrorLog(String logString) {

        //Utils.setProcessTaskNote(taskId, taskNote);
        //notifyAdminAboutError(logString);
        String ss = "";
        objResponseCASoap.log = objResponseCASoap.log + "<" + new Date() + "> " + "<" + this.getClass() + "> " + "<MDM> " + "<ERROR> " + logString + "\n";
        LogStr = LogStr + "<" + new Date() + "> " + "<MDM> " + "<ERROR> " + logString + "\n";
        System.out.println(logString);
        LOGGER.log(Level.SEVERE, logString);
    }

    private void setLog(String logString) {

        objResponseCASoap.log = objResponseCASoap.log + "<" + new Date() + "> " + "<" + this.getClass() + "> " + "<MDM> " + "<LOG> " + logString + "\n";
        LogStr = LogStr + "<" + new Date() + "> " + "<MDM> " + "<LOG> " + logString + "\n";
        System.out.println(objResponseCASoap.log);
        LOGGER.finest(objResponseCASoap.log);
    }
}
