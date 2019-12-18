import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reservation {
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Duration duration;          //miss niet nodig?
    private LocalDateTime startRev;
    private LocalDateTime endRev;
    //private Boat boat;
    //TODO Boat toevoegen

    public Reservation(int month, int day, int startTimeHour, int startTimeMin, int endTimeHour, int endTimeMin) {
        this.startTime = LocalTime.of(startTimeHour, startTimeMin);
        this.endTime = LocalTime.of(endTimeHour, endTimeMin);
        this.date = determineDate(month, day);
        this.startRev = LocalDateTime.of(date, startTime);
        this.startRev = LocalDateTime.of(date, endTime);
        // this.duration = Duration.between(startRev, endRev);
    }

    public LocalDate determineDate(int month, int day) {
        //dit stukje wordt gebruikt zodat de user niet het jaar hoeft in te vullen.
        LocalDate today = LocalDate.now();
        int year = today.getYear();
        LocalDate userDate = LocalDate.of(year, month, day);
        //als de maand die opgegeven is kleiner is dan de huidige maand dan wordt de afspraak automatisch gemaakt in het volgende jaar.
        if (userDate.getMonthValue() < today.getMonthValue()) {
            year++;
            userDate = LocalDate.of(year, month, day);
        }
        return userDate;
    }

    public Duration getDuration() {
        return duration;
    }

    public LocalDateTime getStartRev() {
        return startRev;
    }

    public LocalDateTime getEndRev() {
        return endRev;
    }

    @Override
    public String toString() {
        return "Reservation{" + "startRev=" + startRev + ", endRev=" + endRev + '}';
    }
}
