package Structural.Decorator;

public class DecoratorDriver {
    public static void main(String[] args) {
        Pizza meatMozzarellaPizza = new MeatDecorator(new MozzarellaDecorator(new PlainPizza()));
        System.out.println(meatMozzarellaPizza);
        Pizza oliveVegetarianPizza = new OliveDecorator(new PlainPizza());
        System.out.println(oliveVegetarianPizza);
    }
}