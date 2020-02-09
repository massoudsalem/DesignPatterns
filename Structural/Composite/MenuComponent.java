package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public abstract class  MenuComponent {

    protected String name;
    protected int price;
    protected List<MenuComponent> menuComponents = new ArrayList<>();

    public String getName() {
        return name;
    }


    public int getPrice() {
        return price;
    }

    public MenuComponent add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    public MenuComponent remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("Feature not implemented at this level");
    }

    String print(MenuComponent menuComponent) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(": ");
        stringBuilder.append(price + " L.E.");
        stringBuilder.append("\n");
        return stringBuilder.toString();
    }

    public abstract String toString();
}
