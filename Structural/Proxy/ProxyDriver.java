package Structural.Proxy;

public class ProxyDriver {
    public static void main(String[] args) {
        Librarian librarian = new Secretary();

        librarian.giveAccessToVIPSection("I need the " +
                            "Original shakespearean Macbeth." +
                                        "card : normal");

        librarian.giveAccessToVIPSection("I need the " +
                                "Original shakespearean Macbeth." +
                                    "card : VIP");
    }
}
