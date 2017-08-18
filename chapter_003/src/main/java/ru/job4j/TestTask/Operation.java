package ru.job4j.TestTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Comp on 11.08.2017.
 */
public class Operation {
    public final int STORAGE_USER = 200;
    int size = 0;
    ArrayList<User> userArrayList = new ArrayList<>(STORAGE_USER);

    public Map<User, List<Account>> listOfBankRequisites(List<Account> accounts) {


        return null;
    }

    public void addUser(User user) {
        if (size == STORAGE_USER - 1) {
            System.out.println(String.format("Объем %s полон", user));
        }
        userArrayList.add(size++, user);
    }

    public void deleteUser(User user) {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) != null && userArrayList.get(i).equals(user)) {
                userArrayList.set(i, null);
                userArrayList.set(i, userArrayList.get(size - 1));
                userArrayList.set(size - 1, null);
                size--;
            }
        }
    }

    public void addAccountToUser(User user, Account account) {

    }

    public void deleteAccountFromUser(User user, Account account) {
        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) != null && account.getRequisites().equals(account)) {

            }
        }
    }

    public List<Account> getUserAccounts(User user) {

        for (int i = 0; i < userArrayList.size(); i++) {
            if (userArrayList.get(i) != null && userArrayList.get(i).equals(user.getPassport())) {

            }
        }

        return null;
    }

    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {

        return false;
    }
}
