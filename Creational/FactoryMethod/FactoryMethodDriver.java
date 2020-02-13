package Creational.FactoryMethod;

public class FactoryMethodDriver {
    public static void main(String[] args) {
        BurgerFactory burgerStore = new BurgerStore();

        Burger chickenBurger = burgerStore.createBurger(BurgerType.chicken);
        System.out.println(chickenBurger);

        Burger beefBurger = burgerStore.createBurger(BurgerType.beef);
        System.out.println(beefBurger);

        Burger vegetarianBurger = burgerStore.createBurger(BurgerType.vegetarian);
        System.out.println(vegetarianBurger);
    }
}
