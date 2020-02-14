package Behavioral.ChainOfResponsibility;

public class SpamHandler extends Handler{
    @Override
    public void handleRequest(MailType type) {
        if(type == MailType.spam)
            System.out.println("This mail is filtered as a spam.");
        else
            if(successor != null)
                successor.handleRequest(type);
    }
}
