package Creational.AbstractFactory;

public class KidsBeefBurgerMeal extends BurgerMeal {
    @Override
    public void createBurger() {
        combo = "\nCombo :\nJuice Fries Toy\n";
        burgerType = "Beef";
        layers.add("Bread");
        layers.add("Tomato");
        layers.add("Cheese");
        layers.add("Beef");
        layers.add("Bread");
    }
}
