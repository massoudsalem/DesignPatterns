package Creational.FactoryMethod;

public class BeefBurger extends Burger{
    @Override
    public void createBurger() {
        burgerType = "Beef";
        layers.add("Bread");
        layers.add("Tomato");
        layers.add("Onions");
        layers.add("Veggies");
        layers.add("Cheese");
        layers.add("BBQSauce");
        layers.add("Beef");
        layers.add("BBQSauce");
        layers.add("Cheese");
        layers.add("Bread");
    }
}
