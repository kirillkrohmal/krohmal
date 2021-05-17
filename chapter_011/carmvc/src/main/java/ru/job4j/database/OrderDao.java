package ru.job4j.database;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class OrderDao {

    private static final SessionFactory FACTORY = new Configuration().configure().buildSessionFactory();

    public OrderDao() {
    }

    public static SessionFactory getSessionFactory() {
        return FACTORY;
    };
}
