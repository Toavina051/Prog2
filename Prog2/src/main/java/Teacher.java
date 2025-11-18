public class Teacher extends User {
    private String specialite;

    public Teacher(int id, String nom, String prenom, String dateNaissance,
                   String email, String telephone, String specialite) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "specialite='" + specialite + '\'' +
                '}';
    }
}