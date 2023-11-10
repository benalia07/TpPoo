package Etudiant;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String specialite;
    private String adresse;
    private List<Etudiant> etudiantsInscrits;

    // Constructeur de la classe Departement
    public Departement(String specialite, String adresse) {
        this.specialite = specialite;
        this.adresse = adresse;
        this.etudiantsInscrits = new ArrayList<>();
    }

    // Méthode pour inscrire un étudiant
    public void inscrire(Etudiant etudiant) {
        etudiantsInscrits.add(etudiant);
    }

    // Méthode pour désinscrire un étudiant
    public void desinscrire(Etudiant etudiant) {
        etudiantsInscrits.remove(etudiant);
    }

    @Override
    public String toString() {

        for (Etudiant etudiant : etudiantsInscrits) {
            etudiant.tostring();
        }
        return null;
    }
}
