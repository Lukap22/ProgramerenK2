public class Catamaran extends Boat {
    private int surfaceSail;
    private String type = "Catamaran";

    public Catamaran(String name, int surfaceSail) {
        super(name, 30);
        this.surfaceSail = surfaceSail;
    }

    @Override
    public String toString() {
        return super.toString() + type + " | Surface of the sail :" + surfaceSail + "}";
    }
}
