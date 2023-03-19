package ru.job4j.unusualcouples;

public class PairsCharString {
    public static boolean check(String l, String r) {
        for (int i = r.length() - 1; i < r.length(); i++) {
            for (int j = l.length() - 1; j < l.length(); j++) {
                if (l.equals(null) && r.equals(null)) {
                    return true;
                } else if (l.charAt(j) == r.charAt(i) && l.charAt(i) == r.charAt(j)) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        check("booking", "grabber");
    }
}
