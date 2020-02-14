package Behavioral.ChainOfResponsibility;

public abstract class MailHandler {
    private static Handler spamHandler = new SpamHandler();
    private static Handler fanHandler = new FanHandler();
    private static Handler complaintHandler = new ComplaintHandler();
    private static boolean _1stRequest = true;


    public static void handleRequest(MailType type) {

        if(_1stRequest){

            spamHandler.setSuccessor(fanHandler);
            fanHandler.setSuccessor(complaintHandler);

            _1stRequest = false;
        }

        spamHandler.handleRequest(type);
    }
}
