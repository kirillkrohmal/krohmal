package ru.job4j.ExtraTasks.task_017;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Реализован банкомат размена денег. Автомат принимает бумажную купюру и обменивает на монеты.
 * Метод должен возвращать список всех возможных вариантов размены купюры.
 */
public class MoneyATM {
    public static void main(String[] args) {
        MoneyATM moneyATM = new MoneyATM();
        moneyATM.exchangeMoney(101, 2);
    }

    public int[] exchangeMoney(int money, int denM) {

        int arr[] = new int[denM];
        int[] denMoney = {money};
        int[] changeMoney = {1, 2, 5, 10};
        int[] count = {};

        for (int i = 0; denM > 0; i++) {
            if (denM == 1) {
                int size = money + denM - 1 / denM; // rounded up, aka ceiling
                arr[i] = size;
                denM--;
                //count[i] = changeMoney[i] / denMoney[i];
                //System.out.println(count);
            } else if (denM == 2) {
                int size = (money + denM - 1) / denM; // rounded up, aka ceiling
                arr[i] = size;
                money -= size;
                denM--;
                //count[i] = changeMoney[i] / denMoney[i];
            } else if (denM == 5) {
                int size = (money + denM - 1) / denM; // rounded up, aka ceiling
                arr[i] = size;
                money -= size;
                denM--;
                //count[i] = changeMoney[i] / denMoney[i];
            } else if (denM == 10) {
                int size = (money + denM - 1) / denM; // rounded up, aka ceiling
                arr[i] = size;
                money -= size;
                denM--;
                //count[i] = changeMoney[i] / denMoney[i];
            }
        }

        for (arr[denM] = 0; arr[denM] <= 25; arr[denM]++)
            System.out.println(arr  + ": " + Arrays.toString(exchangeMoney(20, money)));


        return arr;
    }
}
