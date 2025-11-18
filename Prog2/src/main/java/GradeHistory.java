import java.time.Instant;

public class GradeHistory {
    private double oldValue;
    private double newValue;
    private String reason;
    private Instant timestamp;

    public GradeHistory(double oldValue, double newValue, String reason, Instant timestamp) {
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.reason = reason;
        this.timestamp = timestamp;
    }

    public double getOldValue() {
        return oldValue;
    }

    public double getNewValue() {
        return newValue;
    }

    public String getReason() {
        return reason;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    @Override
    public String toString() {
        return "GradeChange{" +
                "oldValue=" + oldValue +
                ", newValue=" + newValue +
                ", reason='" + reason + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}

