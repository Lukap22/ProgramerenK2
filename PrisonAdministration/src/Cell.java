public class Cell {
    private static int cellNumber;
    private Prisoner prisoner;

    public Cell(Prisoner prisoner) {
        this.prisoner = prisoner;
        cellNumber++;
    }

    @Override
    public String toString() {
        String result = "Cell " + cellNumber + " | " + prisoner;
        return result;
    }
}
