package Creational.AbstractFactory;

public class KidsVegetarianBurgerMeal extends BurgerMeal{
    @Override
    public void createBurger() {
        combo = "\nCombo :\nJuice Fries Toy\n";
        burgerType = "Vegetarian";
        layers.add("Bread");
        layers.add("Tomato");
        layers.add("Bean protein");
        layers.add("Bread");
    }
}
