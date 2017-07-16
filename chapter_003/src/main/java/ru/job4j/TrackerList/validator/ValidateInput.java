package ru.job4j.TrackerList.validator;


import ru.job4j.TrackerList.exception.MenuOutException;
import ru.job4j.TrackerList.inputs.ConsoleInput;

import java.util.ArrayList;

/**
 * Created by Comp on 28.06.2017.
 */
public class ValidateInput extends ConsoleInput {
    public int ask(String question, ArrayList<int[]> range) {
        boolean invalid = true;

        int value = -1;

        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Необходимо ввести корректное значение");
            } catch (NullPointerException npe) {
                System.out.println("Необходимо ввести корректное значение");
            }
        }
        while (invalid);

        return value;
    }
}
