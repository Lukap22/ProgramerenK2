import java.util.ArrayList;

public class Message {
    private User receiver;
    private User sender;
    private ArrayList<String> line = new ArrayList<>();

    public Message(User receiver, User sender) {
        this.receiver = receiver;
        this.sender = sender;
    }

    public void addLine(String userLine){
        if (line.size() == 0){
            line.add(0, userLine);
        } else {
            int lastline = line.size() - 1;
            line.add(lastline, userLine);
        }
    }

    @Override
    public String toString() {
        return "From: " + sender + "\nTo: " + receiver + "\n\tMessage: " + line;
    }
}
