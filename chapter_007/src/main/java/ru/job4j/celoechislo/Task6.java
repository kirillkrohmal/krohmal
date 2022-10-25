package ru.job4j.celoechislo;

import java.util.ArrayList;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        int t = 0;

        int s = scanner.nextInt();

        while(t < s) {
            arrayList.add(scanner.nextInt());
            t++;
        }


        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) % 2 != 0) {
                arrayList.remove(i);
            }

        }

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }
    }
}

