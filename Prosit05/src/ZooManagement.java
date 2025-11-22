//Prosit 5


package main;

import entities.*;
import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez le nom du zoo : ");
        String zooName = sc.nextLine();

        int nbrCages;
        do {
            System.out.print("Entrez le nombre de cages (entier positif) : ");
            nbrCages = sc.nextInt();
        } while (nbrCages <= 0);

        System.out.println(zooName + " comporte " + nbrCages + " cages.");

        // Prosit 2
        Animal lion = new Animal();
        lion.setFamily("Félidé");
        lion.setName("Lion");
        lion.setAge(5);
        lion.setMammal(true);

        // Utilisation des setters pour Zoo
        Zoo myZoo = new Zoo();
        myZoo.setName("Parc Animalier");
        myZoo.setCity("Tunis");

        System.out.println("Animal : " + lion.getName() + " (" + lion.getFamily() + ")");

        Animal lion1 = new Animal("Félidé", "Lion", 5, true);
        System.out.println("Animal créé : " + lion1.getName());

        myZoo.displayZoo();
        System.out.println(myZoo);

        // Prosit 3
        Zoo zoo1 = new Zoo("Zoo Esprit", "Tunis");
        Zoo zoo2 = new Zoo("Zoo Safari", "Sousse");

        Animal tigre = new Animal("Félidé", "Shere Khan", 7, true);
        Animal lion2 = new Animal("Félidé", "Lion", 5, true); // identique à lion

        // Test Ajout
        zoo1.addAnimal(lion);
        zoo1.addAnimal(tigre);
        zoo1.addAnimal(lion2); // doit être refusé (doublon)

        // Test Affichage
        zoo1.displayAnimals();

        // Test Recherche
        System.out.println("Indice : " + zoo1.searchAnimal(lion));
        System.out.println("Indice : " + zoo1.searchAnimal(tigre));

        // Test Suppression
        zoo1.removeAnimal(tigre);
        zoo1.displayAnimals();

        // Test Zoo plein
        for (int i = 0; i < 30; i++) {
            zoo1.addAnimal(new Animal("TestFamily", "Animal" + i, 2, false));
        }
        System.out.println("Zoo plein : " + zoo1.isZooFull());

        // Test Comparaison
        zoo2.addAnimal(new Animal("Canidés", "Wolf", 4, true));
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Zoo avec le plus d'animaux : " + plusGrand);

        //--------------------- Prosit 5
        // Instruction 21
        System.out.println("=== Constructeurs par défaut ===");
        Aquatic a1 = new Aquatic();
        Terrestrial t1 = new Terrestrial();
        Dolphin d1 = new Dolphin();
        Penguin p1 = new Penguin();

        System.out.println(a1);
        System.out.println(t1);
        System.out.println(d1);
        System.out.println(p1);

        // Instruction 22
        System.out.println("\n=== Constructeurs paramétrés ===");
        Aquatic a2 = new Aquatic("Fish", "Shark", 8, false, "Ocean");
        Terrestrial t2 = new Terrestrial("Felidae", "Lion", 5, true, 4);
        Dolphin d2 = new Dolphin("Delphinidae", "Flipper", 6, true, "Sea", 25.5f);
        Penguin p2 = new Penguin("Spheniscidae", "Pingo", 3, false, "Iceberg", 15.0f);

        System.out.println(a2);
        System.out.println(t2);
        System.out.println(d2);
        System.out.println(p2);

        // Instruction 24
        System.out.println("=== Test des méthodes swim() ===");
        a2.swim();  // Aquatic
        d2.swim();  // Dolphin (redéfinition)
        p2.swim();  // Penguin hérite de Aquatic → même message
    }
}
