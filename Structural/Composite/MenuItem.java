package Structural.Composite;

public class MenuItem extends MenuComponent {
    public MenuItem(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return print(this);
    }
}
