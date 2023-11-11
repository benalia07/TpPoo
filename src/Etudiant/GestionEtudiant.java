package Etudiant;
import java.time.LocalDate;
import java.time.Month;

public class GestionEtudiant {
    public static void main(String []args)
    {
        String nom;
        LocalDate date= LocalDate.of(2023,Month.FEBRUARY,5);
        Etudiant lolo=new Etudiant("benalia", "ghendirmabrouk",date,"ghendir@gmail.com", "1234");
        lolo.tostring();
        Etudiant toto=new Etudiant("benalia", "ghendirmabrouk",date,"ghendir@gmail.com", "1234");
        System.out.println("\n");
        toto.tostring();
        System.out.println("\n");

        System.out.println(lolo == toto);
        toto.setnom("titi");
        lolo.tostring();

        System.out.println("\n");

        Etudiant fifi = new Etudiant("Fifi", "Fifine", date, "fifi@email.com", "789 Avenue, Village");
        Etudiant riri = new Etudiant("Riri", "Ririne", date, "riri@email.com", "101 Main St, Hamlet");

        Departement monDepInfo = new Departement("Informatique", "123 University St, Campus");

        monDepInfo.inscrire(lolo);
        monDepInfo.inscrire(fifi);
        monDepInfo.inscrire(toto);
        monDepInfo.inscrire(riri);

        System.out.println("\nInformations du département monDepInfo :");
        System.out.println(monDepInfo);

        // Désinscription de toto du département
        monDepInfo.desinscrire(toto);
        System.out.println("\nInformations du département monDepInfo après désinscription de toto :");
        System.out.println(monDepInfo);

       //
    }

}
