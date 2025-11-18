public class Student extends User {
    private String groupe;
    private Tutor tuteur;

    public Student(int id, String nom, String prenom, String dateNaissance,
                   String email, String telephone, String groupe, Tutor tuteur) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.groupe = groupe;
        this.tuteur = tuteur;
    }

    public String getGroupe() {
        return groupe;
    }

    public Tutor getTuteur() {
        return tuteur;
    }

    @Override
    public String toString() {
        return "Student{" +
                "groupe='" + groupe + '\'' +
                ", tuteur=" + tuteur +
                '}';
    }
}