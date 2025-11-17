public class Tutor extends Person {
    private String descriptionLien;

    public Tutor(int id, String nom, String prenom, String dateNaissance,
                 String email, String telephone, String descriptionLien) {
        super(id, nom, prenom, dateNaissance, email, telephone);
        this.descriptionLien = descriptionLien;
    }

    public String getDescriptionLien() {
        return descriptionLien;
    }

    @Override
    public String toString() {
        return "Tutor{" +
                "descriptionLien='" + descriptionLien + '\'' +
                '}';
    }
}
