package com.demo.repository;

import com.demo.models.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

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
