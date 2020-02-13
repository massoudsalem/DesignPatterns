package Creational.AbstractFactory;

public class BurgerMealStore extends MealFactory {
    @Override
    public BurgerMeal createBurger(BurgerType type) {
        switch (type){
            case beef:
                return new BeefBurgerMeal();
            case chicken:
                return new ChickenBurgerMeal();
            case vegetarian:
                return new VegetarianBurgerMeal();
            default:
                return null;
        }
    }
}
