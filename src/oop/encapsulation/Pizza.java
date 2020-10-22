package oop.encapsulation;

public class Pizza {

    private String toppingName;
    public String pizzaName;
    private int price;
    private char size;
    private String typeOfPizza;
    private boolean isAvailable;

    public String getToppingName() {
        return toppingName;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }
}
