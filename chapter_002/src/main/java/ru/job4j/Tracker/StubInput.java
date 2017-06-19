package ru.job4j.Tracker;

import java.util.Scanner;

/**
 * Created by Comp on 18.06.2017.
 */
public class StubInput implements Input {
    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }

    private Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String question) {

        for (int i = 0; i < position; i++) {
            /*if () {
                answers[i] = ;
            }*/
        }

        return answers[position++];
    }
}
