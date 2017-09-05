package ru.job4j.TestTask;

import java.util.*;
import java.util.function.Predicate;

/**
 * Обращаемся к mapMoney чтобы взять взю информацию
 */
public class Operation {
    //public final int STORAGE_USER = 200;
    //int size = 0;
    //ArrayList<User> userArrayList = new ArrayList<>(STORAGE_USER);
    //ArrayList<Account> accountArrayList = new ArrayList<>(STORAGE_USER);
    Map<User, List<Account>> mapMoney = new HashMap<>();
    //double balance = 10000;

    public void addUser(String passport) {
        for (int i = 0; i < passport.length(); i++) {
            mapMoney.get(i);
        }
        //userArrayList.add(size++, user);
    }

    public void deleteUser(String passport) {
        for (int i = 0; i < mapMoney.size(); i++) {
            if (mapMoney.get(i) != null && mapMoney.get(i).equals(passport)) {
                mapMoney.remove(i, passport);
                //mapMoney.put(i);
                //mapMoney.get(i, mapMoney.get());
                //mapMoney.set(size - 1, null);
                //size--;
            }
        }
    }

    public void deleteAccountFromUser(String passport, String requisites) {
        /*for (Account account1 : accountListList) {
            userListList.removeIf(p -> p.getName() == account1.getRequisites());
        }*/


        for (int i = 0; i < mapMoney.size(); i++) {

            if (mapMoney.get(i) != null && mapMoney.get(i).equals(passport)) {
                mapMoney.get(i);

                //mapMoney.get(i);
                //mapMoney.get(i, mapMoney.get(i));
                //mapMoney.get(size - 1, null);
                //size--;
            }
        }
    }

    public void addAccountToUser(String passport, String requisites) {

        //accountArrayList.add(size++, account);
       /*
            if (accountArrayList.get(i) != null && accountArrayList.get(i).equals(account)) {
                accountArrayList.set(i, account);
                accountArrayList.set(i, userArrayList.add());

            }
            //accountArrayList.set(i, accountArrayList.get(size - 1));
            //accountArrayList.set(size - 1, null);
            //size--;
        }*/
    }


    /*public List<User> findAllUsers() {
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            userList.add(i, userArrayList.get(i));
        }
        return userList;
    }*/

   /* public List<Account> findAllAccount() {
        List<Account> accountList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            accountList.add(i, accountArrayList.get(i));
        }
        return accountList;
    }*/

    public List<Account> getUserAccounts(String passport) {
        List<Account> accountListList = new ArrayList<>();

        for (Map.Entry<User, List<Account>> listEntry : mapMoney.entrySet()) {
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
        return accountListList;
    }

    //List<Account> accountListList = new ArrayList<>();


    //метод для перечисления денег с одного счёта на другой счёт если счёт не найден или не хватает денег на счёте
    //srcAccount (с которого переводят) должен вернуть false.
    public boolean transferMoney(String srcPassport, String srcRequisites, String dstPassport, String dstRequisites, double amount) {


        return false;
    }

    public void exit() {
        System.exit(0);
    }
}
