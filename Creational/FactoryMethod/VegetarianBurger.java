package Creational.FactoryMethod;

public class VegetarianBurger extends Burger {

    @Override
    public void createBurger() {
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
