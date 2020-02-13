package Creational.AbstractFactory;

public class BeefBurgerMeal extends BurgerMeal {
    @Override
    public void createBurger() {
        combo = "\nCombo :\nCola Fries\n";
        burgerType = "Beef";
        layers.add("Bread");
        layers.add("Tomato");
        layers.add("Onion");
        layers.add("Veggies");
        layers.add("Cheese");
        layers.add("BBQSauce");
        layers.add("Beef");
        layers.add("BBQSauce");
        layers.add("Cheese");
        layers.add("Bread");
    }
}
