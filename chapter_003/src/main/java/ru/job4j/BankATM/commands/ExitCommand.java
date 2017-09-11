package ru.job4j.BankATM.commands;

import ru.job4j.BankATM.CashMachine;
import ru.job4j.BankATM.ConsoleHelper;

import java.util.ResourceBundle;

/**
 * Created by Comp on 12.09.2017.
 */
public class ExitCommand implements Command {
    ResourceBundle resourceBundle = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "exit_en");

    @Override
    public void execute() {
        ConsoleHelper.writeMessage(resourceBundle.getString("exit.question.y.n"));
        while (true) {

        }
    }
}
