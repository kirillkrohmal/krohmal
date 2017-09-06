package ru.job4j.MapMoney;

import org.testng.annotations.Test;
import ru.job4j.TestTask.Account;
import ru.job4j.TestTask.Operation;
import ru.job4j.TestTask.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


import static com.sun.org.apache.xerces.internal.util.PropertyState.is;


/**
 * Created by Comp on 26.08.2017.
 */
public class MapMoneyClass {

    public static void main(String[] args) {
        Map<User, List<Account>> mapMoney = new HashMap<>();

        for (Map.Entry<User, List<Account>> listEntry: mapMoney.entrySet()) {
            User id = listEntry.getKey();
            List<Account> account = listEntry.getValue();
            System.out.println("Id= " + id + "Account= " + account);
        }

        /*for (int i = 0; i < size; i++) {
            if (accountListList.size() != 0 && accountListList.get(i).equals(user)) {
                System.out.println(accountListList);
                //accountArrayList.set(i, accountListList.get());
            }
            //accountListList.add(i, accountArrayList.get(i));
        }*/

    }
}




