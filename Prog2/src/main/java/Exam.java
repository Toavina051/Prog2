public class Exam {
    private int id;
    private String titre;
    private Cours course;
    private String dateHeure;
    private int coefficient;

    public Exam(int id, String titre, Cours course, String dateHeure, int coefficient) {
        this.id = id;
        this.titre = titre;
        this.course = course;
        this.dateHeure = dateHeure;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Cours getCourse() {
        return course;
    }

    public String getDateHeure() {
        return dateHeure;
    }

    public int getCoefficient() {
        return coefficient;
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
