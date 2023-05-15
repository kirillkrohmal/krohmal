package ru.job4j.outputnearestroundnum;

public class Task44 {
    public static void getRoundNumber(int number) {

        int lowerNumber = (number / 10) * 10;
        int upperNumber = lowerNumber + 10;

        int closestNumber = (number - lowerNumber < upperNumber - number) ? lowerNumber : upperNumber;

        System.out.println(closestNumber);
    }
}
