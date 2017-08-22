package ru.job4j.TestTask;

import java.util.*;
import java.util.function.Predicate;

/**
 * Created by Comp on 11.08.2017.
 */
public class Operation {
    public final int STORAGE_USER = 200;
    int size = 0;
    ArrayList<User> userArrayList = new ArrayList<>(STORAGE_USER);
    ArrayList<Account> accountArrayList = new ArrayList<>(STORAGE_USER);
    Map<User, List<Account>> mapMoney = new HashMap<>();
    //Scanner scanner = new Scanner(System.in);
    //int index = Integer.parseInt(scanner.nextLine());

    public boolean hasMoney() {
        boolean result = true;
        if (mapMoney.isEmpty()) {
            result = false;
        } else {
            int count = 0;
            for (Map.Entry<User, List<Account>> entry : mapMoney.entrySet()) {
                if (entry.getValue() == null) {
                    count++;
                }
            }
            if (count == mapMoney.size()) {
                result = false;
            }
        }
        return result;
    }

    public void addUser(User user) {
        if (size == STORAGE_USER - 1) {
            System.out.println(String.format("Объем %s полон", user));
        }
        userArrayList.add(size++, user);
    }

    public void deleteUser(User user) {
        for (int i = 0; i < size; i++) {
            if (userArrayList.get(i) != null && userArrayList.get(i).equals(user)) {
                userArrayList.set(i, null);
                userArrayList.set(i, userArrayList.get(size - 1));
                userArrayList.set(size - 1, null);
                size--;
            }
        }
    }

    public void deleteAccountFromUser(User user, Account account) {
        /*for (Account account1 : accountListList) {
            userListList.removeIf(p -> p.getName() == account1.getRequisites());
        }*/
        for (int i = 0; i < accountArrayList.size(); i++) {

            if (accountArrayList.get(i) != null && accountArrayList.get(i).equals(account)) {
                accountArrayList.set(i, null);
                accountArrayList.set(i, accountArrayList.get(size - 1));
                accountArrayList.set(size - 1, null);
                size--;
            }
        }
    }

    public void addAccountToUser(User user, Account account) {

        accountArrayList.add(size++, account);
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


    public List<User> findAllUsers() {
        List<User> userList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            userList.add(i, userArrayList.get(i));
        }
        return userList;
    }

    public List<Account> findAllAccount() {
        List<Account> accountList = new ArrayList<>();

        for (int i = 0; i < size; i++) {
            accountList.add(i, accountArrayList.get(i));
        }
        return accountList;
    }

    public List<Account> getUserAccounts(User user) {
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


    public double withdraw(Account account, double index) {
        double balance = 0;

        if (account.getValue() < 0) {
            System.out.println("Данное действие невозможно");
            return -1;
        } else {
            balance = index--;
        }
        return balance;
    }

    public double deposit(Account account, double index) {
        double balance = 0;

        if (account.getValue() < 0) {
            System.out.println("Данное действие невозможно");
            return -1;
        } else {
            balance = index++;
        }
        return balance;
    }


    //метод для перечисления денег с одного счёта на другой счёт если счёт не найден или не хватает денег на счёте
    //srcAccount (с которого переводят) должен вернуть false.
    public boolean transferMoney(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {

        if (hasMoney() == false) {
            System.out.println("Недостаточно денег");
        }

        for (int i = 0; i < srcAccount.getValue(); i++) {
            if (srcAccount.getValue() < 0) {
                return false;
            } else {
                //System.out.println(String.format("Введите значение: %s", index));
                withdraw(srcAccount, -amount);
                deposit(dstAccount, amount);
            }
        }

        return false;
    }

    public void exit() {
        System.exit(0);
    }
}
