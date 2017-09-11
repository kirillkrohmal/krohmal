package ru.job4j.BankATM;

import ru.job4j.BankATM.commands.CommandExecutor;
import ru.job4j.BankATM.exception.InterruptOperationException;
import ru.job4j.BankATM.exception.NotEnoughMoneyException;

import java.util.Locale;

public class CashMachine {
    public static final String RESOURCE_PATH = "com.javarush.test.level26.lesson15.big01.resources.";
    //currencyManipulator.getTotalAmount()

    void printExitMessage () {
        ConsoleHelper.writeMessage("Exit!GoodBye");
    }

    public static void main(String[] args) throws NotEnoughMoneyException {

        try {
            CommandExecutor.execute(Operation.LOGIN);
            Operation currentOperation = null;
            do {
                currentOperation = ConsoleHelper.askOperation();
                CommandExecutor.execute(currentOperation);
            }
            while (currentOperation != Operation.EXIT);
        }
        catch (InterruptOperationException e) {
            ConsoleHelper.writeMessage("Goodbye!");
        }
    }
}
