package ru.job4j.Practice.practicing;

/**
 * Created by Comp on 14.11.2017.
 */
public interface SomeClass {
    SomeOper s = new SomeOper() {
        @Override
        public void minus() {
            super.minus();
        }
    };


    void add();


}
