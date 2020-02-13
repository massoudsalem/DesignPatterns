package Creational.AbstractFactory;

public class AbstractFactoryDriver {

    public static void processMeals(MealFactory burgerStore){
        BurgerMeal chickenBurgerMeal = burgerStore.createBurger(BurgerType.chicken);
        System.out.println(chickenBurgerMeal);

        BurgerMeal beefBurgerMeal = burgerStore.createBurger(BurgerType.beef);
        System.out.println(beefBurgerMeal);

        BurgerMeal vegetarianBurgerMeal = burgerStore.createBurger(BurgerType.vegetarian);
        System.out.println(vegetarianBurgerMeal);
    }

    public static void main(String[] args) {
        MealFactory adultsBurgerStore = MealFactory.getMealFactory(21);
        processMeals(adultsBurgerStore);

        MealFactory kidsBurgerStore = MealFactory.getMealFactory(10);
        processMeals(kidsBurgerStore);
    }
}
