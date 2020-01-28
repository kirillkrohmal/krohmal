package ru.job4j.model;

public class Role {
    private String USER;
    private String ADMIN;

    public Role(String USER, String ADMIN) {
        this.USER = USER;
        this.ADMIN = ADMIN;
    }

    public String getUSER() {
        return USER;
    }

    public void setUSER(String USER) {
        this.USER = USER;
    }

    public String getADMIN() {
        return ADMIN;
    }

    public void setADMIN(String ADMIN) {
        this.ADMIN = ADMIN;
    }
}
