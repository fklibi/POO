public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal("Felidae", "Simba", 5, true);
        Animal elephant = new Animal("Elephantidae", "Dumbo", 10, true);
        Animal penguin = new Animal("Spheniscidae", "Pingu", 3, false);

        Zoo myZoo = new Zoo("Esprit Zoo", "Tunis", 10);

        myZoo.animals[0] = lion;
        myZoo.animals[1] = elephant;
        myZoo.animals[2] = penguin;

        myZoo.displayZoo();

        System.out.println("\nAffichage direct avec toString():");
        System.out.println(myZoo);
    }
}
