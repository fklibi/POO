import java.util.List;
public class Main {
    public static void main(String[] args) {
        SocieteArrayList societe = new SocieteArrayList();

        // --- Ajout d'employés ---
        Employe e1 = new Employe(1, "Fatma", "Klibi", "Informatique", 3);
        Employe e2 = new Employe(5, "Barry", "Allen", "Comptabilité", 2);
        Employe e3 = new Employe(3, "Oliver", "Queen", "Informatique", 4);
        Employe e4 = new Employe(2, "Bruce", "Wayne", "Informatique", 3);
        Employe e5 = new Employe(4, "Diana", "Prince", "Comptabilité", 1);
        Employe e6 = new Employe(6, "Clark", "Kent", "Ressources Humaines", 2);

        societe.ajouterEmploye(e1);
        societe.ajouterEmploye(e2);
        societe.ajouterEmploye(e3);
        societe.ajouterEmploye(e4);
        societe.ajouterEmploye(e5);
        societe.ajouterEmploye(e6);

        // Affichage initial
        System.out.println("\n--- Liste initiale des employés (non triée) ---");
        societe.displayEmploye();

        // Recherche par nom
        System.out.println("\nRecherche nom 'Allen': " + societe.rechercherEmploye("Allen"));
        System.out.println("Recherche nom 'Fatma': " + societe.rechercherEmploye("Fatma"));

        // Recherche par département
        System.out.println("\n--- Employés du département Informatique ---");
        List<Employe> listInfo = societe.rechercherParDepartement("Informatique");
        for (Employe e : listInfo) {
            System.out.println(e);
        }

        // --- Tri par ID  ---
        societe.trierEmployeParId();
        System.out.println("\n--- Tri par ID ---");
        societe.displayEmploye();

        // --- Tri par Département, Grade et Nom  ---
        societe.trierEmployeParNomDépartementEtGrade();
        System.out.println("\n--- Tri par Département, Grade et Nom ---");
        societe.displayEmploye();

        // Suppression
        societe.supprimerEmploye(e5);
        System.out.println("\n--- Après suppression de l'employé ---");
        societe.displayEmploye();
    }
}