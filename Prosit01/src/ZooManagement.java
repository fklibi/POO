//Prosit 1

import java.util.Scanner
        ;
public class ZooManagement {
    int nbrCages = 20;
    String zooName = "my zoo";
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();

        System.out.print("Entrez le nom du zoo : ");
        zoo.zooName = sc.nextLine().trim();
        while (zoo.zooName.isEmpty()) {
            System.out.print("Nom invalide ! Réessayez : ");
            zoo.zooName = sc.nextLine().trim();
        }

        while (true) {
            System.out.print("Entrez le nombre de cages : ");
            if (sc.hasNextInt()) {
                zoo.nbrCages = sc.nextInt();
                if (zoo.nbrCages > 0) {
                    break;
                } else {
                    System.out.print("Le nombre de cages doit être positif ! Réessayez : ");
                }
            } else {
                System.out.print("Veuillez entrer un entier valide ! Réessayez : ");
                sc.next();
            }
        }

        sc.close();

        System.out.println(zoo.zooName + " contient " + zoo.nbrCages + " cages.");
    }
}
 
 