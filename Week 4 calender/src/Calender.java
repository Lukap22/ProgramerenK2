import java.time.LocalDate;
import java.util.ArrayList;

public class Calender {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    public Calender() {
        appointments.add(new Weekly("Was doen", 2019, 12, 7));
        appointments.add(new Weekly("WC schoonmaken", 2019, 12, 7));
        appointments.add(new Weekly("Kamer opruimen", 2019, 12, 7));
        appointments.add(new Monthly("Koffie cups inslaan", 2019, 12, 7));
        appointments.add(new Onetime("Deze opdracht", 2019, 12, 7));
        appointments.add(new Daily("Gym", 2019, 12, 7));
    }

    public ArrayList<Appointment> returnAllAppointsments(){
        return appointments;
    }

    public void checkMyAppointmetsPerDate(int year, int month, int day){
        LocalDate userDate = LocalDate.of(year, month, day);
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(userDate)) {
                System.out.println(appointment);
            }
        }
    }

    public void checkMyAppointmetsPerMonth(int month, int day){
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        LocalDate userDate = LocalDate.of(year, month, day);
        for (Appointment appointment : appointments) {
            if (appointment.getDate().equals(userDate)) {
                System.out.println(appointment);
            }
        }
    }
}
