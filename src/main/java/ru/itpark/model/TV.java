package ru.itpark.model;


public class TV extends AbstractProduct {
    private int diagonal;
    private String hdFormat;
    private String color;
    private String digitalTvStandard;

    public TV(long id, String category,  String name, int price, int rating, int diagonal, String hdFormat, String color, String digitalTvStandard) {
        super(id, category, name, price, rating);
        this.diagonal = diagonal;
        this.hdFormat = hdFormat;
        this.color = color;
        this.digitalTvStandard = digitalTvStandard;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String getHdFormat() {
        return hdFormat;
    }

    public void setHdFormat(String hdFormat) {
        this.hdFormat = hdFormat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDigitalTvStandard() {
        return digitalTvStandard;
    }

    public void setDigitalTvStandard(String digitalTvStandard) {
        this.digitalTvStandard = digitalTvStandard;
    }

    @Override
    public String toString() {
        String result = super.getCategory();
        result = result +
                " name: " + super.getName() +
                " price: " + super.getPrice() + " rubles " +
                " diagonal: " + diagonal + " hdFormat: " + hdFormat + " color: " + color +
                " digitalTvStandard: " + digitalTvStandard;
        return result;
    }
}
