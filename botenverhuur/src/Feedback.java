import java.util.ArrayList;

public class Feedback {
    private String type;
    private String name;
    private boolean result;

    public Feedback(String type, String name, boolean result) {
        this.name = name;
        this.result = result;
        this.type = type;
    }

    @Override
    public String toString() {
        return "{Type: " + type + ": "+ name + " = probleem = " + result + "}";
    }
}
