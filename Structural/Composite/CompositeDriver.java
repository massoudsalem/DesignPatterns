package Structural.Composite;

public class CompositeDriver {
    public static void main(String[] args) {
        MenuItem egg = new MenuItem("Egg", 3);
        MenuItem foal = new MenuItem("Foal", 7);
        MenuItem potato = new MenuItem("Batates", 5);

        Menu foalAndPotato = new Menu("Main menu", 0);

        foalAndPotato.addAll(egg, foal, potato);

        System.out.println(foalAndPotato);

    }
}
