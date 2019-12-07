import java.util.Date;

public class Instructor extends Person {
    private double salaray;

    public Instructor(String name, int birthday, double salaray) {
        super(name, birthday);
        this.salaray = salaray;

    }

    @Override
    public String toString() {
        return "Instructor's Name: " + name + " Birthday " + birthday + " Salary: " + salaray;
    }
}

