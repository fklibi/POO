import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {



        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Comptabilité", 5);
        Departement d3 = new Departement(3, "Marketing", 8);
        Departement d4 = new Departement(4, "RH", 3);

        Employe e1 = new Employe(101, "Klibi", "Fatma");
        Employe e2 = new Employe(102, "Allen", "Barry");
        Employe e3 = new Employe(103, "Kent", "Clark");
        Employe e4 = new Employe(104, "Queen", "Oliver");

        Employe e5 = new Employe(101, "Snow", "Caitlyn");


        AffectationHashMap gestionAffectations = new AffectationHashMap();

        gestionAffectations.ajouterEmployeDepartement(e1, d1);
        gestionAffectations.ajouterEmployeDepartement(e2, d2);
        gestionAffectations.ajouterEmployeDepartement(e3, d3);
        gestionAffectations.ajouterEmployeDepartement(e4, d4);


        gestionAffectations.afficherEmployesEtDepartements();

        System.out.println("\n --- Test 3.c : Réaffectation de e1 ---");
        gestionAffectations.ajouterEmployeDepartement(e1, d2);
        gestionAffectations.afficherEmployesEtDepartements();

        System.out.println("\n --- Test 3.c : Employé avec ID en double (e5) ---");
        gestionAffectations.ajouterEmployeDepartement(e5, d3);
        gestionAffectations.afficherEmployesEtDepartements();



        // --- 4. Suppression d'un employé ---
        gestionAffectations.supprimerEmploye(e2);

        // --- 6. Affichage des employés restants ---
        gestionAffectations.afficherEmployes();

        // --- 5. Suppression d'une affectation précise ---
        gestionAffectations.supprimerEmployeEtDepartement(e5, d4);
        gestionAffectations.supprimerEmployeEtDepartement(e5, d3);
        gestionAffectations.afficherEmployesEtDepartements();

        // --- 7. Affichage des départements ---
        gestionAffectations.afficherDepartements();

        // --- 8 & 9. Recherche ---
        System.out.println("\n --- Recherche ---");
        System.out.println(" L'employé e3 existe : " + gestionAffectations.rechercherEmploye(e3));
        System.out.println(" L'employé e2 existe : " + gestionAffectations.rechercherEmploye(e2));
        System.out.println(" Le département Marketing existe : " + gestionAffectations.rechercherDepartement(d3));

        // --- 10. Tri ---
        System.out.println("\n---  Affectations triées par ID d'Employé (TreeMap) ---");
        TreeMap<Employe, Departement> mapTriee = gestionAffectations.trierMap();
        for (Map.Entry<Employe, Departement> entry : mapTriee.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au " + entry.getValue().getNomDepartement());
        }
    }
}