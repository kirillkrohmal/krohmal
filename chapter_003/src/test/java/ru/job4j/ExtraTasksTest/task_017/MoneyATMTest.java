package ru.job4j.ExtraTasksTest.task_017;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_017.MoneyATM;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class MoneyATMTest {
    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange() {
        int money = 101;
        int denM = 1;
        MoneyATM moneyATM = new MoneyATM();
        int[] result = moneyATM.exchangeMoney(money, denM);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange2() {
        int money = 101;
        int denM = 1;
        MoneyATM moneyATM = new MoneyATM();
        int[] result = moneyATM.exchangeMoney(money, denM);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange3() {
        int money = 101;
        int denM = 1;
        MoneyATM moneyATM = new MoneyATM();
        int[] result = moneyATM.exchangeMoney(money, denM);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange4() {
        int money = 101;
        int denM = 1;
        MoneyATM moneyATM = new MoneyATM();
        int[] result = moneyATM.exchangeMoney(money, denM);
        int expected = 1;
        assertThat(result, is(expected));
    }
}


