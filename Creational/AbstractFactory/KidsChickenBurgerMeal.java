package Creational.AbstractFactory;

public class KidsChickenBurgerMeal extends BurgerMeal{
    @Override
    public void createBurger() {
        combo = "\nCombo :\nJuice Fries Toy\n";
        burgerType = "Chicken";
        layers.add("Bread");
        layers.add("Veggies");
        layers.add("Cheese");
        layers.add("Chicken");
        layers.add("Bread");
    }
}
