package Etudiant;
import java.time.LocalDate;
public class Etudiant {
    String nom;
    String prenom;
    LocalDate DateNaissance;
    String adressemail;
    String adressepostal;
    public Etudiant(String nom, String prenom, LocalDate dateNaissance, String email, String adressePostale) {
        this.nom = nom;
        this.prenom = prenom;
        this.DateNaissance = dateNaissance;
        this.adressemail = email;
        this.adressepostal = adressePostale;
    }
    public void tostring()
    {


        System.out.print( "\n le nom est: "+this.nom+" \tle prennom: "+this.prenom+"\tla date de naissance:  "+this.DateNaissance+" \tEmail: "+adressemail+" \tadressepostal: "+adressepostal);
    }
    public void setnom(String nom)

    {
        this.nom=nom;

    }
    public String getnom()
    {
        return nom;
    }

}
