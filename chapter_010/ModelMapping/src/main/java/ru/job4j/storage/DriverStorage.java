package ru.job4j.storage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import ru.job4j.models.Car;
import ru.job4j.models.Driver;
import ru.job4j.models.HistoryOwner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class DriverStorage {
    private static final DriverStorage INSTANSE = new DriverStorage();


    public static DriverStorage getInstance() {
        return INSTANSE;
    }

    SessionFactory factory = HibernateFactory.getSessionFactory();

    public Driver add(Driver driver) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(driver);
            return driver;
        } finally {
            tx.commit();
            session.close();
        }
    }

    public void delete(int id) {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(new Driver(id));

            tx.commit();
        }
    }

    public Optional<Driver> findById(int id) {
        Optional<Driver> result = Optional.empty();
        try (Session session = factory.openSession();) {
            Driver driver = session.get(Driver.class, id);

            if (driver != null) {
                result = Optional.of(driver);
            }
        }
        return result;
    }

    public List<Driver> getAll() {
        List<Driver> drivers = new ArrayList<>();

        try (Session session = factory.openSession();) {
            drivers.addAll(session.createQuery("from driver").list());
        }
        return drivers;
    }

    public Driver update(Driver driver) {
        try(Session session = factory.openSession();) {
            session.beginTransaction();
            session.update(driver);
            session.getTransaction().commit();
        }

        return driver;
    }
}
