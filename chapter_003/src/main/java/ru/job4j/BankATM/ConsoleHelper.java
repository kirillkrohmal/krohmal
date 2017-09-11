package ru.job4j.BankATM;

import ru.job4j.BankATM.exception.InterruptOperationException;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

/**
 * Created by Comp on 12.09.2017.
 */
public class ConsoleHelper {
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle(CashMachine.RESOURCE_PATH + "");

    public static void writeMessage(String message) {
        System.out.println(message);
    }

    /**
     * Этот метод который будет считывать с консоли строку и возвращать ее.
     * Если возникнет какое-то исключение при работе с консолью, то перехватим его и не будем обрабатывать.
     */
    public static String readString() throws InterruptOperationException {
        String answer = null;
        try {
            answer = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (answer.contains("EXIT")) {
            writeMessage("Выход");
            throw new InterruptOperationException("Ошибка");
        }
        return answer;
    }

    /**
     * Этот метод должен предлагать пользователю ввести код валюты, проверять, что код содержит 3 символа.
     * Если данные некорректны, то сообщить об этом пользователю и повторить.
     * Если данные валидны, то перевести код в верхний регистр и вернуть.
     */
    public static String askCurrencyCode() {
        while (true) {
            String currencyCode = readString();
            if (currencyCode.length() != 3) {
                writeMessage(resourceBundle.getString(""));
            } else {
                return currencyCode.toUpperCase();
            }
        }
    }

    /**
     * Этот метод должен предлагать пользователю ввести два целых положительных числа.
     * Первое число - номинал, второе - количество банкнот.
     * Никаких валидаторов на номинал нет. Т.е. 1200 - это нормальный номинал.
     * Если данные некорректны, то сообщить об этом пользователю и повторить.
     * Пример вводимых данных: 200 5
     */
    public String[] getValidTwoDigits(String currencyCode) {
        while (true) {
            writeMessage("choose.denomination.and.count.format");
            String read = readString();
            String[] digits = read.split("");
            try {
                if (digits.length == 2 && digits.equals(currencyCode) && currencyCode.equals(currencyCode)) {
                    return digits;
                } else {
                    writeMessage("");
                }
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }
    }

    public static Operation askOperation() throws InterruptOperationException {
        while (true) {
            String operation = readString();
            try {
                if (operation.equals("1")) {
                    return Operation.getAllowableOperationByOrdinal(1);
                } else if (operation.equals("2")) {
                    return Operation.getAllowableOperationByOrdinal(2);
                } else if (operation.equals("3")) {
                    return Operation.getAllowableOperationByOrdinal(3);
                } else if (operation.equals("4")) {
                    return Operation.getAllowableOperationByOrdinal(4);
                }
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }
}
