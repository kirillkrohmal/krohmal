package ru.job4j.BankATM.commands;

import ru.job4j.BankATM.*;

import java.util.Collection;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by Comp on 12.09.2017.
 */
public class InfoCommand implements Command {
    ResourceBundle resourceBundle = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "info_en");
    //CurrencyManipulator currencyManipulator = new CurrencyManipulator();
    /**
     * В InfoCommand в цикле выведите [код валюты - общая сумма денег для выбранной валюты]
     * Запустим прогу и пополним счет на EUR 100 2 и USD 20 6, и посмотрим на INFO.
     * Все работает правильно? В InfoCommand используйте метод boolean hasMoney() и выведите фразу "No money available.",
     * если нет денег в банкомате.
     */
    @Override
    public void execute() {
        ConsoleHelper.writeMessage(resourceBundle.getString("before"));
        Collection<CurrencyManipulator> manipulators = CurrencyManipulatorFactory.getAllCurrencyManipulators();

        if (manipulators.isEmpty()) {
            ConsoleHelper.writeMessage("Empty.Please Check it");
        } else {

            for (CurrencyManipulator manipulator : manipulators) {
                System.out.println(manipulator.getTotalAmount());
            }
        }
    }
}
