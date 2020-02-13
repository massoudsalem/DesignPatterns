package Creational.FactoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Burger {
    protected List<String> layers;
    protected String burgerType;

    public Burger(){
        layers = new ArrayList<String>();
        this.createBurger();
    }

    public abstract void createBurger();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("---" + burgerType + " Layers---\n");
        for (String layer : layers) {
            stringBuilder.append(layer);
            stringBuilder.append(' ');
        }
        return stringBuilder.toString();
    }

}
