import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        Reservationsystem newSystem = new Reservationsystem();

        //test of je alleen boats met unieke namen kan aanmaken
        System.out.println(newSystem.addMoterboat("Twinkiexxxx", 100));
        System.out.println(newSystem.addCatamaran("Twinkiexxxx", 100));
        System.out.println();

        //reservation date test
        Reservation newReservation = new Reservation(12, 30, 12, 30, 14, 30);
        System.out.println(newReservation.determineDate(1, 2)); // moet in 2020 zijn.
        System.out.println(newReservation.determineDate(12, 3)); // moet in 2019 zijn.

        //test of we met tijd kunnen vergelijken
        LocalDate testdate1 = newReservation.determineDate(1, 2);
        LocalDate testdate2 = newReservation.determineDate(1, 2);
        LocalTime.of(20, 10);
        System.out.println();
        LocalDateTime test = LocalDateTime.of(testdate1, LocalTime.now());
        LocalDateTime test2 = LocalDateTime.of(testdate1, LocalTime.of(20, 30));
        System.out.println(test);
        Duration d = Duration.between(test, test2);
        System.out.println("duration: " + d.toHours());
        System.out.println();
        //we kunnen dus localdate en Localtime samenvoegen in een LocalDateTime en dit kunnen we de duration er uitvissen

        //nu gaan we testen of we dit kunnen vergelijken en maybe een boolean van kunnen returnen
        Reservation rev1 = new Reservation(12, 17, 12, 30, 14, 30);
        Reservation rev2 = new Reservation(12, 17, 12, 30, 14, 30);
        System.out.println("blaaa: " + rev1.getStartRev().equals(rev2.getStartRev()));
        //Yessss

        //Hier ga ik testen of de toString van de boaten lijst goed functioneert.
        System.out.println(newSystem.listCurrentBoats());   //werkt :)
        System.out.println();

        //hier ga ik testen of ik een reservaing kan toevoegen. Als het goed is geeft die gelijk ook feedback bij welk systeem het fout gaan
        System.out.println(newSystem.listCurrentReservations()); //print de lijst met huidige reserveringen
        System.out.println(newSystem.addReservation(3, 18, 12, 30, 14,30, "Luka", "twinkie"));
        System.out.println(newSystem.listCurrentReservations()); //print de lijst met huidige reserveringen
        //oke er gaat dus iets fout met toevoegen van een reservingen en het zou dus iets te maken moeten hebben met de tijden.

    }
}
