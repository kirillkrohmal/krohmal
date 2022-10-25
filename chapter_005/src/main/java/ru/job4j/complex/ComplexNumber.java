package ru.job4j.complex;

import java.util.Objects;

public class ComplexNumber {
    double re;
    double im;

    public boolean equals(Object o) {
        if (this == o) {
           return true;

        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ComplexNumber number = (ComplexNumber) o;

        return Double.compare(number.re, re) == 0 && Double.compare(number.im, im) == 0;
    }

    public int hashcode() {
        int hash;
        long temp;
        temp = Double.doubleToLongBits(re);
        hash = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(im);
        hash = 31 * hash + (int) (temp ^ (temp >>> 32));
        return hash;
    }
}
