import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private double value;
    private List<GradeChange> history;

    public Grade(double initialValue) {
        this.value = initialValue;
        this.history = new ArrayList<>();
    }

    public void changeValue(double newValue, String reason) {
        history.add(new GradeChange(value, newValue, reason, Instant.now()));
        value = newValue;
    }

    public double getValue() {
        return value;
    }

    public List<GradeChange> getHistory() {
        return history;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "value=" + value +
                ", history=" + history +
                '}';
    }
}

