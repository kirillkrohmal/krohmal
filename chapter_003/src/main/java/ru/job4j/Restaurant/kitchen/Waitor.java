package ru.job4j.Restaurant.kitchen;

import ru.job4j.Restaurant.ConsoleHelper;

import java.util.Observable;
import java.util.Observer;

public class Waitor implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        ConsoleHelper.writeMessage(arg + "Start cooking - " + o);
    }
}
