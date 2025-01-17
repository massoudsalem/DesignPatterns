package Behavioral.ChainOfResponsibility;

public abstract class Handler {
    Handler successor;

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public abstract void handleRequest(MailType type);
}
