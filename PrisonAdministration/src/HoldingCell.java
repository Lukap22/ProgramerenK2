import java.util.ArrayList;

public class HoldingCell {
    private static int holdingCellNumber;
    private ArrayList<Prisoner> amountOfPrisoners = new ArrayList<>();
    private int maxAmountOfPrisoners;

    public HoldingCell(Prisoner prisoner, int maxAmount) {
        amountOfPrisoners.add(0, prisoner);
        maxAmountOfPrisoners = maxAmount;
        holdingCellNumber++;
    }

    public boolean addPrisoner(Prisoner prisoner){
        String solitary = prisoner.getSolitary().toLowerCase();
        if(amountOfPrisoners.size() == maxAmountOfPrisoners){
            System.out.println("Cell is full!");
        } else if (solitary.contains("yes")){
            amountOfPrisoners.add(0, prisoner);
        } else {
            return false;
        }
        return true;
    }

    public int returnCurrentPrisoners(){
        return amountOfPrisoners.size();
    }

    public int returnEmptySpots(){
        return maxAmountOfPrisoners - amountOfPrisoners.size();
    }

    @Override
    public String toString() {
        return "Holding cell " + holdingCellNumber + " | Max amount of prisoners in this cell: " + maxAmountOfPrisoners + " "+ amountOfPrisoners;
    }
}
