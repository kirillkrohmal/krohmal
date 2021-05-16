package ru.job4j.models;



import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;


public class Car {
    private int id;
    private Engine engine;

    public Car() {
    }

    public Car(Engine engine) {
        this.engine = engine;
    }

    public Car(int id) {
        this.id = id;
    }

    private Set<Driver> driver = new HashSet<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //@JoinColumn(name = "engine_id", foreignKey = @ForeignKey(name = "car_engine_id_fkey"))

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Set<Driver> getDriver() {
        return driver;
    }

    public void setDriver(Set<Driver> driver) {
        this.driver = driver;
    }

    public void addDriver(Driver drivers) {
        if (driver == null) {
            driver = new TreeSet<>();
        }
        driver.add(drivers);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                Objects.equals(engine, car.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, engine);
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", engine=" + engine +
                '}';
    }
}
