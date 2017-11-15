package ru.job4j.Practice.Example_1;

public class Encryption implements Encryptable {

    private String text;
    private String key;

    public Encryption(String text, String key) {
        this.text = text;
        this.key = key;
    }

    @Override
    public String DEScrypt(String text, String key) {
        String cryptedString = text + " " + key;
        return cryptedString;
    }

    @Override
    public String RSAcrypt(String text, String key) {
        String cryptedString = text + " " + key;
        return cryptedString;
    }

    @Override
    public String GOSTcrypt(String text, String key) {
        String cryptedString = text + " " + key;
        return cryptedString;
    }
}
