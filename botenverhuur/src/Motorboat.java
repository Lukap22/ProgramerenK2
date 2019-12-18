public class Motorboat extends Boat{
    private int vermorgen;
    private String type = "Motorboat";

    public Motorboat(String name, int vermorgen) {
        super(name, 50);
        this.vermorgen = vermorgen;
    }

    @Override
    public String toString() {
        return super.toString() + type + " | vermogen of this boat is: " + vermorgen + "}";
    }
}
