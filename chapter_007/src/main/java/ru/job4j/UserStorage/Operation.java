package ru.job4j.UserStorage;

/**
 * Created by Comp on 29.10.2017.
 */
public class Operation {
    public static void main(String[] args) {

        UserStorage stoge = new UserStorage();
        stoge.add(new User(2, 200));

        stoge.transfer(1, 2, 50);
    }
}
