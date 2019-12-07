import java.util.Date;

public class Student extends Person {
    private String major;

    public Student(String major, String name, int birthday) {
        super(name, birthday);
        this.major = major;
    }

    @Override
    public String toString() {
        return "Student's Name: " + name + " Birthday " + birthday + " Major: " + major;
    }
}
