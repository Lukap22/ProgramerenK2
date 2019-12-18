import java.time.LocalDate;

public class Appointment {
    private String description;
    private LocalDate date;



    public Appointment(String description, int year, int month, int day) {
        this.description = description;
        this.date = LocalDate.of(year, month, day);
    }

    public LocalDate getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "{Appointment: " + description + " | Date: " + date + "}" ;
    }
}
