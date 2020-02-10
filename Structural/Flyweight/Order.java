package Structural.Flyweight;

import java.util.Arrays;
import java.util.List;

public class Order {
    private final int orderNumber;
    private final List<Ingredient> order;

    public Order(int orderNumber, Ingredient ... order) {
        this.orderNumber = orderNumber;
        this.order = Arrays.asList(order);
    }



    public void processOrder(){
        for(Ingredient ingredient : order){
            System.out.println("Ordering " + ingredient +
                                " for order number : " + orderNumber);
        }
    }

}
