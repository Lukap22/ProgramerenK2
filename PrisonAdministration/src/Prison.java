import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class Prison {
    private ArrayList<Prisoner> prisoners = new ArrayList<>();

    public Prison() {
        prisoners.add(new Prisoner("jack the ripper", "Murder", 38, 40, "yes"));
        prisoners.add(new Prisoner("justin_bieber ", "Singing", 16, 7, "yes"));
        prisoners.add(new Prisoner("Neptunus", "Killing the dead sea", 53, 80, "yes"));
        prisoners.add(new Prisoner("Harry_poter", "killing voldemort", 18, 3, "yes"));
        prisoners.add(new Prisoner("Demo_dog", "attempted to kill eleven", 2, 2, "yes"));
        prisoners.add(new Prisoner("nathan", "attempted to kill deez nuts", 18, 2, "false"));


    }

    public void addPrisoner(Prisoner prisoner) {
        this.prisoners.add(prisoner);
        System.out.println(prisoner.toString() + " added");
    }

    public void addPrisoners( ArrayList newPrisoners){
        prisoners.addAll(0, newPrisoners);

      //System.out.println(prisoner.toString() + " added");
    }
   public void returnAllPrisoners() {
        for (Prisoner prisoner : prisoners) {
            System.out.println(prisoner.toString());
        }
    }

    public void returnAllPrisonersAboveAge(int age) {
        ArrayList<Prisoner> result = new ArrayList<>();
        for (Prisoner prisoner : prisoners) {
            if (prisoner.getAge() >= age){
                System.out.println(prisoner.toString());
            }

        }
    }

    public void searchPrisonerByCrime(String crime) {
        for (Prisoner prisoner : prisoners) {
            String prisonerCrime = prisoner.getCrime().toLowerCase();
            if (prisonerCrime.contains(crime)){
                System.out.println(prisoner.toString());
            }
        }
    }

    public void searchPrisonerBySolitary(String userAwnser) {
        for (Prisoner prisoner : prisoners) {
            String prisonerSolitary = prisoner.getSolitary().toLowerCase();
            String yesOrNo = userAwnser.toLowerCase();
            if (prisonerSolitary.contains(yesOrNo)){
                System.out.println(prisoner.toString());
            }
        }
    }
    public void searchPrisonerBySolitaryAndAge(String userAnwser, int age) {
        for (Prisoner prisoner : prisoners) {
            String prisonerSolitary = prisoner.getSolitary().toLowerCase();
            String yesOrNo = userAnwser.toLowerCase();
            if (prisonerSolitary.contains(yesOrNo) && prisoner.getAge() >= age){
                System.out.println(prisoner.toString());
            }
        }
    }

    public void returnSentancedPrisonersMeanAge(){
        int totalSentancedTime = 0;
        int meanSentancedTime = 0;
        int amountOfPrisoners = 0;
        for (Prisoner prisoner : prisoners) {
            if(prisoner.getSentancedFor() >= 1){
                totalSentancedTime += prisoner.getSentancedFor();
                System.out.println(" totalSentancedTime "+ totalSentancedTime);
                amountOfPrisoners++;
            }
        }
        meanSentancedTime = totalSentancedTime / amountOfPrisoners;
        System.out.println(" meanSentancedTime "+ meanSentancedTime);
    }

    public void returnMeanAgeAllPrisoners(){
        int totalAge = 0;
        int result;
        for (Prisoner prisoner : prisoners) {
            totalAge = totalAge + prisoner.getAge();
            System.out.println(totalAge);
      }
        result = totalAge / prisoners.size();
        System.out.println("Mean age of all prisoners: " +result);
    }

}
