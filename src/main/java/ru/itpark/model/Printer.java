package ru.itpark.model;


public class Printer extends AbstractProduct {
    private String printFormat;
    private String printColor;
    private int printSpeed;

    public Printer(long id, String category, String name, int price, int rating, String printFormat, String printColor, int printSpeed) {
        super(id, category,  name, price, rating);
        this.printFormat = printFormat;
        this.printColor = printColor;
        this.printSpeed = printSpeed;
    }

    public String getPrintFormat() {
        return printFormat;
    }

    public void setPrintFormat(String printFormat) {
        this.printFormat = printFormat;
    }

    public String getPrintColor() {
        return printColor;
    }

    public void setPrintColor(String printColor) {
        this.printColor = printColor;
    }

    public int getPrintSpeed() {
        return printSpeed;
    }

    public void setPrintSpeed(int printSpeed) {
        this.printSpeed = printSpeed;
    }

    @Override
    public String toString() {
        String result = super.getCategory();
        result = result  +
                " name: " + super.getName() +
                " price: " + super.getPrice() + " rubles" +
                " printFormat: " + printFormat  +
                " printColor: " + printColor  +
                " printSpeed: " + printSpeed;
        return result;
    }
}
