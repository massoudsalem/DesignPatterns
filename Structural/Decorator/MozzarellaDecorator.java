package Structural.Decorator;

public class MozzarellaDecorator extends PizzaDecorator {
    public MozzarellaDecorator(Pizza customPizza) {
        super(customPizza);
    }
    @Override
    public String make() {
        return super.make() + addMozzarella();
    }

    private String addMozzarella() {
        return ", Mozzarella";
    }

    @Override
    public int cost() {
        return super.cost() + addMozzarellaCost();
    }

    private int addMozzarellaCost() {
        return 5;
    }
}
