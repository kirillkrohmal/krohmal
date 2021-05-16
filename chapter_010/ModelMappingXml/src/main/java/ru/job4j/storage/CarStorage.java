package ru.job4j.storage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.job4j.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class CarStorage {
    private static final CarStorage INSTANSE = new CarStorage();

    static CarStorage getInstance() {
        return INSTANSE;
    }

    private SessionFactory factory = HibernateFactory.getSessionFactory();

    public Car add(Car car) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(car);
            return car;
        } finally {
            tx.commit();
            session.close();
        }
    }

    public void delete(Car car) {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(car);

            tx.commit();
        }
    }

    public Optional<Car> findById(int id) {
        Optional<Car> result = Optional.empty();
        try (Session session = factory.openSession();) {
            Car car = session.get(Car.class, id);

            if (car != null) {
                result = Optional.of(car);
            }
        }
        return result;
    }

    public List<Car> getAll() {
        List<Car> cars = new ArrayList<>();

        try (Session session = factory.openSession();) {
            cars.addAll(session.createQuery("from car").list());
        }
        return cars;
    }

    public Car update(Car car) {
        try(Session session = factory.openSession();) {
            session.beginTransaction();
            session.update(car);
            session.getTransaction().commit();
        }

        return car;
    }
}
