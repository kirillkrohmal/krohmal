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
        for (User temp : mapMoney.keySet()) {
            if (findByPassport(user.getPassport()).equals(temp.getPassport())) {
                mapMoney.remove(temp);
            }
        }
    }

    public void addAccountToUser(String passport, String requisites) {
        List<Account> account = new ArrayList<>();
        Account account1 = null;

        for (int i = 0; i < account.size(); i++) {
            for (Account temp : account) {
                if(temp.getRequisites().equals(account1.getRequisites())) {
                    mapMoney.put(new User(passport, requisites), account);
                    mapMoney.size();
                    mapMoney.values();
                }
            }
        }
        
        /*for (User temp : mapMoney.keySet()) {
            if (findAllAccount(requisites).equals(account1.getRequisites())) {
                //mapMoney.put(temp, account);
                mapMoney.put(temp, new ArrayList<Account>());
            }
        }*/
    }

    public void deleteAccountFromUser(String passport, String requisites) {
        List<Account> list = null;
        for (int i = 0; i < mapMoney.size(); i++) {
            if (mapMoney.get(i) != null && mapMoney.get(i).equals(passport)) {
                mapMoney.remove(new User(passport, requisites), (List<Account>) list.get(i));
                //mapMoney.get(mapMoney.size() - 1);
            }
        }
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

    /* public User findAllUsers(String name) {
         User user = null;

         for (User temp : mapMoney.keySet()) {
             if (temp.getName().equals(name)) {
                 user = temp;
                 break;
             }
         }
         return user;
     }
 */
    public Account findAllAccount(String requisites) {
        List<Account> accountList = new ArrayList<>();
        Account account = null;

        for (Account temp : accountList) {
            if (temp.getRequisites().equals(requisites)) {
                account = temp;
                break;
            }
        }
        return account;
    }
/*
        for (int i = 0; i < mapMoney.size(); i++) {
            accountList.add(i, (Account) mapMoney.get(i));
        }
        return accountList;*/


    public List<Account> getUserAccounts(String requisites) {
        List<Account> accountListList = new ArrayList<>();

        for (int i = 0; i < accountListList.size(); i++) {
            for (List<Account> listEntry : mapMoney.values()) {
                if (accountListList.equals(requisites)) {
                    System.out.println(listEntry.get(i));
                }
            }
        }
        return accountListList;
    }

    //метод для перечисления денег с одного счёта на другой счёт если счёт не найден или не хватает денег на счёте
    //srcAccount (с которого переводят) должен вернуть false.

    public boolean transferMoney(String srcPassport, String srcRequisites, String dstPassport, String dstRequisites, double amount) {
        int srcAccount = 4000;

        for (User user : mapMoney.keySet()) {
            for (List<Account> account : mapMoney.values()) {
                if (account.size() > 0) {
                    user.getPassport();
                    account.get(Integer.parseInt(dstRequisites));
                    amount++;
                    //account.set(account, )
                } else if (srcAccount < 0) {
                    return false;
                }
            }
        }
        return false;
    }
}
