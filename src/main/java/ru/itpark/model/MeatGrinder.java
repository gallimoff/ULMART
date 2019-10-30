package ru.itpark.model;


public class MeatGrinder extends AbstractProduct {
    private int power;
    private String color;

    public MeatGrinder(long id, String category,  String name, int price, int rating, int power, String color) {
        super(id, category, name, price, rating);
        this.power = power;
        this.color = color;
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
        result = result +
                " name: " + super.getName() +
                " price: " + super.getPrice() + " rubles " +
                " power: " + power + " color: " + color;
        return result;
    }
}
