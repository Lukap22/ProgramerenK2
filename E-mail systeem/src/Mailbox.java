import java.util.ArrayList;
import java.util.Scanner;

public class Mailbox {
    private ArrayList<Message> msg = new ArrayList<>();


    public void addMSGToMailbox(Message MSG){
        msg.add(0, MSG);
    }

    public Message getMSG(int number){
        return msg.get(number);
    }

    public Message makeCustomMSG(User sender, User receiver){
        Scanner myScanner = new Scanner(System.in);
        Message result = new Message(receiver, sender);
        System.out.println("How many lines?");
        int amountOfLines = userInputNumber();
        for (int i = 0; i < amountOfLines; i++) {
            System.out.println("Line: " + i +" ");
            if (msg.size() == 0){
                result.addLine(myScanner.nextLine());
            } else {
                result.addLine(myScanner.nextLine());
            }
        }
        return result;
    }
    //TODo delMSG() nog niet af.
    public boolean delMSG(){
        return false;
    }

    public int userInputNumber(){
        Scanner myScanner = new Scanner(System.in);
         return myScanner.nextInt();
    }

    @Override
    public String toString() {
        String result = "";

        for (Message message : msg) {
            result += message;
        }

        return result;
    }
}
