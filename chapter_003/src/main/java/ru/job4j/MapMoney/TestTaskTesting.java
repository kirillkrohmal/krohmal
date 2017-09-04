package ru.job4j.MapMoney;

import org.junit.Test;
import ru.job4j.TestTask.Account;
import ru.job4j.TestTask.Operation;
import ru.job4j.TestTask.User;

import static com.sun.org.apache.xerces.internal.util.PropertyState.is;
import static org.junit.Assert.assertThat;
import static org.hamcrest.core.Is.is;



public class TestTaskTesting {
    @Test
    public void whenGetUserAccountsFromAccountsAndHasSomeAccounts() {
        User srcUser = new User("Adele", "1809 585123");
        Account srcAccount = new Account(1500000, "1 233 215454");
        Operation operation  = new Operation();
        operation.getUserAccounts("6");
        //assertThat(operation.findAllAccount(), is(srcAccount));
    }
}
