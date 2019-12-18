public abstract class Boat {
    private String name;
    private double costsPerHour;

    public Boat(String name, double costsPerHour) {
        this.name = name;
        this.costsPerHour = costsPerHour;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "{Boat name: " + name + " | costs per hour: " + costsPerHour + " | type: ";
    }
}
