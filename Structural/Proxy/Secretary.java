package Structural.Proxy;

public class Secretary implements Librarian {
    Manger manger = new Manger();
    @Override
    public void giveAccessToVIPSection(String libraryCard) {
        System.out.print("Gaining access to hidden VIP books section: ");
        if(libraryCard.contains("VIP"))
            manger.giveAccessToVIPSection(libraryCard);
        else
            System.out.println("Access denied.");
    }
}
