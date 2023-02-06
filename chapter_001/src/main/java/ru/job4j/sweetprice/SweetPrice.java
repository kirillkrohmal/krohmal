package ru.job4j.sweetprice;

public class SweetPrice {
    public static void out(int price) {

        for (int i = 9; i < price; i++) {

            System.out.println(price);
            price = price + 10;
            if (price == 60) break;
        }

    }
}
