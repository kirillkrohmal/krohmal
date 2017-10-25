package ru.job4j.IllustratingThread;

/**
 * Created by Comp on 29.10.2017.
 */
public class Count2 {
    private int value = 1;

    public int illustratingThread() {
        return ++this.value;
    }
}
