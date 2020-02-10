package Structural.Flyweight;

public class FlyweightDriver {
    public static void main(String[] args) {

        KitchenInventory kitchenInventory = new KitchenInventory();

        kitchenInventory.takeOrder(1, "Flour", "Egg",
                                    "Sugar", "Milk", "Backing powder", "Oil", "Salt");//7

        kitchenInventory.takeOrder(2, "Orange", "Lemon",
                                    "Strawberries", "Bananas", "Milk", "Sugar");//6

        kitchenInventory.takeOrder(3, "Orange", "Lemon");//2

        kitchenInventory.takeOrder(4, "Flour", "Egg",
                                    "Milk", "Backing powder");

        kitchenInventory.process();

        kitchenInventory.report();//11 instead of 18

    }
}
