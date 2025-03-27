package com.jmc.week5.fruitmanagement.model;

public class Fruit {
    private static int id=0;
    private int fruitId;
    private String name;
    private  double price;

    private String origin;
    public Fruit( int id,String name, double price, String origin) {
        this.fruitId = id;
        this.name = name;
        this.price = price;

        this.origin = origin;
    }

    public Fruit( String name, double price, String origin) {
        this.fruitId = id++;
        this.name = name;
        this.price = price;

        this.origin = origin;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Fruit.id = id;
    }

    public int getFruitId() {
        return fruitId;
    }

    public void setFruitId(int fruitId) {
        this.fruitId = fruitId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }



    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitId=" + fruitId +
                ", name='" + name + '\'' +
                ", price='" + price + '\'' +

                ", origin='" + origin + '\'' +
                '}';
    }
}
