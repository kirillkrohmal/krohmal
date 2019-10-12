package ru.job4j.Tracker.inputs;

import com.sun.corba.se.spi.orbutil.fsm.Input;

import java.util.List;
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

    @Override
    public int ask(String question, int[] range) {
        int key = Integer.parseInt(this.ask(question));
        boolean exist = false;

        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new RuntimeException();
        }
    }
}
