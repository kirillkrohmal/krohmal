package ru.job4j.storage;

import org.junit.Test;
import ru.job4j.models.Car;
import ru.job4j.models.Engine;

import java.util.List;
import java.util.Optional;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;


public class CarStorageTest {
    private final CarStorage carStorage = CarStorage.getInstance();
    private final EngineStorage engineStorage = EngineStorage.getInstance();

    @Test
    public void testAdd() {
        Engine engine = new Engine();
        engine = engineStorage.add(engine);
        Car car = new Car();
        car.setEngine(engine);

        carStorage.add(car);
        Car result = carStorage.findById(car.getId()).get();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void testDelete() {
        Engine engine = new Engine();
        Car car = new Car();
        car.setEngine(engineStorage.add(engine));
        car = carStorage.add(car);

        carStorage.delete(car.getId());
        engineStorage.delete(engine.getId());
        assertThat(carStorage.findById(car.getId()), is(Optional.<Car>empty()));
    }

    @Test
    public void testGetAll() {
        Engine engine = new Engine();
        engine = engineStorage.add(engine);
        Car car = new Car();
        car.setEngine(engine);

        carStorage.add(car);
        List<Car> result = carStorage.getAll();
        assertThat(result, is(notNullValue()));
    }

    @Test
    public void testUpdate() {
        Engine engine = new Engine();

        Car car = new Car();
        car.setId(1);
        car.setEngine(engineStorage.add(engine));

        carStorage.update(car);
        Car result = carStorage.findById(car.getId()).get();
        assertThat(result, is(notNullValue()));
    }
}