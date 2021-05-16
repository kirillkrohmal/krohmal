package ru.job4j.storage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.job4j.models.Car;
import ru.job4j.models.Driver;
import ru.job4j.models.HistoryOwner;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class HistoryOwnerStorage {
    private static final HistoryOwnerStorage INSTANSE = new HistoryOwnerStorage();

    static HistoryOwnerStorage getInstance() {
        return INSTANSE;
    }

    private SessionFactory factory = HibernateFactory.getSessionFactory();

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

    public Car add2(Car car) {
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

    public void delete(int id) {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(new HistoryOwner(id));

            tx.commit();
        }
    }

    public List<HistoryOwner> getAll() {
        List<HistoryOwner> historyOwners = new ArrayList<>();

        try (Session session = factory.openSession();) {
            historyOwners.addAll(session.createQuery("from history_owner").list());
        }
        return historyOwners;
    }

    public Optional<HistoryOwner> findById(int id) {
        Optional<HistoryOwner> result = Optional.empty();
        try (Session session = factory.openSession();) {
            HistoryOwner historyOwner = session.get(HistoryOwner.class, id);

            if (historyOwner != null) {
                result = Optional.of(historyOwner);
            }
        }
        return result;
    }

    public HistoryOwner update(HistoryOwner historyOwner) {
        try (Session session = factory.openSession();) {
            Transaction tx = session.beginTransaction();
            session.update(historyOwner);
            tx.commit();
        }

        return historyOwner;
    }
}
