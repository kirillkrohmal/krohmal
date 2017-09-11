package ru.job4j.ExtraTasksTest.task_017;

import org.junit.Test;
import ru.job4j.ExtraTasks.task_017.MoneyATM;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by Comp on 20.08.2017.
 */
public class MoneyATMTest {
    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange() {
        int[] money = {101};
        int note = 1;
        MoneyATM moneyATM = new MoneyATM(money);
        List<List<Integer>> result = moneyATM.exchange(note);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange2() {
        int[] money = {101};
        int note = 1;
        MoneyATM moneyATM = new MoneyATM(money);
        List<List<Integer>> result = moneyATM.exchange(note);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange3() {
        int[] money = {101};
        int note = 1;
        MoneyATM moneyATM = new MoneyATM(money);
        List<List<Integer>> result = moneyATM.exchange(note);
        int expected = 1;
        assertThat(result, is(expected));
    }

    @Test
    public void whenExchangeBigMoneyToSmallMoneyAndHaveChange4() {
        int[] money = {101};
        int note = 1;
        MoneyATM moneyATM = new MoneyATM(money);
        List<List<Integer>> result = moneyATM.exchange(note);
        int expected = 1;
        assertThat(result, is(expected));
    }
}


