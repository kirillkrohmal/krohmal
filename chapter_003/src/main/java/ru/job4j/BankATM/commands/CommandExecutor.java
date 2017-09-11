package ru.job4j.BankATM.commands;

import ru.job4j.BankATM.Operation;
import ru.job4j.BankATM.exception.NotEnoughMoneyException;

import java.util.Map;

/**
 * Created by Comp on 12.09.2017.
 */
public class CommandExecutor {
    public static Map<Operation, Command> commandMap;

    public CommandExecutor(Map<Operation, Command> commandMap) {
        this.commandMap = commandMap;
    }

    public Map<Operation, Command> getCommandMap() {
        return commandMap;
    }

    public void setCommandMap(Map<Operation, Command> commandMap) {
        this.commandMap = commandMap;
    }
    /**
     * Метод который будет дергать метод execute у нужной команды. Реализуйте эту логику.
     * Расставьте правильно модификаторы доступа учитывая, что единственная точка входа - это метод execute.
     */
    static {
        commandMap.put(Operation.INFO, new InfoCommand());
        commandMap.put(Operation.LOGIN, new LoginCommand());
        commandMap.put(Operation.DEPOSIT, new DepositCommand());
        commandMap.put(Operation.WITHDRAW, new WithdrawCommand());
        commandMap.put(Operation.EXIT, new ExitCommand());
    }

    public static final void execute(Operation operation) throws NotEnoughMoneyException {
        commandMap.get(operation).execute();
    }
}
