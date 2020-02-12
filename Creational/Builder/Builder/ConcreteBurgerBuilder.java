package Creational.Builder.Builder;

import java.util.ArrayList;

public class ConcreteBurgerBuilder extends BurgerBuilder {

    public ConcreteBurgerBuilder() {
        layers = new ArrayList<String>();
    }

    @Override
    public BurgerBuilder addBread() {
        this.layers.add("Bread");
        return this;
    }

    @Override
    public BurgerBuilder addSauce() {
        this.layers.add("Sauce");
        return this;
    }

    @Override
    public BurgerBuilder addVeggies() {
        this.layers.add("Veggies");
        return this;
    }

    @Override
    public BurgerBuilder addOnions() {
        this.layers.add("Onions");
        return this;
    }

    @Override
    public BurgerBuilder addTomato() {
        this.layers.add("Tomato");
        return this;
    }

    @Override
    public BurgerBuilder addMeat() {
        this.layers.add("Meat");
        return this;
    }

    @Override
    public BurgerBuilder addCheese() {
        this.layers.add("Cheese");
        return this;
    }
}
