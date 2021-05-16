package ru.job4j.storage;

import org.hamcrest.CoreMatchers;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import ru.job4j.models.Car;
import ru.job4j.models.Driver;
import ru.job4j.models.Engine;
import ru.job4j.models.HistoryOwner;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Optional;


import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNull.notNullValue;
import static org.junit.Assert.assertThat;


public class HistoryOwnerStorageTest {

    private final CarStorage carStorage = CarStorage.getInstance();
    private final DriverStorage driverStorage = DriverStorage.getInstance();
    private final HistoryOwnerStorage historyOwnerStorage = HistoryOwnerStorage.getInstance();
    private SessionFactory factory = HibernateFactory.getSessionFactory();

    @Test
    public void testAdd() {
        Session session = factory.openSession();
        Car car = new Car(1);
        session.beginTransaction();
        session.save(car);

        Driver driver = new Driver(1);
        car.addDriver(driver);

        session.save(driver);

        session.getTransaction().commit();
        assertThat(car, is(notNullValue()));
    }

    @Test
    public void testGetAll() {
        Car car = new Car();
        car = carStorage.add(car);

        Driver driver = new Driver();
        driver = driverStorage.add(driver);

        HistoryOwner historyOwner = new HistoryOwner();

        historyOwner.setId(historyOwner.getId());


        //historyOwnerStorage.add(historyOwner);

        HistoryOwner result = historyOwnerStorage.findById(historyOwner.getId()).get();
        assertThat(result, is(notNullValue()));

        assertThat(result, CoreMatchers.notNullValue());
    }

    @Test
    public void testUpdate() {
        Session session = factory.openSession();
        Car car = new Car();
        session.beginTransaction();
        session.save(car);

        Driver driver = new Driver();
        car.addDriver(driver);
        car.setId(1);
        driver.setId(1);

        session.save(driver);

        session.update(car);
        session.update(driver);
        session.getTransaction().commit();

        assertThat(car, CoreMatchers.is(CoreMatchers.notNullValue()));
    }

    @Test
    public void testDelete() {
        Session session = factory.openSession();
        Car car = new Car();
        session.beginTransaction();

        Driver driver = new Driver();
        car.addDriver(driver);

        driver.addCar(car);

        car.setId(1);
        driver.setId(1);

        session.delete(car);
        session.delete(driver);

        session.getTransaction().commit();
        assertThat(null, CoreMatchers.is(Optional.<Car>empty()));
    }
}