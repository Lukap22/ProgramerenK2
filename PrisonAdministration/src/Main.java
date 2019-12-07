import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    public void run() {
        Prison prison = new Prison();
        prison.addPrisoner(new Prisoner("Luka", "Trolled way to much.", 22, 1, "no"));
        ArrayList<Prison> test = new ArrayList<>();
//        prison.returnAllPrisoners(test);
        prison.addPrisoner(new Prisoner("The DarkOne", "Kill s a lot of peoples.", 25,  20, "Yes"));
        prison.addPrisoner(new Prisoner("Black lighting", "kills s a lot of peoples.", 25,  20, "Yes"));
        System.out.println();
        prison.addPrisoner(new Prisoner("q", "kill", 12, 2, "no"));
        ArrayList<Prisoner> testLijst = new ArrayList<>();
        testLijst.add(0,new Prisoner("test1", "test", 10, 2, "yes"));
        testLijst.add(1,new Prisoner("test2", "test", 10, 2, "yes"));
        testLijst.add(0,new Prisoner("test1", "test", 10, 2, "yes"));
        testLijst.add(1,new Prisoner("test2", "test", 10, 2, "yes"));
        Prisoner prisonerTest = new Prisoner("The DarkOne", "Kill s a lot of peoples.", 25,  20, "no");

        prison.addPrisoners(testLijst);
        prison.addCell(prisonerTest);
        prison.addCellHolding(prisonerTest, 5);

        System.out.println(prison.returnOccupiedHoldingCells());

        prison.returnAListOfOccupiedHoldingCells();
        prison.removePrisoner("nathan");



    }


}
