package ru.job4j.Practice.Example_3;

import java.util.HashMap;

class ResponseCASoap {
    HashMap propertyMap;
    String log = "";
    String result = "ERROR";

    public HashMap getPropertyMap() {
        return propertyMap;
    }

    public void setPropertyMap(
            HashMap parametrMap) {
        this.propertyMap = parametrMap;
    }
}
