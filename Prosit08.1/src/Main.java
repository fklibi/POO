//Prosit 8 sans Collections


import java.util.List;

public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // Ajout d'employés
        Employe e1 = new Employe(1, "Fatma", "Klibi", "Informatique", 3);
        Employe e2 = new Employe(2, "Barry", "Allen", "Comptabilité", 2);
        Employe e3 = new Employe(3, "Oliver", "Queen", "Informatique", 4);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);

        // Affichage
        System.out.println("\n--- Liste des employés ---");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("\nRecherche nom 'Barry' : " + societe.rechercherEmploye("Allen"));
        System.out.println("Recherche nom 'Fatma' : " + societe.rechercherEmploye("Klibi"));

        // Recherche par département
        System.out.println("\n--- Employés du département Informatique ---");
        List<Employe> listInfo = societe.rechercherParDepartement("Informatique");
        for (Employe e : listInfo) {
            System.out.println(e);
        }

        // Suppression
        societe.supprimerEmploye(e2);
        System.out.println("\n--- Après suppression ---");
        societe.displayEmploye();
    }
}
