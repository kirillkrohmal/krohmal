package ru.job4j.Practice.Example_1;

/**
 * Created by Comp on 17.11.2017.
 */
public interface Encryptable {
    String DEScrypt(String text, String key);
    String RSAcrypt(String text, String key);
    String GOSTcrypt(String text, String key);
}
