package ru.job4j.BankATM.commands;

import ru.job4j.BankATM.CashMachine;
import ru.job4j.BankATM.ConsoleHelper;

import java.util.ResourceBundle;

/**
 * Created by Comp on 16.09.2017.
 */
public class LoginCommand implements Command {
    private ResourceBundle validCreditCards = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "verifiedCards.properties");

    @Override
    public void execute() {
        ConsoleHelper.writeMessage("Validate you login");


    }
}
