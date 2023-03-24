package ru.job4j.convertthreedignum;

public class Task54 {
    public static void transform(int number) {
        int num1, num2, num3;
        num1 = number / 100;
        num2 = number / 10 % 10;
        num3 = number % 10;

        if (number == 999) {
            System.out.println(num1 + "" + num2 + "" + num3);
        } else if (number < 0) {
            if (number % 2 == 0) {
                if (num1 % 2 == 0 || num1 == 0) {
                    num1--;
                } else if (num1 % 2 != 0 || num1 != 0) {
                    num1++;
                }
                if (num2 % 2 == 0 || num2 == 0) {
                    num2--;
                } else if (num2 % 2 != 0 || num2 != 0) {
                    num2++;
                }
                if (num3 % 2 == 0 || num3 == 0) {
                    num3--;
                } else if (num3 % 2 != 0 || num3 != 0) {
                    num3++;
                }
                System.out.println(num1 + "" + Math.abs(num2) + "" + Math.abs(num3));
            } else if (number % 2 != 0) {
                if (num1 % 2 == 0) {
                    num1++;
                } else if (num1 % 2 != 0 || num1 != 0) {
                    num1--;
                }
                System.out.println(num1 + "" + Math.abs(num2) + "" + Math.abs(num3));
            }
        } else if (number % 2 == 0) {
            if (num1 % 2 == 0 || num1 == 0) {
                num1++;
            } else if (num1 % 2 != 0 || num1 != 0) {
                num1--;
            }
            if (num2 % 2 == 0 || num2 == 0) {
                num2++;
            } else if (num2 % 2 != 0 || num2 != 0) {
                num2--;
            }
            if (num3 % 2 == 0 || num3 == 0) {
                num3++;
            } else if (num3 % 2 != 0 || num3 != 0) {
                num3--;
            } if (num1 == 0) {
                System.out.println(num2 + "" + num3);
            } else {
                System.out.println(num1 + "" + num2 + "" + num3);
            }

        } else if (number % 2 != 0) {
            if (num1 % 2 == 0 || num1 == 0) {
                num1--;
            } else if (num1 % 2 != 0 || num1 != 0) {
                num1++;
            }
            if (num2 % 2 == 0 || num2 == 0) {
                num2--;
            } else if (num2 % 2 != 0 || num2 != 0) {
                num2++;
            }
            if (num3 % 2 == 0 || num3 == 0) {
                num3--;
            } else if (num3 % 2 != 0 || num3 != 0) {
                num3++;
            }
            System.out.println(num1 + "" + num2 + "" + num3);
        }
    }
}
