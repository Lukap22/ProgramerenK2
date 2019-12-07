import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;

public class Prison {
    private ArrayList<Prisoner> prisoners = new ArrayList<>();
    private ArrayList<Cell> cells = new ArrayList<>();
    private ArrayList<HoldingCell> holdingCells = new ArrayList<>();

    public Prison() {
        prisoners.add(new Prisoner("jack the ripper", "Murder", 38, 40, "yes"));
        prisoners.add(new Prisoner("justin_bieber ", "Singing", 16, 7, "yes"));
        prisoners.add(new Prisoner("Neptunus", "Killing the dead sea", 53, 80, "yes"));
        prisoners.add(new Prisoner("Harry_poter", "killing voldemort", 18, 3, "yes"));
        prisoners.add(new Prisoner("Demo_dog", "attempted to kill eleven", 2, 2, "yes"));
        prisoners.add(new Prisoner("nathan", "attempted to kill deez nuts", 18, 2, "false"));
    }

    //normalCell
    public void addCell(Prisoner prisoner){
        Cell result = new Cell(prisoner);
        cells.add(0, result);
    }

    //normalCell
    public int returnOccupiedCells(){
        return cells.size();
    }
    //normalCell
    public void returnAListOfOccupiedCells(){
        for (int i = 0; i < cells.size(); i++) {
            System.out.println(cells.get(i).toString());
        }
    }


    //Done
    public void addCellHolding(Prisoner prisoner, int maxAmountOfPrisoners){
        HoldingCell result = new HoldingCell(prisoner, maxAmountOfPrisoners);
        holdingCells.add(0, result);
    }

    public int returnOccupiedHoldingCells(){
        return holdingCells.size();
    }

    public void returnAListOfOccupiedHoldingCells(){
        for (int i = 0; i < holdingCells.size(); i++) {
            System.out.println(holdingCells.get(i).toString());
        }
    }

    public void addPrisoner(Prisoner prisoner) {
        this.prisoners.add(prisoner);
        System.out.println(prisoner.toString() + " added");
    }

    public void removePrisoner(String name) {
        String lowerCaseName = name.toLowerCase();
        System.out.println(prisoners.size());
        for (int i = 0; i < prisoners.size(); i++) {
            if(prisoners.get(i).getName().contains(lowerCaseName)){
                System.out.println("Removed "+ prisoners.get(i));
                prisoners.remove(i);

            }
        }
        System.out.println(prisoners.size());
    }

    public void addPrisoners( ArrayList<Prisoner> newPrisoners){
        prisoners.addAll(0, newPrisoners);
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
