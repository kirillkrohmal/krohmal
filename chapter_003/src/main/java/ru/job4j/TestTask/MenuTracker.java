package ru.job4j.TestTask;

import ru.job4j.TestTask.Task;
import ru.job4j.TestTask.action.BaseAction;
import ru.job4j.TestTask.action.UserAction;
import ru.job4j.TestTask.input.Input;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Comp on 12.06.2017.
 */

public class MenuTracker {
    private Input input;
    private Operation operation;
    List<UserAction> userAction = new ArrayList<>(9);

    private int position = 1;

    public MenuTracker(Input input, Operation operation) {
        this.input = input;
        this.operation = operation;
    }

    public void fillActions() {
        this.userAction.add(null);
        this.userAction.add(position++, new AddUser(input, operation));
        this.userAction.add(position++, new ListOfBankAccount(input, operation));
        this.userAction.add(position++, new DeleteAccountFromUser(input, operation));
        this.userAction.add(position++, new DeleteUser(input, operation));
        this.userAction.add(position++, new GetUserAccounts(input, operation));
        this.userAction.add(position++, new TransferMoney(input, operation));
        this.userAction.add(position++, new Exit(input, operation));
    }

    public void select(int key) {
        this.userAction.get(key).execute(this.input, operation);
    }

    public void show() {
        for (UserAction action : userAction) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class DeleteAccountFromUser extends BaseAction {

        public DeleteAccountFromUser(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 6;
        }

        @Override
        public String name() {
            return "Delete account from User.";
        }

        @Override
        public void execute(Input input, Operation operation) {
            String id = input.ask("Please enter task's id: ");
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(id, name);
            //operation.deleteAccountFromUser();
            System.out.println(String.format("%s", task));
        }
    }

    private class AddAccountToUser extends BaseAction {
        public AddAccountToUser(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Operation operation) {
            String id = input.ask("Please enter task's id: ");
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(id, name);
            //operation.addAccountToUser();
            System.out.println(String.format("%s", task));
        }

        @Override
        public String name() {
            return "Find item by Id.";
        }

    }

    private class TransferMoney extends BaseAction {


        public TransferMoney(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 5;
        }

        @Override
        public void execute(Input input, Operation operation) {
            String id = input.ask("Please enter task's id: ");
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(id, name);
            //operation.addAccountToUser();
            System.out.println(String.format("%s", task));
        }

        @Override
        public String name() {
            return "Transfer money by Id.";
        }

    }

    private class GetUserAccounts extends BaseAction {

        public GetUserAccounts(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 3;
        }

        @Override
        public void execute(Input input, Operation operation) {
            String id = input.ask("Please enter task's id: ");
            String desc = input.ask("Please enter task's desc: ");
            String key = input.ask("Please enter task's key: ");
            long creat = System.currentTimeMillis();
            String name = input.ask("Please enter task's name: ");
            ru.job4j.TrackerList.Task task = new ru.job4j.TrackerList.Task(key, id, name, desc, creat);
            task.setId(String.valueOf(id));
            //operation.getUserAccounts();
        }

        @Override
        public String name() {
            return "Get User Accounts.";
        }

    }

    private class DeleteUser extends BaseAction {

        public DeleteUser(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 4;
        }

        @Override
        public void execute(Input input, Operation operation) {
            String name = input.ask("Please enter task's name: ");
            Task task = new Task(name);
            operation.deleteUser(task);
        }

        @Override
        public String name() {
            return "Delete User.";
        }

    }

    private class Exit extends BaseAction {
        public Exit(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 7;
        }

        @Override
        public String name() {
            return "Exit Program";
        }

        @Override
        public void execute(Input input,  Operation operation) {
            operation.exit();
        }
    }

    private class AddUser extends BaseAction {

        public AddUser(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 1;
        }

        @Override
        public void execute(Input input, Operation operation) {
            String name = input.ask("Please enter task's name: ");
            String passport = input.ask("Please enter task's passport: ");
            operation.addUser(new Task(name, passport));
        }

        @Override
        public String name() {
            return "Add the new User.";
        }

    }

    private static class ListOfBankAccount extends BaseAction {

        public ListOfBankAccount(Input input, Operation operation) {
            super(input, operation);
        }

        @Override
        public int key() {
            return 2;
        }

        @Override
        public void execute(Input input, Operation operation) {
            for (Account account : operation.findAllAccount()) {
                System.out.println(
                        //String.format("%s. %s. %s. %s. %s", item.getId(), item.getName(), item.getKey(), item.getDesc(), item.getCreated())
                );
            }
        }

        @Override
        public String name() {
            return "Show all Account.";
        }
    }
}
