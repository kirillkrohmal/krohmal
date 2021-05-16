package ru.job4j;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.job4j.models.User;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;


public class HibernateRun {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure()
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        User user = new User();
        user.setName("Vasya");

        Calendar calendar = new GregorianCalendar(2017, Calendar.MARCH, 25);
        user.setExpired(calendar);

        session.save(user);

        List<User> users = session.createQuery("from User").list();

        for (User user1 : users) {
            System.out.println(user1.getName());
            System.out.println(user1.getExpired());
        }

        User user2 = new User();
        user.setName("Petya");

        Calendar calendar2 = new GregorianCalendar(2018, Calendar.APRIL, 13);
        user.setExpired(calendar2);

        session.saveOrUpdate(user2);

        for (User user1 : users) {
            System.out.println(user1.getName());
            System.out.println(user1.getExpired());
        }

        session.delete("delete from userhiber where id=?", user2);

        for (User user1 : users) {
            System.out.println(user1.getName());
            System.out.println(user1.getExpired());
        }

        session.getTransaction().commit();

        session.close();
        factory.close();

    }
}
