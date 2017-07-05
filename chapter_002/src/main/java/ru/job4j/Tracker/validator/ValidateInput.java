package ru.job4j.Tracker.validator;


import ru.job4j.Tracker.exception.MenuOutException;
import ru.job4j.Tracker.inputs.ConsoleInput;

/**
 * Created by Comp on 28.06.2017.
 */
public class ValidateInput extends ConsoleInput {
    public int ask(String question, int[] range) {
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
            } catch (Exception e) {
                System.out.println("Необходимо ввести корректное значение");
            }
        }
        while (invalid);

        return value;
    }
}
