package ru.job4j.Tracker;

import java.util.Scanner;

/**
 * Created by Comp on 18.06.2017.
 */
public class ConsoleInput implements Input {
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
            System.out.println(question);
            return scanner.nextLine();
    }
}
