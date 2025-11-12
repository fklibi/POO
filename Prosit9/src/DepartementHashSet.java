import java.util.*;

public class DepartementHashSet implements IDepartement<Departement> {
    private Set<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement d) {
        if (departements.add(d)) {
            System.out.println(" Département ajouté : " + d);
        } else {
            System.out.println(" Département déjà existant !");
        }
    }

    @Override
    public boolean rechercherDepartement(String nomDepartement) {
        for (Departement d : departements) {
            if (d.getNomDepartement().equalsIgnoreCase(nomDepartement)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDepartement(Departement d) {
        if (departements.remove(d)) {
            System.out.println(" Département supprimé : " + d);
        } else {
            System.out.println(" Département introuvable !");
        }
    }

    @Override
    public void afficherDepartements() {
        System.out.println("\n Liste des départements :");
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParId() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator.comparingInt(Departement::getId));

        System.out.println("\n Départements triés par ID :");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }

    @Override
    public void trierDepartementsParNomEtNombreEmployes() {
        List<Departement> liste = new ArrayList<>(departements);
        liste.sort(Comparator
                .comparing(Departement::getNomDepartement)
                .thenComparingInt(Departement::getNombreEmployes));

        System.out.println("\n Départements triés par Nom et Nombre d’Employés :");
        for (Departement d : liste) {
            System.out.println(d);
        }
    }
}
