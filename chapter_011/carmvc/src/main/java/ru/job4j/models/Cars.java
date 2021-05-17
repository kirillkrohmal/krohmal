package ru.job4j.models;


import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "cars")
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "engine_power")
    private int enginePower;

    @Column(name = "year")
    private int year;

    @Column(name = "color")
    private String color;

    @Column(name = "milliage")
    private int milliage;

    @ManyToOne
    @JoinColumn(name = "body_id")
    private Body body;

    @ManyToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "model_id")
    private Model model;

    @ManyToOne
    @JoinColumn(name = "engine_id")
    private Engine engine;

    public Cars() {
    }

    public Cars(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMilliage() {
        return milliage;
    }

    public void setMilliage(int milliage) {
        this.milliage = milliage;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Model getModel() {
        return model;
    }

    public void setModel(Model model) {
        this.model = model;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cars cars = (Cars) o;
        return id == cars.id &&
                enginePower == cars.enginePower &&
                year == cars.year &&
                milliage == cars.milliage &&
                Objects.equals(color, cars.color) &&
                Objects.equals(body, cars.body) &&
                Objects.equals(brand, cars.brand) &&
                Objects.equals(model, cars.model) &&
                Objects.equals(engine, cars.engine);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, enginePower, year, color, milliage, body, brand, model, engine);
    }
}
