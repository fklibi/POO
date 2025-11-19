import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map<Employe, Departement> affectations;

    // 1. Constructeur
    public AffectationHashMap() {
        this.affectations = new HashMap<>();
    }

    // 2. Affectation d'un employé à un département
    public void ajouterEmployeDepartement(Employe e, Departement d) {

        Departement ancienneAffectation = affectations.put(e, d);
        if (ancienneAffectation == null) {
            System.out.println(" Affectation ajoutée : " + e + " -> " + d);
        } else {
            System.out.println(" Affectation modifiée pour l'employé " + e.getId() +
                    " : de " + ancienneAffectation.getNomDepartement() +
                    " à " + d.getNomDepartement());
        }
    }

    // 3. a. Affichage des affectations
    public void afficherEmployesEtDepartements() {
        System.out.println("\n---  Affectations Employés-Départements ---");
        for (Map.Entry<Employe, Departement> entry : affectations.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au " + entry.getValue().getNomDepartement());
        }
    }

    // 4. Suppression d'un employé
    public void supprimerEmploye(Employe e) {
        Departement departementSupprime = affectations.remove(e);
        if (departementSupprime != null) {
            System.out.println("\n ----> Employé supprimé des affectations : " + e);
        } else {
            System.out.println("\n ----> Employé introuvable : " + e);
        }
    }

    // 5. Suppression d'une affectation précise
    public void supprimerEmployeEtDepartement(Employe e, Departement d) {

        if (affectations.remove(e, d)) {
            System.out.println("\n ----> Affectation spécifique supprimée : " + e + " de " + d.getNomDepartement());
        } else {
            System.out.println("\n ----> L'affectation " + e.getId() + " -> " + d.getNomDepartement() + " n'existe pas ou ne correspond pas.");
        }
    }

    // 6. Affichage de la liste des employés
    public void afficherEmployes() {
        System.out.println("\n--- Liste des employés (Clés) --- ");
        Set<Employe> employes = affectations.keySet();
        for (Employe e : employes) {
            System.out.println(e);
        }
    }

    // 7. Affichage de la liste des départements
    public void afficherDepartements() {
        System.out.println("\n --- Liste des départements (Valeurs) --- ");
        Collection<Departement> departements = affectations.values();
        Set<Departement> departementsUniques = new java.util.HashSet<>(departements);
        for (Departement d : departementsUniques) {
            System.out.println(d.getNomDepartement());
        }
    }

    // 8. Recherche d'un employé
    public boolean rechercherEmploye(Employe e) {
        return affectations.containsKey(e);
    }

    // 9. Recherche d'un département
    public boolean rechercherDepartement(Departement d) {
        return affectations.containsValue(d);
    }

    // 10. Tri des employés selon leur identifiant
    public TreeMap<Employe, Departement> trierMap() {
        TreeMap<Employe, Departement> mapTriee = new TreeMap<>(affectations);
        return mapTriee;
    }
}