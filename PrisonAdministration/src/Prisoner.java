public class Prisoner {
    private String name;
    private String crime;
    private int age;
    private int sentancedFor;
    private String solitary;


    public Prisoner(String name, String crime, int age, int sentancedFor, String solitary) {
        this.name = name;
        this.crime = crime;
        this.age = age;
        this.sentancedFor = sentancedFor;
        this.solitary = solitary;
    }

    public String getName() {
        return name;
    }

    public String getCrime() {
        return crime;
    }

    public int getAge() {
        return age;
    }

    public int getSentancedFor() {
        return sentancedFor;
    }

    public String getSolitary() {
        return solitary;
    }

    @Override
    public String toString() {
        return "Prisoner{" +
                "name='" + name + '\'' +
                ", crime='" + crime + '\'' +
                ", age=" + age +
                ", sentancedFor=" + sentancedFor +
                ", solitary='" + solitary + '\'' +
                '}';
    }
}
