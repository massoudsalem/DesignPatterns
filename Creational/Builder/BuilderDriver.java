package Creational.Builder;

import Creational.Builder.Builder.Burger;

public class BuilderDriver {
    public static void main(String[] args) {
        Burger burger = Director.construct();
        System.out.println(burger);
    }
}
