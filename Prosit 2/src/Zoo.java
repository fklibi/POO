public class Zoo {
    Animal[] animals = new Animal[25];
    String name;
    String city;
    int nbrCages;

    public Zoo(String name, String city, int nbrCages) {
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo() {
        System.out.println("Zoo Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Number of Cages: " + nbrCages);
        System.out.println("Animals in Zoo:");
        for (Animal animal : animals) {
            if (animal != null) System.out.println(animal);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Zoo [Name: ").append(name)
                .append(", City: ").append(city)
                .append(", Number of Cages: ").append(nbrCages)
                .append(", Animals: \n");
        for (Animal animal : animals) {
            if (animal != null) sb.append("  - ").append(animal).append("\n");
        }
        sb.append("]");
        return sb.toString();
    }
}
