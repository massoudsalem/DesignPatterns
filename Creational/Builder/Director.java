package Creational.Builder;

import Creational.Builder.Builder.Burger;
import Creational.Builder.Builder.BurgerBuilder;
import Creational.Builder.Builder.ConcreteBurgerBuilder;

public class Director {
    public static Burger construct(){
        BurgerBuilder burgerBuilder = new ConcreteBurgerBuilder();

        burgerBuilder
                    .addBread()
                    .addSauce()
                    .addCheese()
                    .addMeat()
                    .addOnions()
                    .addVeggies()
                    .addCheese()
                    .addSauce()
                    .addBread();

        return burgerBuilder.build();
    }
}
