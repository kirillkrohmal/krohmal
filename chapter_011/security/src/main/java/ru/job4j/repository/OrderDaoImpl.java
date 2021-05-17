package ru.job4j.repository;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query;
import ru.job4j.models.*;



import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;


@Repository
public class OrderDaoImpl implements Dao {

    @Autowired
    private SessionFactory orderDao;


    @Override
    @Transactional
    public List<Orders> getAllOrders() {
        Session session = orderDao.openSession();

        try {
            session.beginTransaction();

            Query<Orders> query = session.createQuery("from Orders", Orders.class);

            return query.getResultList();
        } finally {
            session.getTransaction().commit();
            session.close();
        }
    }


    @Override
    @Transactional
    public void addAll(Orders orders) {
        Session session = orderDao.openSession();

        try {
            session.beginTransaction();
            session.save(orders);
        } finally {
            session.getTransaction().commit();
            session.close();
        }
    }
}
