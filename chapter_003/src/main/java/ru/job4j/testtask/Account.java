package ru.job4j.testtask;

/**
 * Created by Comp on 12.06.2017.
 */
public class Account {
    private int value;
    private String requisites;

    public Account(int value, String requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getRequisites() {
        return requisites;
    }

    public void setRequisites(String requisites) {
        this.requisites = requisites;
    }

    @Override
    public String toString() {
        return "Account{" +
                "value=" + value +
                ", requisites='" + requisites + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (value != account.value) return false;
        return requisites != null ? requisites.equals(account.requisites) : account.requisites == null;
    }

    @Override
    public int hashCode() {
        int result = value;
        result = 31 * result + (requisites != null ? requisites.hashCode() : 0);
        return result;
    }
}
