package ru.job4j.models;

import org.springframework.ui.Model;

import javax.persistence.*;


@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private int price;

    @Column(name = "sold")
    private boolean sold;

    @ManyToOne
    @JoinColumn(name = "body_name")
    private Body body;

    @ManyToOne
    @JoinColumn(name = "brand_name")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "engine_name")
    private Engine engine;

    @ManyToOne
    @JoinColumn(name = "model_name")
    private Models model;

    @Lob
    @Column(name = "image")
    private byte[] image;

    @Column(name = "str")
    private String imageStr;


    public Orders() {
    }

    public Orders(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isSold() {
        return sold;
    }

    public void setSold(boolean sold) {
        this.sold = sold;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
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

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Models getModel() {
        return model;
    }

    public void setModel(Models model) {
        this.model = model;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getImageStr() {
        return imageStr;
    }

    public void setImageStr(String imageStr) {
        this.imageStr = imageStr;
    }
}


