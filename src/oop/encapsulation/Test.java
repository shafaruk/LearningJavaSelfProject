package oop.encapsulation;

public class Test {


    public static void main(String[] args) {
        Pizza myPizza =new Pizza();
        System.out.println( myPizza.pizzaName="American Pizza");
        myPizza.setToppingName("Mushroom");
        System.out.println(myPizza.getToppingName());


    }
}
