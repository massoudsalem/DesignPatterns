package Structural.Decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza customPizza;

    public PizzaDecorator(Pizza customPizza){
        this.customPizza = customPizza;
    }

    @Override
    public String make() {
        return customPizza.make();
    }

    @Override
    public int cost() {
        return customPizza.cost();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ingredients: ");
        stringBuilder.append(make());
        stringBuilder.append("\nTotal cost: ");
        stringBuilder.append(cost());
        return stringBuilder.toString();
    }
}
