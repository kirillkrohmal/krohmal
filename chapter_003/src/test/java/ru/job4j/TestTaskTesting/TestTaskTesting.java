package ru.job4j.TestTaskTesting;

import org.junit.Test;
import ru.job4j.TestTask.Account;
import ru.job4j.TestTask.Operation;
import ru.job4j.TestTask.User;

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
        Account dstAccount2 = new Account(550000,"1 431 214312");
        Operation operation  = new Operation();
        operation.transferMoney(srcUser, srcAccount, dstUser, dstAccount, 50000);
        boolean expected = true;
        assertThat(operation.transferMoney(srcUser, srcAccount, dstUser, dstAccount, 50000), is(dstAccount2));
    }

    @Test
    public void whenAddUserAndHasSomeUser() {
        User srcUser = new User("Adele", "1809 585123");
        Operation operation  = new Operation();
        operation.addUser(srcUser);
        assertThat(operation.findByPassport(srcUser.getPassport()), is(srcUser));
    }

    @Test
    public void whenDeleteUserAndHasSomeUser() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "17 04 151223");
        Operation operation  = new Operation();
        operation.addUser(srcUser);
        operation.addUser(dstUser);
        operation.deleteUser(srcUser);
        assertThat(operation.findByPassport(dstUser.getPassport()), is(dstUser));
    }

    @Test
    public void whenAddNewAccountToUserAndHasSomeNewAccount() {
        String passport = "1809 585123";
        String requisites = "1 233 215454";
        Operation operation  = new Operation();
        operation.addAccountToUser(passport, requisites);
        Account srcAccount = new Account(1500000, "1 233 215454");
        Account dstAccount = new Account(1520000, "1 223 214554");
        assertThat(operation.findAllAccount(srcAccount.getRequisites()), is(dstAccount));
    }

    @Test
    public void whenDeleteAccountFromUserAndHasSomeNewChange() {
        User srcUser = new User("Adele", "1809 585123");
        User dstUser = new User("Kim", "17 04 151223");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Account dstAccount = new Account(500000,"1 431 214312");
        String passport = "1809 585123";
        String requisites = "1 233 215454";
        String passport2 = "1819 585213";
        String requisites2 = "1 133 213454";
        Operation operation  = new Operation();
        //operation.addAccountToUser(passport, requisites);
        //operation.addAccountToUser(passport2, requisites2);
        operation.deleteAccountFromUser(passport2, requisites2);
        assertThat(operation.findAllAccount(requisites), is(dstAccount));
    }
    @Test
    public void whenGetUserAccountsFromAccountsAndHasSomeAccounts() {
        Account srcAccount = new Account(1500000, "1 233 215454");
        String requisites = "1 233 215454";
        Operation operation = new Operation();
        operation.getUserAccounts(requisites);
        assertThat(operation.findAllAccount(srcAccount.getRequisites()), is(srcAccount));
    }
}


