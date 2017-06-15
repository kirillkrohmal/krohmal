package ru.job4j.Tracker;

/**
 * Created by Comp on 12.06.2017.
 */
public class Input {

    String[] question = {"Выберите пункт меню", "вызвать описание", "вызвать ", "вызвать "};

    public String ask(String question) {

        String.format(question);
        return question;
    }

    String[] date = {"печатаю ", "печатаю", "печатаю ", "печатаю "};

    //ПЕЧАТАЕТ НА КОНСОЛЬ
    public void print(String date) {

    }


}
