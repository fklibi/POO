import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {

        // =================================================
        // (PROSIT 10)
        // =================================================

        System.out.println("\n\nTests Prosit 10");

        Departement d1 = new Departement(1, "Informatique", 10);
        Departement d2 = new Departement(2, "Comptabilité", 5);
        Departement d3 = new Departement(3, "Marketing", 8);

        Employe e1 = new Employe(101, "Klibi", "Fatma");
        Employe e2 = new Employe(102, "Allen", "Barry");
        Employe e3 = new Employe(103, "Kent", "Clark");
        Employe e5 = new Employe(101, "Snow", "Caitlyn");

        AffectationHashMap gestionAffectations = new AffectationHashMap();

        System.out.println("\n--- A. Affectation HashMap ---");
        gestionAffectations.ajouterEmployeDepartement(e1, d1);
        gestionAffectations.ajouterEmployeDepartement(e2, d2);
        gestionAffectations.ajouterEmployeDepartement(e3, d3);
        gestionAffectations.ajouterEmployeDepartement(e5, d3);

        gestionAffectations.afficherEmployesEtDepartements();

        System.out.println("\n--- B. Affectations triées par ID d'Employé ---");
        TreeMap<Employe, Departement> mapTriee = gestionAffectations.trierMap();
        for (Map.Entry<Employe, Departement> entry : mapTriee.entrySet()) {
            System.out.println(entry.getKey() + " est affecté au " + entry.getValue().getNomDepartement());
        }

        System.out.println("\n--- C. Gestion des Départements ---");
        DepartementHashSet dhs = new DepartementHashSet();
        dhs.ajouterDepartement(d1);
        dhs.ajouterDepartement(d2);
        dhs.ajouterDepartement(d3);
        dhs.ajouterDepartement(new Departement(1, "Informatique", 12)); // Test l'unicité

        dhs.trierDepartementsParNomEtNombreEmployes();


        // =================================================
        // TESTS DE GESTION DES PRODUITS (PROSIT 11)
        // =================================================

        System.out.println("\n\nTests Prosit 11");

        System.out.println("\nGestion des Produits");

        ProductManagement pm = new ProductManagement();
        Product p1 = new Product(10, "Ordinateur Portable", 1200.00);
        Product p2 = new Product(5, "Souris Gamer", 25.50);
        Product p3 = new Product(20, "Clavier Mécanique", 110.00);
        Product p4 = new Product(1, "Webcam HD", 55.99);

        List<Product> products = Arrays.asList(p1, p2, p3, p4);

        System.out.println("\n--- A. Produits filtrés (Prix < 100.00DT) ---");
        pm.displayProductsByFilter(products,
                product -> product.getPrix() < 100.00,
                System.out::println);

        String names = pm.returnProductsNames(products, Product::getNom);
        System.out.println("\n--- B. Noms des produits ---");
        System.out.println("Liste des noms : " + names);


        Product newProduct = pm.createProduct(() -> new Product(30, "Écran 27 pouces", 350.75));
        System.out.println("\n--- C. Nouveau produit créé ---");
        System.out.println(newProduct);


        List<Product> sortedProducts = pm.sortProductsById(products, Comparator.comparingInt(Product::getId));
        System.out.println("\n--- D. Produits triés par ID ---");
        sortedProducts.forEach(System.out::println);

    }
}