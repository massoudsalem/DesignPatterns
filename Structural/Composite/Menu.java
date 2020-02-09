package Structural.Composite;

import java.util.Iterator;

public class Menu extends MenuComponent{

    public Menu(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public MenuComponent add(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
        this.price += menuComponent.getPrice();
        return menuComponent;
    }

    public void addAll(MenuComponent ... menuComponents){
        if(menuComponents.length == 0)
            throw new IllegalArgumentException("Add at least one Item");
        for(MenuComponent menuComponent: menuComponents)
            this.add(menuComponent);
    }

    @Override
    public MenuComponent remove(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
        return menuComponent;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append(print(this));

        this.price = 0;
        Iterator<MenuComponent> iterator = menuComponents.iterator();
        while(iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            stringBuilder.append(menuComponent.toString());
        }

        return stringBuilder.toString();
    }

}
