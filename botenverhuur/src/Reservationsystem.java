import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Reservationsystem {
    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Boat> boats = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private ArrayList<Feedback> feedbacks = new ArrayList<>();

    public Reservationsystem() {
        customers.add(new Customer("Luka"));
        customers.add(new Customer("Thijmen"));
        customers.add(new Customer("Linda"));
        boats.add(new Motorboat("Twinkie", 100));
        boats.add(new Catamaran("Wavey", 100));
        reservations.add(new Reservation(12, 12, 12, 15,14, , 15,"Luka", "twinkie");
    }


    public boolean addCustomer(String name) {
        boolean notNewCustomer = false;
        for (Customer customer : customers) {
            if (customer.getName().equalsIgnoreCase(name)) {
                notNewCustomer = true;
                break;
            }
        }
        if (!notNewCustomer) {
            customers.add(new Customer(name));
            return true;
        }
        return false;
    }

    public boolean addMoterboat(String name, int vermorgen) {
        if (!newboat(name)) {
            boats.add(new Motorboat(name, vermorgen));
            return true;
        }
        return false;
    }

    public boolean addCatamaran(String name, int surfaceSail) {
        if (!newboat(name)) {
            boats.add(new Motorboat(name, surfaceSail));
            return true;
        }
        return false;
    }

    public ArrayList<Boat> listCurrentBoats() {
        return boats;
    }

    public ArrayList<Reservation> listCurrentReservations() {
        return reservations;
    }


    /**
     * Wanneer er een reservering toegevoegd wordt, moet er eerst gekeken worden of de ingegeven
     * bootnaam en klantnaam wel bestaan. Als ze bestaan, moet er ook nog gekeken worden of de te
     * maken reservering niet conflicteert met een reservering die eerder al gedaan is. Alleen als aan al
     * deze eisen wordt voldaan, zal het systeem de reservering accepteren.
     * @param month
     * @param day
     * @param startTimeHour
     * @param startTimeMin
     * @param endTimeHour
     * @param endTimeMin
     * @param customerName
     * @param boatName
     * @return
     */
    public ArrayList<Feedback> addReservation(int month, int day, int startTimeHour, int startTimeMin, int endTimeHour, int endTimeMin, String customerName, String boatName) {
        ArrayList<Feedback> results = new ArrayList<>();
        if (addCustomer(customerName)) {
            results.add(new Feedback(customerName, "Customer", true));
            if (newboat(boatName)){ //we zijn door 2 checks gegaan namelijk: is er een unieke gebruiker ja, dan wordt die aangemaakt. Nee dan returned die false. Zelfde geldt voor boats.
                results.add(new Feedback("Boat ", boatName, true));
                //nu gaan we een reservering aanmaken, dit gaan we vervolgens vergelijken met alle ander. als hier een conflict mee optreed verwijderderen we de laast aangemaakte resevering (de nieuwe dus)
                reservations.add(new Reservation(month, day, startTimeHour, startTimeMin, endTimeHour, endTimeMin)); //TODO Boat toevoegen
                boolean conflict;
                for (int i = 1; i < reservations.size(); i++) { //we beginnen express bij 1 omdat 0 de nieuwe is. Dit willen we niet met zichzelf vergelijken.
                    if (reservations.get(0).getStartRev().isAfter(reservations.get(i).getEndRev()) && reservations.get(0).getEndRev().isBefore(reservations.get(i).getStartRev())){
                        results.add(new Feedback("Reservation ", "time Conflict", false));
                    } else {
                        reservations.remove(0);
                    }
                }
            }
        } else {
            results.add(new Feedback("Customer", customerName, false));
            results.add(new Feedback("Boat ", boatName, false));
            results.add(new Feedback("Reservation ", "time Conflict", true));
        }
        return results;
    }

    private boolean newboat(String name) {
        boolean notNew = false;
        for (Boat boat : boats) {
            if (boat.getName().equalsIgnoreCase(name)) {
                notNew = true;
                break;
            }
        }
        return notNew;
    }
}
