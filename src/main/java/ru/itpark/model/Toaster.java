package ru.itpark.model;


public class Toaster extends AbstractProduct {
    private String compartment;
    private int power;
    private String color;

    public Toaster(long id, String category,  String name, int price, int rating, String compartment, int power, String color) {
        super(id, category, name, price, rating);
        this.compartment = compartment;
        this.power = power;
        this.color = color;
    }

    public String getCompartment() {
        return compartment;
    }

    public void setCompartment(String compartment) {
        this.compartment = compartment;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String result = super.getCategory();
        result = result  +
                " name: " + super.getName()  +
                " price: " + super.getPrice() + " rubles " +
                " compartment: "+ compartment + " power: " + power + " color: "+ color;
        return result;
    }
}

