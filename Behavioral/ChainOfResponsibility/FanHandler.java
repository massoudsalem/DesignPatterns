package Behavioral.ChainOfResponsibility;

public class FanHandler extends Handler {
    @Override
    public void handleRequest(MailType type) {
        if(type == MailType.fan)
            System.out.println("This mail a fan mail open inbox to read it.");
        else
        if(successor != null)
            successor.handleRequest(type);
    }
}
