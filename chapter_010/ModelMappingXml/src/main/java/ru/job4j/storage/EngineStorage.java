package ru.job4j.storage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import ru.job4j.models.Engine;

import java.util.ArrayList;
import java.util.List;


public class EngineStorage {
    private static final EngineStorage INSTANSE = new EngineStorage();


    public static EngineStorage getInstance() {
        return INSTANSE;
    }

    SessionFactory factory = HibernateFactory.getSessionFactory();

    public Engine add(Engine engine) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(engine);
            return engine;
        } finally {
            tx.commit();
            session.close();
        }
    }

    public void delete(Engine engine) {
        try (Session session = factory.openSession()) {
            Transaction tx = session.beginTransaction();
            session.delete(engine);

            tx.commit();
        }
    }

    public List<Engine> getAll() {
        List<Engine> engines = new ArrayList<>();

        try (Session session = factory.openSession();) {
            engines.addAll(session.createQuery("from engine").list());
        }
        return engines;
    }

    public Engine update(Engine engine) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.update(engine);
            return engine;
        } finally {
            tx.commit();
            session.close();
        }
    }
}
