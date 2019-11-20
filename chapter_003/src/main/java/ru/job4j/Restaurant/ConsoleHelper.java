package ru.job4j.Restaurant;

import ru.job4j.Restaurant.kitchen.Dish;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Created by Comp on 10.09.2017.
 */
public class ConsoleHelper {
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    /**
     * для вывода message в консоль
     */
    public static void writeMessage(String message) {

    }

    /**
     * для чтения строки с консоли
     */
    String readString() {

        return null;
    }

    /**
     * просит ползователя выбрать блюдо и добавляет его в список. Введенное 'exit' означает завершение заказа.
     * исключения пробрасывайте выше, на этом уровне не понятно, что с ними делать.
     */
    List<Dish> getAllDishesForOrder() {

        return null;
    }

}
