package ru.job4j.TestTaskTesting;

import org.junit.Test;
import ru.job4j.TestTask.Account;
import ru.job4j.TestTask.Operation;
import ru.job4j.TestTask.User;
import java.util.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 22.08.2017.
 */


public class TestTaskTesting {
    @Test
    public void whenTransferMoneyFromAcouuntToAccontAndHaveTrue() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "17 04 151223");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Account dstAccount = new Account(500000,"1 431 214312");
        Account dstAccount2 = new Account(550000,"1 431 214312");
        Operation operation  = new Operation();
        operation.transferMoney(srcUser, srcAccount, dstUser, dstAccount, 50000);
        //boolean expected = true;
        assertThat(operation.transferMoney(srcUser, srcAccount, dstUser, dstAccount, 50000), is(dstAccount2));
    }

    @Test
    public void whenAddUserAndHasSomeUser() {
        User srcUser = new User("Adele", "1809 585123");
        Operation operation  = new Operation();
        operation.addUser(srcUser);
        assertThat(operation.findAllUsers(), is(srcUser));
    }

    @Test
    public void whenDeleteUserAndHasSomeUser() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "17 04 151223");
        Operation operation  = new Operation();
        operation.addUser(srcUser);
        operation.addUser(dstUser);
        operation.deleteUser(srcUser);
        assertThat(operation.findAllUsers(), is(dstUser));
    }

    @Test
    public void whenAddNewAccountToUserAndHasSomeNewAccount() {
        User srcUser = new User("Adele", "1809 585123");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Operation operation  = new Operation();
        operation.addAccountToUser(srcUser, srcAccount);
        assertThat(operation.findAllAccount(), is(srcAccount));
    }

    @Test
    public void whenDeleteAccountFromUserAndHasSomeNewChange() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "17 04 151223");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Account dstAccount = new Account(500000,"1 431 214312");
        Operation operation  = new Operation();
        operation.addAccountToUser(srcUser, srcAccount);
        operation.addAccountToUser(dstUser, dstAccount);
        operation.deleteAccountFromUser(srcUser, srcAccount);
        assertThat(operation.findAllAccount(), is(dstAccount));
    }
    @Test
    public void whenGetUserAccountsFromAccountsAndHasSomeAccounts() {
        User srcUser = new User("Adele", "1809 585123");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Operation operation  = new Operation();
        operation.getUserAccounts(srcUser);
        assertThat(operation.findAllAccount(), is(srcAccount));
    }
}


