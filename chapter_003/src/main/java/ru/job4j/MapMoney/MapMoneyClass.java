package ru.job4j.MapMoney;

import ru.job4j.testtask.Account;
import ru.job4j.testtask.User;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Created by Comp on 26.08.2017.
 */
public class MapMoneyClass {

    public static void main(String[] args) {
        Map<User, List<Account>> mapMoney = new HashMap<>();

        for (Map.Entry<User, List<Account>> listEntry : mapMoney.entrySet()) {
            User id = listEntry.getKey();
            List<Account> account = listEntry.getValue();
            System.out.println("Id= " + id + "Account= " + account);
        }
    }
}




