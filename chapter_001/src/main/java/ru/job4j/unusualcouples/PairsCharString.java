package ru.job4j.unusualcouples;

public class PairsCharString {
    public static boolean check(String l, String r) {
        if (l.equals(null) && r.equals(null)) {
            return true;
        } else if (l.charAt(0) == r.charAt(7) && l.charAt(7) == r.charAt(0)) {
            return true;
        } else {
            return false;
        }
    }
}
