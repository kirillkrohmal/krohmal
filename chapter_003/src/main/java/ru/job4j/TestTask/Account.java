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

    public Account(int value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (value != account.value) return false;
        return requisites != null ? requisites.equals(account.requisites) : account.requisites == null;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (requisites != null ? requisites.hashCode() : 0);
        return result;
    }
}
