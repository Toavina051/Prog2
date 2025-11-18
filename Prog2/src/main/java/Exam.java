import java.util.ArrayList;
import java.util.List;

public class Exam {
    private int id;
    private String titre;
    private Course course;
    private String dateHeure;
    private int coefficient;
    private List<Grade> grades;

    public Exam(int id, String titre, Course course, String dateHeure, int coefficient, List<Grade> grades) {
        this.id = id;
        this.titre = titre;
        this.course = course;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
        this.grades = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Course getCourse() {
        return course;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public int getCoefficient() {
        return coefficient;
    }

    public List<Grade> getGrades() {
        return grades;
    }

    @Override
    public String toString() {
        return "Exam{" +
                "id=" + id +
                ", titre='" + titre + '\'' +
                ", course=" + course +
                ", dateHeure='" + dateHeure + '\'' +
                ", coefficient=" + coefficient +
                '}';
    }
}
