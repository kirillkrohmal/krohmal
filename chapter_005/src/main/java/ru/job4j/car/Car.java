package ru.job4j.car;

import java.io.IOException;

public class Car implements AutoCloseable  {

    @Override
    public void close() throws Exception {
        System.out.println("Машина закрывается...");
    }

    public void drive() {
        System.out.println("Машина поехала.");

    }

    public static void main(String[] args) {

        try(Car car = new Car()) {
          car.drive();
        } catch (Exception e) {

        }
    }
}
