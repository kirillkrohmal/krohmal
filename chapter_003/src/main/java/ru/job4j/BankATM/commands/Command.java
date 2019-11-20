package ru.job4j.BankATM.commands;

import ru.job4j.BankATM.exception.NotEnoughMoneyException;

/**
 * Created by Comp on 12.09.2017.
 */
public interface Command {
    void execute() throws NotEnoughMoneyException;
}
