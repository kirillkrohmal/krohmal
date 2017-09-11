package ru.job4j.TestTask2;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Comp on 30.08.2017.
 */
public class FirmsCode {
    public String primaryKey;
    String secondaryKey;
    String tertiaryKey;

    public FirmsCode(String primaryKey, String secondaryKey, String tertiaryKey) {
        this.primaryKey = primaryKey;
        this.secondaryKey = secondaryKey;
        this.tertiaryKey = tertiaryKey;
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getSecondaryKey() {
        return secondaryKey;
    }

    public void setSecondaryKey(String secondaryKey) {
        this.secondaryKey = secondaryKey;
    }

    public String getTertiaryKey() {
        return tertiaryKey;
    }

    public void setTertiaryKey(String tertiaryKey) {
        this.tertiaryKey = tertiaryKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FirmsCode firmsCode = (FirmsCode) o;

        if (primaryKey != null ? !primaryKey.equals(firmsCode.primaryKey) : firmsCode.primaryKey != null) return false;
        if (secondaryKey != null ? !secondaryKey.equals(firmsCode.secondaryKey) : firmsCode.secondaryKey != null)
            return false;
        return tertiaryKey != null ? tertiaryKey.equals(firmsCode.tertiaryKey) : firmsCode.tertiaryKey == null;
    }

    @Override
    public int hashCode() {
        int result = primaryKey != null ? primaryKey.hashCode() : 0;
        result = 31 * result + (secondaryKey != null ? secondaryKey.hashCode() : 0);
        result = 31 * result + (tertiaryKey != null ? tertiaryKey.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "FirmsCode{" +
                "primaryKey='" + primaryKey + '\'' +
                ", secondaryKey='" + secondaryKey + '\'' +
                ", tertiaryKey='" + tertiaryKey + '\'' +
                '}';
    }

    public String getCompleteName() {
        return this.getPrimaryKey() + "'\'" + this.getSecondaryKey() + "'\'" + this.getTertiaryKey();
    }
}
