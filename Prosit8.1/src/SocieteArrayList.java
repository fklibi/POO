import java.util.ArrayList;
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
            if (e.getNom().equalsIgnoreCase(nom)) {
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

    // Méthodes de tri (non faites)
    @Override
    public void trierEmployeParId() {
        // Non implémenté
    }

    @Override
    public void trierEmployeParNomDépartementEtGrade() {
        // Non implémenté
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
