public class Cours {
    private int id;
    private String label;
    private int credits;
    private Teacher enseignant;

    public Cours(int id, String label, int credits, Teacher enseignant) {
        this.id = id;
        this.label = label;
        this.credits = credits;
        this.enseignant = enseignant;
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
