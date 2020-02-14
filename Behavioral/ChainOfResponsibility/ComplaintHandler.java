package Behavioral.ChainOfResponsibility;

public class ComplaintHandler extends Handler{
    @Override
    public void handleRequest(MailType type) {
        if(type == MailType.compliment)
            System.out.println("This mail is a compliment," +
                                " Its sent to complements department.");
        else
            System.out.println("Our mail handler doesn't support this type.");
    }
}
