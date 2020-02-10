package Structural.Decorator;

public class OliveDecorator extends PizzaDecorator {
    public OliveDecorator(Pizza customPizza) {
        super(customPizza);
    }

    @Override
    public String make() {
        return super.make() + addOlive();
    }

    private String addOlive() {
        return ", Olive";
    }

    @Override
    public int cost() {
        return super.cost() + addOliveCost();
    }

    private int addOliveCost() {
        return 3;
    }
}
