import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Year;

public class Main2 {
    public static void main(String[] args) {
        new Main2().run();
    }

    public void run(){
        Calender calender = new Calender();
        System.out.println(calender.returnAllAppointsments());
        Appointment test = new Appointment("test", 2019, 12, 7);
        System.out.println("\n");
        calender.checkMyAppointmetsPerMonth(12,7);




    }
}
