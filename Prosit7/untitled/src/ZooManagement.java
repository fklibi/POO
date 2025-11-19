import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Animal lion = new Animal("Félidé", "Lion", 5, true);
        Zoo myZoo = new Zoo();
        myZoo.setName("Terra Animalium");
        myZoo.city = "Tunis";

        Zoo zoo1 = new Zoo("Jungle Paradise", "Tunis", 3); // NOUVEAU : 3 cages max
        Zoo zoo2 = new Zoo("AquaLand", "Tunis", 20);


        System.out.println("===== Prosit 7 =====");

        Animal validAnimal1 = new Animal("Félidé", "Lion", 5, true);
        Animal validAnimal2 = new Animal("Ursidae", "Ours", 10, true);
        Animal validAnimal3 = new Animal("Canidae", "Loup", 7, true);
        Animal animalTrop = new Animal("Bovidae", "Vache", 2, true);
        Animal animalAgeNeg = new Animal("Félidé", "Chat", -1, true);

        System.out.println("Zoo '" + zoo1.getName() + "' capacité max : " + zoo1.animals.length);
        System.out.println("Nombre d'animaux actuels : " + zoo1.getAnimalCount());

        testAddAnimal(zoo1, validAnimal1);
        testAddAnimal(zoo1, animalAgeNeg);
        testAddAnimal(zoo1, validAnimal2);
        testAddAnimal(zoo1, validAnimal3);
        testAddAnimal(zoo1, animalTrop);


        sc.close();
    }

    private static void testAddAnimal(Zoo zoo, Animal animal) {
        System.out.println("\nTentative d'ajout de l'animal : " + animal.getName() + " (Âge: " + animal.getAge() + ")");
        try {
            zoo.addAnimal(animal);
        } catch (ZooFullException e) {
            System.out.println("-> ERREUR ZOO PLEIN: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("->ERREUR ÂGE INVALIDE: " + e.getMessage());
        } finally {
            System.out.println("Nombre d'animaux après tentative : " + zoo.getAnimalCount());
        }
    }

}