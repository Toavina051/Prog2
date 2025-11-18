import java.util.ArrayList;
import java.util.List;

public class Course {
    private int id;
    private String label;
    private int credits;
    private Teacher enseignant;
    private List<Exam> exams;

    public Course(int id, String label, int credits, Teacher enseignant, List<Exam> exams) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
        this.exams = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return label;
    }

    public int getCredits() {
        return credits;
    }

    public Teacher getEnseignant() {
        return enseignant;
    }

    public List<Exam> getExams() {
        return exams;
    }
    @Override
    public String toString() {
        return "Cours{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", credits=" + credits +
                ", enseignant=" + enseignant +
                '}';
    }
}
