public class Zoo {
    public final int NBR_CAGES = 25;
    Animal[] animals;
    private String name;
    String city;
    int animalCount;

    // Instruction 25.1: Tableau d'animaux aquatiques
    Aquatic[] aquaticAnimals; // Tableau d'Aquatic, taille max 10 [cite: 7]
    int aquaticCount;

    // Constructeur par défaut
    public Zoo(){
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    // Constructeur paramétré
    public Zoo(String name, String city, int i) {
        this.name = name;
        this.city = city;
        this.animals = new Animal[NBR_CAGES];
        this.aquaticAnimals = new Aquatic[10];
        this.aquaticCount = 0;
    }

    // Instruction 25.2: addAquaticAnimal
    public void addAquaticAnimal(Aquatic aquatic) {
        if (aquaticCount < aquaticAnimals.length) {
            aquaticAnimals[aquaticCount] = aquatic;
            aquaticCount++;
            System.out.println("Ajout de l'animal aquatique " + aquatic.getName() + " réussi.");
        } else {
            System.out.println("Impossible d'ajouter l'animal aquatique : le tableau est plein (max 10).");
        }
    }

    // Instruction 27: Profondeur maximale des pingouins
    public float maxPenguinSwimmingDepth() {
        float maxDepth = 0.0f;
        for (int i = 0; i < aquaticCount; i++) {

            if (aquaticAnimals[i] instanceof Penguin) {
                Penguin p = (Penguin) aquaticAnimals[i]; // Cast pour accéder à l'attribut spécifique
                if (p.swimmingDepth > maxDepth) {
                    maxDepth = p.swimmingDepth;
                }
            }
        }
        return maxDepth;
    }

    // Instruction 28: Affichage du nombre par type
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

    public boolean addAnimal(Animal animal) { /* ... */ return false; }
    public int searchAnimal(Animal animal) { /* ... */ return -1; }
    @Override public String toString() { /* ... */ return ""; }
    public String getName() { return name; }
    public void setName(String name) { /* ... */ }
    // ...
}