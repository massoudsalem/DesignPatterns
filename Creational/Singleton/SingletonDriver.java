package Creational.Singleton;

public class SingletonDriver {
    public static void main(String[] args) {
        Champion champion = Champion.getInstance();

        champion.Attack();
        champion.Defence();
    }
}
