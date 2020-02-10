package Structural.Flyweight;

public class ConcreteIngredient implements Ingredient {
    private final String name;

    public ConcreteIngredient(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
