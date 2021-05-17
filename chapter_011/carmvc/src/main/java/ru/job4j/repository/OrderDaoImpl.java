package ru.job4j.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.query.Query;
import ru.job4j.database.OrderDao;
import ru.job4j.models.*;

import java.util.List;


@Repository
public class OrderDaoImpl implements Dao {

    private SessionFactory orderDao = OrderDao.getSessionFactory();

    @Autowired
    public void setOrderDao(SessionFactory orderDao) {
        this.orderDao = orderDao;
    }

    @Override
    @Transactional
    public List<Orders> getAllOrders() {
        Session session = orderDao.openSession();

        try {
            session.beginTransaction();

            //SELECT brand, model, year, description, price, name, sold, description, image from ((orders o join cars c on o.car_id = c.id) join users u on o.users_id=u.id)
            //Query query = session.createQuery("from Orders join fetch car_id, join fetch users_id", Orders.class);
            //Query query = session.createQuery("from Orders o join cars on o.car_id = :carId join users on o.users_id = :usersId", Orders.class);
            //Query query = session.createQuery("from Orders o join cars on o.car_id = :carId join users on o.users_id = :usersId", Orders.class);
            //Query query = session.createQuery("from Orders o where car_id = :carId and users_id = :usersId", Orders.class);
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
