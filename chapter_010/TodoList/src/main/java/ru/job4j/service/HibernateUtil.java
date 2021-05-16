package ru.job4j.service;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import ru.job4j.models.Item;

import java.util.ArrayList;
import java.util.List;

public class HibernateUtil {
    private SessionFactory factory;

    private HibernateUtil() {
        factory = new Configuration().configure().buildSessionFactory();
    };

    private static final HibernateUtil INSTANCE = new HibernateUtil();

    public static HibernateUtil getInstance() {
        return INSTANCE;
    }

    public void add (Item item) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.save(item);
        } finally {
            tx.commit();
            session.close();
        }
    }

    public void delete (int id) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            session.delete(id);
        } finally {
            tx.commit();
            session.close();
        }
    }


    public void updateStatus (int id, boolean done) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();

        try {
            Item item = session.get(Item.class, id);
            item.setId(id);
            item.setDone(done);
            session.update(item);
        } finally {
            tx.commit();
            session.close();
        }
    }

    public List<Item> getAllItems(boolean done) {

        Transaction tx = null;

        List<Item> items = new ArrayList<>();
        try(Session session = factory.openSession()) {
            tx = session.beginTransaction();
            items = !done ? session.createQuery("from Item").list() : session.createQuery("from Item where done = true").list();
            session.get(Item.class, done);
            tx.commit();
        } catch (HibernateException ex) {
            ex.getMessage();
            if (tx != null) {
                tx.rollback();
            }
        }

        return items;
    }
}
