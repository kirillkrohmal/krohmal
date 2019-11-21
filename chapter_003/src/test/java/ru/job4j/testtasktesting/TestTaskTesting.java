package ru.job4j.testtasktesting;

import org.junit.Test;
import ru.job4j.testtask.Account;
import ru.job4j.testtask.Operation;
import ru.job4j.testtask.User;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 22.08.2017.
 */


public class TestTaskTesting {
    @Test
    public void whenTransferMoneyFromAcouuntToAccontAndHaveTrue() {
        String srcUser = "Adele";
        String dstUser = "Kim";
        String srcAccount = "1 233 215454";
        String dstAccount = "1 431 214312";
        Account dstAccount2 = new Account(550000, "1 431 214312");
        Account srcAccount2 = new Account(500000, "1 233 215454");
        Operation operation = new Operation();
        operation.transferMoney(srcUser, srcAccount, dstUser, dstAccount, 50000);
        boolean result = false;
        assertThat(operation.transferMoney(srcUser, srcAccount, dstUser, dstAccount, 50000), is(result));
    }

    @Test
    public void whenAddUserAndHasSomeUser() {
        User srcUser = new User("Adele", "1809 585123");
        Operation operation = new Operation();
        operation.addUser(srcUser);
        assertThat(operation.findByPassport(srcUser.getPassport()), is(srcUser));
    }

    @Test
    public void whenDeleteUserAndHasSomeUser() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "17 04 151223");
        Operation operation = new Operation();
        operation.addUser(srcUser);
        operation.addUser(dstUser);
        operation.deleteUser(srcUser);
        assertThat(operation.findByPassport(dstUser.getPassport()), is(dstUser));
    }

    @Test
    public void whenAddNewAccountToUserAndHasSomeNewAccount() {
        Operation operation = new Operation();
        String passport = "1809 585123";
        String requisites = "1 233 215454";
        User srcUser = new User("Adele", "1809 585123");
        Account srcAccount = new Account(1500000, "1 233 215454");
        operation.addUser(srcUser);
        operation.addAccountToUser(passport, srcAccount);
        assertThat(operation.findAccountByRequisites(requisites), is(srcAccount));
    }

    @Test
    public void whenDeleteAccountFromUserAndHasSomeNewChange() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "1812 523423");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Account dstAccount = new Account(500000, "1 431 214312");
        String passport = "1809 585123";
        String passport2 = "1812 523423";
        String requisites = "1 233 215454";
        String requisites2 = "1 431 214312";
        Operation operation = new Operation();
        operation.addUser(srcUser);
        operation.addUser(dstUser);
        operation.addAccountToUser(passport, srcAccount);
        operation.addAccountToUser(passport2, dstAccount);
        operation.deleteAccountFromUser(passport2, dstAccount);
        assertThat(operation.findAccountByRequisites(requisites), is(srcAccount));
    }

    @Test
    public void whenGetUserAccountsFromAccountsAndHasSomeAccounts() {
        User srcUser = new User("Adele", "1809 585123");
        Account srcAccount = new Account(1500000, "1 233 215454");
        User dstUser = new User("Kim", "1812 523423");
        Account dstAccount = new Account(500000, "1 431 214312");
        String passport = "1809 585123";
        String passport2 = "1812 523423";
        String requisites = "1 233 215454";
        String requisites2 = "1 431 214312";
        Operation operation = new Operation();
        operation.addUser(srcUser);
        operation.addUser(dstUser);
        operation.addAccountToUser(passport, srcAccount);
        operation.addAccountToUser(passport2, dstAccount);
        assertThat(operation.findAccountByRequisites(requisites), is(srcAccount));
    }
}


