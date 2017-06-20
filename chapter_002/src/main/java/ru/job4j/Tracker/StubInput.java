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

   /* public StubInput(Item[] items) {
        Item[] items1 = new Item[]{};
        items1[0] = new Item("1", );

        //tracker.add(new StubInput(items));
    }*/

    @Override
    public String ask(String question) {
        return answers[position++];
    }
}
