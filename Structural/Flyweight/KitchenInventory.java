package Structural.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class KitchenInventory {
    private Catalog catalog = new Catalog();
    private List<Order> orders = new ArrayList<>();

    public void takeOrder(int orderNumber, String ... ingredientsNames){
        Ingredient[] orderList = new Ingredient[ingredientsNames.length];
        for(int i = 0; i < ingredientsNames.length; i++){
            Ingredient ingredient = catalog.lookup(ingredientsNames[i]);
            orderList[i] = ingredient;
        }
        Order order = new Order(orderNumber, orderList);
        orders.add(order);
    }

    public void process(){
        while (orders.size() > 0){
            Order order = orders.get(0);
            order.processOrder();
            orders.remove(order);
        }
    }

    public void report(){
        System.out.println("Total ingredients used : " + catalog.countIngredients());
    }
}
