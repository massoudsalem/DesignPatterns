package Creational.AbstractFactory;

public abstract class MealFactory {
    public static MealFactory getMealFactory(int age){
        if(age > 13)
            return new BurgerMealStore();
        return new KidsBurgerStore();
    }
    public abstract BurgerMeal createBurger(BurgerType type);
}
