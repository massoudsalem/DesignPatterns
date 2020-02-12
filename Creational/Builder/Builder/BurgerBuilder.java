package Creational.Builder.Builder;

import java.util.List;

public abstract class BurgerBuilder {
    protected List<String> layers;

    public abstract BurgerBuilder addBread();
    public abstract BurgerBuilder addSauce();
    public abstract BurgerBuilder addVeggies();
    public abstract BurgerBuilder addOnions();
    public abstract BurgerBuilder addTomato();
    public abstract BurgerBuilder addMeat();
    public abstract BurgerBuilder addCheese();

    public Burger build() {
        Burger burger = new Burger();
        burger.processLayers(layers);
        return burger;
    }

}
