package Structural.Proxy;

public class Manger implements Librarian {
    @Override
    public void giveAccessToVIPSection(String libraryCard) {
        System.out.println("VIP access granted.");
    }
}
