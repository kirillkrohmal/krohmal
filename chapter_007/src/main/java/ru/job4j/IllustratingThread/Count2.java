package ru.job4j.IllustratingThread;

/**
 * Created by Comp on 29.10.2017.
 */
class Count2 {
    private int value;

    int illustratingThread() {
        return ++this.value;
    }
}
