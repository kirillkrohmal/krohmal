package ru.job4j.generictype;


public class Box<T> {
   private T box;


   public <T> Box <T> getBox() {
       return new Box<>();
   }
}
