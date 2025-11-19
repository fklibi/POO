public class Zoo {
    Animal[] animals;
    private String name;
    String city;
    int animalCount;

    Aquatic[] aquaticAnimals;
    int aquaticCount;

    public Zoo(){
        this.animals = new Animal[25];
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[nbrCages];
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {

        if (animal.getAge() < 0) {
            throw new InvalidAgeException();
        }

        if (animalCount >= animals.length) {
            throw new ZooFullException();
        }

        animals[animalCount] = animal;
        animalCount++;
        System.out.println("Animal " + animal.getName() + " ajouté avec succès.");
    }

    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Ajout de l'animal aquatique " + aquatic.getName() + " réussi.");
        } else {
            System.out.println("Impossible d'ajouter l'animal aquatique : le tableau est plein (max 10).");
        }
    }

    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i];
                if (p.swimmingDepth > maxDepth) {
                    maxDepth = p.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;
        for (int i = 0; i < aquaticCount; i++) {
            if (aquaticAnimals[i] instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimals[i] instanceof Penguin) {
                penguinCount++;
            }
        }
        System.out.println("--- Détails des animaux aquatiques dans le Zoo " + this.name + " ---");
        System.out.println("Nombre de dauphins (Dolphin) : " + dolphinCount);
        System.out.println("Nombre de pingouins (Penguin) : " + penguinCount);
        System.out.println("-------------------------------------------------");
    }

    public int getAnimalCount() {
        return animalCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int searchAnimal(Animal animal) { /* ... */ return -1; }
    @Override public String toString() { /* ... */ return ""; }
}