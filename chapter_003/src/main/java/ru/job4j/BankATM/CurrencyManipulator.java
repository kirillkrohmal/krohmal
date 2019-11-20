package ru.job4j.BankATM;

import ru.job4j.BankATM.exception.NotEnoughMoneyException;

import java.util.Map;

/**
 * Created by Comp on 12.09.2017.
 */
public class CurrencyManipulator {
    public String currencyCode;
    /**
     * это Map<номинал, количество>
     */
    private Map<Integer, Integer> denominations;

    public CurrencyManipulator(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Метод который посчитает общую сумму денег для выбранной валюты.
     */
    public int getTotalAmount() {
        int ammout = 0;

        for (Integer integer : denominations.keySet()) {
            for (Integer integer1 : denominations.values()) {
                ammout = ammout + (integer * integer1);
            }
        }

       /* for (Map.Entry<Integer, Integer> entry : denominations.entrySet()) {
            ammout = ammout + (entry.getKey() * entry.getValue());
        }
*/
        return ammout;
    }

    /**
     * Добавьте в манипулятор метод boolean hasMoney(), который будет показывать, добавлены ли какие-то банкноты или нет.
     */
    public boolean hasMoney() {
        if (denominations.containsKey(currencyCode)) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Метод который добавит введенные номинал и количество банкнот
     */
    void addAmount(int denomination, int count) {
        if (denominations.containsKey(denomination)) {
            denominations.put(denomination, denominations.get(denomination) + count);
        } else {
            denominations.put(denomination, count);
        }
    }

    /**
     * Логика основного метода withdrawAmount:
     * 2.1. Внимание!!! Метод withdrawAmount должен возвращать минимальное количество банкнот, которыми набирается
     * запрашиваемая сумма. Используйте Жадный алгоритм (use google).
     * Если есть несколько вариантов, то использовать тот, в котором максимальное количество банкнот высшего номинала.
     * Если для суммы 600 результат - три банкноты: 500 + 50 + 50 = 200 + 200 + 200, то выдать первый вариант.
     * Пример, надо выдать 600
     * В манипуляторе есть следующие банкноты:
     * 500 - 2
     * 200 - 3
     * 100 - 1
     * 50 - 12
     * Результат должен быть таким:
     * 500 - 1
     * 100 - 1
     * т.е. всего две банкноты (это минимальное количество банкнот) номиналом 500 и 100.
     * 2.2. Мы же не можем одни и те же банкноты выдавать несколько раз, поэтому
     * если мы нашли вариант выдачи денег (п.2.1. успешен), то вычесть все эти банкноты из карты в манипуляторе.
     * 2.3. метод withdrawAmount должен кидать NotEnoughMoneyException, если купюрами невозможно выдать запрашиваемую сумму.
     * Пример, надо выдать 600
     * В манипуляторе есть следующие банкноты:
     * 500 - 2
     * 200 - 2
     * Результат - данными банкнотами невозможно выдать запрашиваемую сумму. Кинуть исключение.
     * Не забудьте, что в некоторых случаях картой кидается ConcurrentModificationException.
     */
    Map<Integer, Integer> withdrawAmount(int expextedAmount) throws NotEnoughMoneyException {

        int[] coin = {50, 100, 200, 500};
        int size = 0;
        try {
            for (int i = 0; i < expextedAmount; i++) {
                if (expextedAmount > 0) {
                    expextedAmount -= size / coin[i];
                } else {
                    throw new NotEnoughMoneyException("Error");
                }
            }

        } catch (NotEnoughMoneyException e) {

        }
        return null;
    }
}
