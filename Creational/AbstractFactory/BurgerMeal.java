package Creational.AbstractFactory;

import java.util.ArrayList;
import java.util.List;

public abstract class BurgerMeal {
    protected List<String> layers;
    protected String burgerType;
    protected String combo;

    public BurgerMeal(){
        layers = new ArrayList<String>();
        this.createBurger();
    }

    public abstract void createBurger();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---" + burgerType + " Burger Meal---\n");
        stringBuilder.append("Burger Layers :\n");
        for (String layer : layers) {
            stringBuilder.append(layer);
            stringBuilder.append(' ');
        }
        stringBuilder.append(combo);
        return stringBuilder.toString();
    }

}
