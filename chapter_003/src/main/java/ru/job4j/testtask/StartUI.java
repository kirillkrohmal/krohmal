package ru.job4j.testtask;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Comp on 03.09.2017.
 */
public class StartUI {
    Map<User, List<Account>> mapMoney = new HashMap<>();
    private double draw;
    private double dep;
    Operation operation = new Operation();

    public StartUI(Operation operation) {
        this.operation = operation;
    }

    public double withdraw(Account account, double index) {
        double balance = 0;

        if (account.getValue() < 0) {
            System.out.println("Данное действие невозможно");
            return -1;
        } else {
            balance = index--;
        }
        return balance;
    }

    public double deposit(Account account, double index) {
        double balance = 0;

        if (account.getValue() < 0) {
            System.out.println("Данное действие невозможно");
            return -1;
        } else {
            balance = index++;
        }
        return balance;
    }

    public boolean hasMoney() {
        boolean result = true;
        if (mapMoney.isEmpty()) {
            result = false;
        } else {
            int count = 0;
            for (Map.Entry<User, List<Account>> entry : mapMoney.entrySet()) {
                if (entry.getValue() == null) {
                    count++;
                }
            }
            if (count == mapMoney.size()) {
                result = false;
            }
        }
        return result;
    }

    public void init(User srcUser, Account srcAccount, User dstUser, Account dstAccount, double amount) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        amount = 10000;

        if (hasMoney() == false) {
            System.out.println("Недостаточно денег");
        }

        switch (n) {
            case 1:
                System.out.print("Enter money to be withdrawn:");
                draw = withdraw(srcAccount, 100);
                draw = s.nextInt();
                if (amount >= draw) {
                    amount = amount - srcAccount.getValue();
                    System.out.println("Please collect your money");
                } else {
                    System.out.println("Insufficient Balance");
                }
                System.out.println("");
                break;

            case 2:
                System.out.print("Enter money to be deposited:");
                dep = deposit(dstAccount, 1001);
                dep = s.nextInt();
                dep = amount + dep;
                System.out.println("Your Money has been successfully depsited");
                System.out.println("");
                break;

            case 3:
                System.out.println("Balance : " + amount);
                System.out.println("");
                break;

            case 4:
                System.exit(0);
        }
    }

    public static void main(String[] args) {
        Operation operation = new Operation();
        //new StartUI(operation).init(User, );
        //operation.transferMoney();
    }
}
