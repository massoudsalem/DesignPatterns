package Behavioral.ChainOfResponsibility;

public class ChainOfResponsibilityDriver {
    public static void main(String[] args) {

        MailHandler.handleRequest(MailType.spam);
        MailHandler.handleRequest(MailType.fan);
        MailHandler.handleRequest(MailType.compliment);
        MailHandler.handleRequest(MailType.notSupported);

    }
}
