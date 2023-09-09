package ru.job4j.userstorage;

/**
 * Created by Comp on 29.10.2017.
 */
public class Operation implements Runnable {
    public static void main(String[] args) {
        UserStorage stoge = new UserStorage();

        stoge.add(new User(1, 100));
        stoge.add(new User(2, 200));

        //stoge.transfer(1, 2, 50);

        System.out.println(stoge);
    }

    @Override
    public void run() {

    }
}
