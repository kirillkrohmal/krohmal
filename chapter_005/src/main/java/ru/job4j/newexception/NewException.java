package ru.job4j.newexception;

public class NewException {

    public void testExp() {
        throw new MyNewException("error");
    }

    public static void main(String[] args) {
        NewException newException = new NewException();
        newException.testExp();
    }
}
