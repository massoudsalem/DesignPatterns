package Creational.FactoryMethod;

public abstract interface BurgerFactory {
    public abstract Burger createBurger (BurgerType type);
}
