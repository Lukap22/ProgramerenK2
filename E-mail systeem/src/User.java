import java.util.ArrayList;

public class User {
    private String name;
    private Mailbox inbox;
    private Mailbox outbox;


    public User(String name) {
        this.name = name;
        this.inbox = new Mailbox();
        this.outbox = new Mailbox();
    }

    public Mailbox getInbox(){
        return inbox;
    }

    public Mailbox getOutbox(){
        return outbox;
    }

    public void addToOutbox(Message message) {
        this.outbox.addMSGToMailbox(message);
    }

    public void addToInbox(Message message) {
        this.inbox.addMSGToMailbox(message);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
