package Creational.AbstractFactory;

public class ChickenBurgerMeal extends BurgerMeal {
    @Override
    public void createBurger() {
        combo = "\nCombo :\nCola Fries\n";
        burgerType = "Chicken";
        layers.add("Bread");
        layers.add("BBQ Sauce");
        layers.add("Onions");
        layers.add("Veggies");
        layers.add("Cheese");
        layers.add("Chicken");
        layers.add("Sauce");
        layers.add("Cheese");
        layers.add("Bread");
    }
}
