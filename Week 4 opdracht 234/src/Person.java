import java.time.LocalDate;
import java.util.Date;

public class Person {
    protected String name;
    protected int birthday;


    public Person(String name, int birthday) {
        this.name = name;
        this.birthday = birthday;
        System.out.println(this.name+ " Added.");
    }

    @Override
    public String toString() {
        return "Person's Name: " + name + " Birthday " + birthday;
    }
}
