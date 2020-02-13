package Creational.FactoryMethod;

public class BurgerStore implements BurgerFactory {
    @Override
    public Burger createBurger(BurgerType type) {
        switch (type){
            case beef:
                return new BeefBurger();
            case chicken:
                return new ChickenBurger();
            case vegetarian:
                return new VegetarianBurger();
            default:
                return null;
        }
    }
}
