package Creational.FactoryMethod;

public class ChickenBurger extends Burger {
    @Override
    public void createBurger() {
        burgerType = "Chicken";
        layers.add("Bread");
        layers.add("Sauce");
        layers.add("Onions");
        layers.add("Veggies");
        layers.add("Cheese");
        layers.add("Chicken");
        layers.add("Sauce");
        layers.add("Cheese");
        layers.add("Bread");
    }
}
