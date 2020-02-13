package Creational.AbstractFactory;

import Creational.FactoryMethod.Burger;

public class KidsBurgerStore extends MealFactory {
    @Override
    public BurgerMeal createBurger(BurgerType type) {
        switch (type){
            case beef:
                return new KidsBeefBurgerMeal();
            case chicken:
                return new KidsChickenBurgerMeal();
            case vegetarian:
                return new KidsVegetarianBurgerMeal();
            default:
                return null;
        }
    }
}
