import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // La partie interaction utilisateur (Prosit 1)
        System.out.println("\n===== Création du Zoo =====");
        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();
        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            while (!sc.hasNextInt()) {
                System.out.print("Erreur : entrez un entier positif : ");
                sc.next();
            }
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);
        System.out.println("\n===== Infos du Zoo =====");
        System.out.printf("%s comporte %d cages.%n", zooName, nbrCages);
        sc.nextLine();

        // Création des zoos et animaux (Prosit 2-4)
        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo = new Zoo();
        myZoo.setName("Terra Animalium");
        myZoo.city = "Tunis";
        Zoo zoo1 = new Zoo("Jungle Paradise", "Hammamet", 20); // Changement de nom pour l'exemple
        Zoo zoo2 = new Zoo("AquaLand", "Sousse", 20);

        zoo1.addAnimal(lion);
        // ... (Autres tests Prosit 3-4) ...

        // =======================================================
        // ===== Prosit 5 : Héritage et Polymorphisme (TESTS) =====
        // =======================================================
        System.out.println("\n===== Prosit 5 : Tests Mis à Jour =====");

        // Instanciation paramétrée (Whale doit être utilisé car Aquatic est abstract)
        System.out.println("\n===== Instruction 22: Instanciation paramétrée =====");
        Whale whale = new Whale("Baleine", "Bleue", 25, true, "Océan"); // CHANGÉ : utilisation de Whale
        Terrestrial elephant = new Terrestrial("Elephantidae", "Dumbo", 10, true, 4);
        Dolphin flipper = new Dolphin("Delphinidae", "Flipper", 8, true, "Mer", 30.5f);
        Penguin happyFeet = new Penguin("Spheniscidae", "Happy Feet", 3, true, "Antarctique", 20.0f);

        // Affichage toString()
        System.out.println("\n===== Instruction 23: Affichage toString() =====");
        System.out.println("Aquatic (Whale): " + whale);
        System.out.println("Terrestrial (Elephant): " + elephant);
        System.out.println("Dolphin (Flipper): " + flipper);
        System.out.println("Penguin (Happy Feet): " + happyFeet);

        // Comportement de nage (swim())
        System.out.println("\n===== Instruction 24: Comportement de nage =====");
        System.out.print("Aquatic (Whale) : ");
        whale.swim(); // Whale::swim()
        System.out.print("Dolphin (Flipper) : ");
        flipper.swim(); // Dolphin::swim()
        System.out.print("Penguin (Happy Feet) : ");
        happyFeet.swim(); // Penguin::swim()
        System.out.println("Note : Aquatic.swim() étant abstract, les classes filles DOIVENT implémenter swim().");

        // =======================================================
        // ===== Prosit 6 : Tableau, Abstract, Equals (TESTS) =====
        // =======================================================

        System.out.println("\n=================================================");
        System.out.println("===== Prosit 6 : Tableau, Abstract, Equals =====");
        System.out.println("=================================================");

        // Préparation des animaux aquatiques
        Dolphin d1 = new Dolphin("Delphinidae", "Flipper", 8, true, "Mer", 30.5f);
        Dolphin d2 = new Dolphin("Delphinidae", "Sky", 12, true, "Ocean", 40.0f);
        Penguin p1 = new Penguin("Spheniscidae", "Happy Feet", 3, true, "Antarctique", 20.0f);
        Penguin p2 = new Penguin("Spheniscidae", "Chilly", 5, true, "Arctique", 30.0f);
        Penguin p_max = new Penguin("Spheniscidae", "Deep", 7, true, "Deep Blue", 50.0f);

        // Instruction 25: Ajout d'animaux aquatiques dans zoo1
        System.out.println("\n===== Instruction 25: Ajout animaux aquatiques =====");
        zoo1.addAquaticAnimal(d1);
        zoo1.addAquaticAnimal(d2);
        zoo1.addAquaticAnimal(p1);
        zoo1.addAquaticAnimal(p2);
        zoo1.addAquaticAnimal(p_max);

        // Instruction 26: Appel de la méthode swim() et démonstration du polymorphisme
        System.out.println("\n===== Instruction 26: Appel de swim() (Polymorphisme) =====");
        for (int i = 0; i < zoo1.aquaticCount; i++) {
            System.out.print(zoo1.aquaticAnimals[i].getName() + " : ");
            zoo1.aquaticAnimals[i].swim();
        }

        // Instruction 27: Profondeur maximale des pingouins
        System.out.println("\n===== Instruction 27: Profondeur maximale des pingouins =====");
        System.out.println("Profondeur maximale des pingouins dans le zoo1 : " + zoo1.maxPenguinSwimmingDepth() + "m."); // Devrait être 50.0m

        // Instruction 28: Affichage du nombre par type
        System.out.println("\n===== Instruction 28: Affichage nombre par type =====");
        zoo1.displayNumberOfAquaticsByType();

        // Instruction 31: Test de la méthode equals() dans Aquatic
        System.out.println("\n===== Instruction 31: Test de equals() =====");
        // Même nom, même âge, même habitat. La vitesse (attribut spécifique) n'est pas comparée.
        Dolphin d_same = new Dolphin("Delphinidae", "Flipper", 8, true, "Mer", 99.9f);
        Dolphin d_diff_name = new Dolphin("Delphinidae", "Flippers", 8, true, "Mer", 30.5f);

        System.out.println("Flipper (d1) est-il égal à d_same (même nom, âge, habitat) ? " + d1.equals(d_same)); // DOIT être TRUE
        System.out.println("Flipper (d1) est-il égal à d_diff_name (nom différent) ? " + d1.equals(d_diff_name)); // DOIT être FALSE
        System.out.println("Flipper (d1) est-il égal au Pingouin Happy Feet (habitat différent) ? " + d1.equals(p1)); // DOIT être FALSE

        sc.close();
    }

    // Méthode utilitaire pour afficher les animaux sous forme de tableau
    public static void displayAnimalsTable(Zoo zoo) {

        System.out.println("\nListe des animaux dans le zoo " + zoo.getName() + " :");
        System.out.printf("%-15s %-10s %-5s %-10s%n", "Nom", "Famille", "Âge", "Mammifère");
        for (int i = 0; i < zoo.animalCount; i++) {
            Animal a = zoo.animals[i];
            System.out.printf("%-15s %-10s %-5d %-10b%n",
                    a.getName(), a.getFamily(), a.getAge(), a.isMammal);
        }
    }
}