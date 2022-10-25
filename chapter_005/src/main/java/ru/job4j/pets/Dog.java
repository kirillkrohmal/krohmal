package ru.job4j.pets;

import org.w3c.dom.ls.LSOutput;

public class Dog {
   public void sayHello() {
       System.out.println("Гав!");

   }

    public void catchCat(Cat cat) {

        System.out.println("Кошка поймана");
        sayHello();
        cat.sayHello();
    }


}
