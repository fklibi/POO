public class Main {
    public static void main(String[] args) {
        DepartementHashSet gestion = new DepartementHashSet();

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Comptabilité", 5);
        Departement d3 = new Departement(3, "Marketing", 8);
        Departement d4 = new Departement(2, "Comptabilité", 5); // doublon

        gestion.ajouterDepartement(d1);
        gestion.ajouterDepartement(d2);
        gestion.ajouterDepartement(d3);
        gestion.ajouterDepartement(d4);

        gestion.afficherDepartements();

        System.out.println("\n Recherche par nom  : " + gestion.rechercherDepartement("Marketing"));
        System.out.println(" Recherche d’un objet  : " + gestion.rechercherDepartement(d2));

        gestion.trierDepartementsParId();
        gestion.trierDepartementsParNomEtNombreEmployes();

        gestion.supprimerDepartement(d3);
        gestion.afficherDepartements();
    }
}
