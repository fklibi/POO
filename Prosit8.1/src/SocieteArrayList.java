import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe>, IRechercheAvancee<Employe> {
    private List<Employe> listeEmployes = new ArrayList<>();

    @Override
    public void ajouterEmploye(Employe e) {
        listeEmployes.add(e);
        System.out.println("Employé ajouté : " + e.getNom());
    }

    @Override
    public boolean rechercherEmploye(String nom) {
        for (Employe e : listeEmployes) {
            if (e.getPrenom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return listeEmployes.contains(e);
    }

    @Override
    public void supprimerEmploye(Employe e) {

        if (listeEmployes.remove(e)) {
            System.out.println("Employé supprimé : " + e.getNom());
        } else {
            System.out.println("Employé introuvable.");
        }
    }

    @Override
    public void displayEmploye() {
        for (Employe e : listeEmployes) {
            System.out.println(e);
        }
    }

    // --- Tri 1 : Tri Naturel par ID (Comparable) ---
    @Override
    public void trierEmployeParId() {
        Collections.sort(listeEmployes);
    }

    // --- Tri 2 : Tri Personnalisé par Département, Grade et Nom (Comparator) ---
    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        Collections.sort(listeEmployes, new Comparator<Employe>() {
            @Override
            public int compare(Employe e1, Employe e2) {
                // 1. Tri par nomDépartement (Ascendant)
                int deptCompare = e1.getNomDepartement().compareTo(e2.getNomDepartement());
                if (deptCompare != 0) {
                    return deptCompare;
                }

                // 2. Si départements égaux, trier par grade (Ascendant)
                int gradeCompare = Integer.compare(e1.getGrade(), e2.getGrade());
                if (gradeCompare != 0) {
                    return gradeCompare;
                }

                // 3. Si grades égaux, trier par nom (Prénom, Ascendant)
                return e1.getNom().compareTo(e2.getNom());
            }
        });
    }

    // Recherche avancée
    @Override
    public List<Employe> rechercherParDepartement(String nomDepartement) {
        List<Employe> resultat = new ArrayList<>();
        for (Employe e : listeEmployes) {
            if (e.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                resultat.add(e);
            }
        }
        return resultat;
    }
}