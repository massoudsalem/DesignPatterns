package Structural.Decorator;

public class PlainPizza implements Pizza {

    @Override
    public String make() {
        return "Pizza paste";
    }

    @Override
    public int cost() {
        return 4;
    }
}
