package ru.job4j.BankATM.commands;

import ru.job4j.BankATM.CashMachine;
import ru.job4j.BankATM.ConsoleHelper;
import ru.job4j.BankATM.Operation;
import ru.job4j.BankATM.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

/**
 * Created by Comp on 12.09.2017.
 */
public class DepositCommand implements Command {
    /**
     * Считаем с консоли код валюты, потом считаем номинал и количество банкнот, а потом добавим их в манипулятор.
     * Проверим, что там стало с main? Цикл, в котором спрашиваем операцию у пользователя, а потом вызываем метод у
     * CommandExecutor. И так до бесконечности... надо бы придумать условие выхода из цикла.
     * Исправь цикл, чтоб он стал do-while. Условие выхода - операция EXIT.
     */
    ResourceBundle resourceBundle = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "deposit_en");

    @Override
    public void execute() throws InterruptOperationException {
        ConsoleHelper.writeMessage(resourceBundle.getString("before"));

        try {
            String code = null;
            int value = 0;
            do {
                if (ConsoleHelper.askCurrencyCode() == "USD") {
                    CommandExecutor.commandMap.put(Operation.DEPOSIT, new DepositCommand());

                }
            }
            while (!ConsoleHelper.readString().contains("EXIT"));

        } catch (InterruptOperationException e) {
            e.printStackTrace();
        }
    }
}

