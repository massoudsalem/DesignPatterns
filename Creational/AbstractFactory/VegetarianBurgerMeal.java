package Creational.AbstractFactory;

public class VegetarianBurgerMeal extends BurgerMeal {

    @Override
    public void createBurger() {
        combo = "\nCombo :\nCola Fries\n";
        burgerType = "Vegetarian";
        layers.add("Bread");
        layers.add("Tomato");
        layers.add("Onions");
        layers.add("Veggies");
        layers.add("Bean protein");
        layers.add("Veggies");
        layers.add("Salad");
        layers.add("Bread");
    }
}
