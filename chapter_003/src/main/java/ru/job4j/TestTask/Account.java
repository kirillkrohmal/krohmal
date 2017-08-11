package ru.job4j.TestTask;

import java.util.List;
import java.util.Map;

/**
 * Реализовать коллекцию Map для банка
 * Необходимо создать класс User с полями name, passport.
 * Добавить методы eqauls() hashCode()
 * Необходимо создать класс Account с полями value (кол-во денег), requisites (реквизиты счёта) - это банковский счёт.
 * Реализовать коллекцию Map <User, List<Account>>, обозначающую что у каждого пользователя может быть список банковских счетов.
 * Необходимо реализовать возможность перечислять деньги, как с одного счёта User на другой счёт того же User, так и на счёт другого User.
 * В программе должны быть методы:
 * public void addUser(User user) {} - добавление пользователя.
 * public void deleteUser(User user) {} - удаление пользователя.
 * public void addAccountToUser(User user, Account account) {} - добавить счёт пользователю.
 * public void deleteAccountFromUser(User user, Account account) {} - удалить один счёт пользователя.
 * public List<Accounts> getUserAccounts (User user) {} - получить список счетов для пользователя.
 * public boolean transferMoney (User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) -
 * метод для перечисления денег с одного счёта на другой счёт
 * если счёт не найден или не хватает денег на счёте srcAccount (с которого переводят) должен вернуть false.
 */
public class Account {
    private int value;
    private String requisites;

    public Map<User, List<Account>> listOfBankRequisites(List<Account> accounts) {

        return null;
    }

    public void addUser(User user) {

    }

    public void deleteUser(User user) {

    }

    public void addAccountToUser(User user, Account account) {

    }

    public void deleteAccountFromUser(User user, Account account) {

    }

    public List<Account> getUserAccounts(User user) {

        return null;
    }

    public boolean transferMoney (User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {

        return false;
    }
}
