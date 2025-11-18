import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class Grade {
    private Student student;
    private double value;
    private List<GradeHistory> history;

    public Grade(Student student, double initialValue) {
        this.student = student;
        this.value = initialValue;
        this.history = new ArrayList<>();
    }

    public void changeValue(double newValue, String reason) {
        history.add(new GradeHistory(value, newValue, reason, Instant.now()));
        value = newValue;
    }

    public Student getStudent() {
        return student;
    }

    public double getValue() {
        return value;
    }

    public List<GradeHistory> getHistory() {
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

