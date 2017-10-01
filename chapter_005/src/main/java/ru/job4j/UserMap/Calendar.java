package ru.job4j.UserMap;

import java.util.Date;

/**
 * Created by Comp on 29.09.2017.
 */
public class Calendar {
    Date date = new Date();
    Date date2 = new Date();

    public void setDate() {
        date.setDate(9);
        date.setMonth(4);
        date.setYear(1995);
        System.out.println("День рождение: " + date);
    }

    public void setDate2() {
        date2.setDate(1);
        date2.setMonth(9);
        date2.setYear(1997);
        System.out.println("День рождение: " + date2);
    }

    @Override
    public String toString() {
        return "Calendar{" +
                "date=" + date +
                ", date2=" + date2 +
                '}';
    }
}
