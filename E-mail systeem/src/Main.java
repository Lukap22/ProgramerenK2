public class Main {
    public static void main(String[] args) {
      new Main().run();
    }

    public void run(){
        User ruud = new User("ruud");
        User edward = new User("Edward");

        Message test = new Message(edward, ruud);
        test.addLine("blallala");
        test.addLine("gains");
        test.addLine("dorp");
        //System.out.println(test.toString());

        Mailbox testbox = new Mailbox();
        //System.out.println(testbox.addMSG("luka", " thom"));

        sendMessage(ruud, edward, test);

        System.out.println("EDWARD INBOX:");
        System.out.println(edward.getInbox());
        System.out.println("\nEDWARD OUTBOX:");
        System.out.println(edward.getOutbox());
        System.out.println("\n");
        System.out.println("RUUD INBOX:");
        System.out.println(ruud.getInbox());
        System.out.println("\nRUUD OUTBOX:");
        System.out.println(ruud.getOutbox());
    }

    public void sendMessage(User from, User to, Message message) {
        from.addToOutbox(message);
        to.addToInbox(message);
    }
}
