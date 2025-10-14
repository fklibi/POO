package entities;

public class Zoo {
    // 🔹 Constante
    private static final int NBR_CAGES = 25;

    // 🔹 Attributs privés
    private Animal[] animals;
    private String name;
    private String city;
    private int animalCount; // compteur d’animaux

    // 🔹 Constructeur par défaut
    public Zoo() {
        this.animals = new Animal[NBR_CAGES];
    }

    // 🔹 Constructeur paramétré
    public Zoo(String name, String city) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
    }

    // 🔹 Afficher les infos du zoo
    public void displayZoo() {
        System.out.println("Zoo : " + name + ", Ville : " + city + ", Cages : " + NBR_CAGES);
    }

    @Override
    public String toString() {
        return "Zoo [Nom=" + name + ", Ville=" + city + ", Cages=" + NBR_CAGES + "]";
    }

    //  Ajouter un animal
    public boolean addAnimal(Animal animal) {
        if (animalCount >= NBR_CAGES) {
            System.out.println("Le zoo est plein, impossible d'ajouter l'animal");
            return false;
        }
        if (searchAnimal(animal) != -1) {
            System.out.println("Cet animal existe déjà");
            return false;
        }
        animals[animalCount] = animal;
        animalCount++;
        return true;
    }

    //  Afficher les animaux
    public void displayAnimals() {
        System.out.println("Liste des animaux dans le zoo " + name + ":");
        for (int i = 0; i < animalCount; i++) {
            System.out.println(animals[i]);
        }
    }

    //  Recherche d’un animal par nom
    public int searchAnimal(Animal animal) {
        for (int i = 0; i < animalCount; i++) {
            if (animals[i].equals(animal)) {
                return i;
            }
        }
        return -1;
    }

    //  Suppression d’un animal
    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("Animal introuvable");
            return false;
        }
        for (int i = index; i < animalCount - 1; i++) {
            animals[i] = animals[i + 1];
        }
        animals[animalCount - 1] = null;
        animalCount--;
        return true;
    }

    //  Vérifier si le zoo est plein
    public boolean isZooFull() {
        return animalCount >= NBR_CAGES;
    }

    //  Comparer deux zoos
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.animalCount > z2.animalCount) return z1;
        else if (z2.animalCount > z1.animalCount) return z2;
        else return null; // identiques
    }

    // 🔹 Getters et Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Erreur : le nom du zoo ne peut pas être vide.");
        }
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        if (city != null && !city.isEmpty()) {
            this.city = city;
        } else {
            System.out.println("Erreur : la ville du zoo ne peut pas être vide.");
        }
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public static int getNbrCages() {
        return NBR_CAGES;
    }
}
