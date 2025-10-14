import java.util.Scanner;

public class ZooManagement {
    int nbrcage = 20 ;
    String name = "my zoo";
    public static void main(String[] args) {
        ZooManagement zoo = new ZooManagement();

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Entrez le nom du zoo : ");
            zoo.name = sc.nextLine();
        } while (zoo.name == null || zoo.name.trim().isEmpty());

        do {
            System.out.print("Entrez le nombre de cages : ");
            while (!sc.hasNextInt()) {
                System.out.println("Erreur : Veuillez entrer un entier positif !");
                sc.next();
            }
            zoo.nbrcage = sc.nextInt();
        } while (zoo.nbrcage <= 0);


        System.out.println(" Le zoo " + zoo.name + " contient " + zoo.nbrcage + " cages.");


    }
}

