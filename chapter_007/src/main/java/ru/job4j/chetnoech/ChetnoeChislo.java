package ru.job4j.chetnoech;

public class ChetnoeChislo {
    public static void main(String[] args) {
        System.out.println(chislo(6));
    }

    public static int chislo(int ch) {
        return ch + 2 - ch%2;
    }
}
