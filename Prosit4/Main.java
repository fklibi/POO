import entites.Zoo ;
import entites.Animal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("best zoo" , "Tunis" );
        Zoo mySecondZoo = new Zoo("best second zoo" , "Tunis" );
        Animal cat = new Animal( "Felin" , "Louna" , 7 , true);
        Animal fish = new Animal("Fish", "nemo" , 1, false);
        Animal lion = new Animal( "Felin" , "simba" , 10 , true) ;
        Animal tiger = new Animal( "Felin" , "diego" , 6 , true) ;
        Animal cat1 = new Animal( "Felin" , "Louna" , 7 , true);

        System.out.println(myZoo.toString());
        System.out.println("###############################################################################");
        myZoo.AddAnimal(cat);
        myZoo.AddAnimal(fish);
        myZoo.AddAnimal(lion);
        myZoo.AddAnimal(tiger);
        myZoo.AddAnimal(cat1);


        mySecondZoo.AddAnimal(fish);
        mySecondZoo.AddAnimal(lion);
        mySecondZoo.AddAnimal(tiger);

        myZoo.displayZoo();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Searching for an animal ?\n Enter it's name: ");
        String name = scanner.nextLine();


        int pos = myZoo.searchAnimal(name);
        if (pos == -1){
            System.out.println(name + " is not in " + myZoo.get_name() );

        }
        else {
            System.out.println(name + " is in the cage number: " + (pos+1) );
        }
        System.out.println("Want to remove an animal ?\n Enter it's name: ");
        name = scanner.nextLine();


        if (myZoo.removeAnimal(name)){
            System.out.println(name + " is removed");
        }
        else {
            System.out.println(name + " is not in " + myZoo.get_name() );
        }


        System.out.println(Zoo.CompareZoo(myZoo, mySecondZoo));



    }

}