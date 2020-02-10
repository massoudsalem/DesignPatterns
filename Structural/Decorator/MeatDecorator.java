package Structural.Decorator;

public class MeatDecorator extends PizzaDecorator {

    public MeatDecorator(Pizza customPizza) {
        super(customPizza);
    }

    @Override
    public String make() {
        return super.make() + addMeat();
    }

    private String addMeat() {
        return ", Meat";
    }

    @Override
    public int cost() {
        return super.cost() + addMeatCost();
    }

    private int addMeatCost() {
        return 10;
    }
}
