package ru.job4j.TestTask;

import java.util.*;

/**
 * Обращаемся к mapMoney чтобы взять всю информацию
 */
public class Operation {
    Map<User, List<Account>> mapMoney = new HashMap<>();


    public void addUser(User user) {
        mapMoney.put(user, new ArrayList<Account>());
    }

    public void deleteUser(User user) {
        mapMoney.remove(user);
    }

    public void addAccountToUser(String passport, Account account) {
        List<Account> accounts = mapMoney.get(findByPassport(passport));
        accounts.add(account);
    }


    public void deleteAccountFromUser(String passport, Account account) {
        List<Account> accounts = mapMoney.get(findByPassport(passport));
        accounts.remove(account);
    }

    public User findByPassport(String passport) {
        User user = null;

        for (User temp : mapMoney.keySet()) {
            if (temp.getPassport().equals(passport)) {
                user = temp;
                break;
            }
        }
        return user;
    }

    public User findAllUsers(String name) {
        User user = null;

        for (User temp : mapMoney.keySet()) {
            if (temp.getName().equals(name)) {
                user = temp;
                break;
            }
        }
        return user;
    }

    public Account findAccountByRequisites(String requisites) {
        Account result = null;
        for (List<Account> accountList : mapMoney.values()) {
            for (Account account : accountList) {
                if (account.getRequisites().equals(requisites)) {
                    result = account;
                    break;
                }
            }
        }
        return result;
    }



    /*
    public List<Account> getUserAccounts(Account account) {

        List<Account> list = null;

        for (List<Account> listEntry : mapMoney.values()) {
            if (listEntry.equals(account)) {
                list.add(account);
            }
        }


        return list;
    }*/

//метод для перечисления денег с одного счёта на другой счёт если счёт не найден или не хватает денег на счёте
//srcAccount (с которого переводят) должен вернуть false.

    public boolean transferMoney(String srcPassport, String srcRequisites, String dstPassport, String dstRequisites, double amount) {
        double count;
        boolean result = false;
        Map<List<Account>, Double> money = new HashMap<>();

        for (List<Account> list : mapMoney.values()) {
            for (Account account : list) {
                count = account.getValue();
                if (amount > 0 && account.getRequisites().equals(srcRequisites)) {
                    list.add(account);

                }
                money.put(list, amount);
                double value = amount - count;

                for (List<Account> accountList : money.keySet()) {
                    for (Account account1 : accountList) {
                        double keeper = value + account1.getValue();
                        if (keeper > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return result;
    }
}

