package ru.job4j.BankATM;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Comp on 12.09.2017.
 */
public class CurrencyManipulatorFactory {
    private static Map<String, CurrencyManipulator> manipulatorMap = new HashMap<>();
    private static CurrencyManipulatorFactory currencyManipulator = new CurrencyManipulatorFactory();
    /**
     * В этом методе будем создавать нужный манипулятор, если он еще не существует, либо возвращать ранее созданный.
     * Подумайте, где лучше хранить все манипуляторы.
     * Сделайте так, чтобы невозможно было создавать объекты CurrencyManipulatorFactory класса
     */
    public static void getManipulatorByCurrencyCode(String currencyCode) {
        for (Map.Entry<String, CurrencyManipulator> manipulatorEntry: manipulatorMap.entrySet()) {
            if (manipulatorEntry.getValue().equals(currencyCode)) {
                manipulatorMap.put(currencyCode, manipulatorEntry.getValue());
            }
        }
    }

    /**
     * В классе CurrencyManipulatorFactory создайте статический метод getAllCurrencyManipulators(),
     * который вернет Collection всех манипуляторов. У вас все манипуляторы хранятся в карте, не так ли?
     */
    public static Collection<CurrencyManipulator> getAllCurrencyManipulators() {
        return manipulatorMap.values();
    }
}
