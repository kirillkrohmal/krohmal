package ru.job4j;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ru.job4j.models.Car;
import ru.job4j.models.Driver;
import ru.job4j.models.Engine;
import ru.job4j.models.HistoryOwner;

import java.util.List;


public class Demo {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Car.class)
                .addAnnotatedClass(Driver.class)
                .addAnnotatedClass(Engine.class)
                .addAnnotatedClass(HistoryOwner.class)
                .buildSessionFactory();

        Session session = factory.openSession();
        session.beginTransaction();

        Car car = new Car();

        Engine engine = new Engine();
        engine.setId(1);

        car.setId(1);
        car.setEngine(engine);

        List<Car> cars = session.createQuery("from Car").list();

        session.save(engine);
        session.save(car);

        for (Car car1 : cars) {
            System.out.println(car1.getEngine());
        }

        session.delete("delete from car where id=?", car);

        for (Car car1 : cars) {
            System.out.println(car1.getEngine());
        }

        session.getTransaction().commit();

        session.close();
        factory.close();

    }
}
