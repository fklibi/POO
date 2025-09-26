package Zoo;
import  java.util.ArrayList;

import Zoo.Animal ;

public class Zoo {

    Animal[] animals = new Animal[25];
    String name;
    String city ;
    final static int NBR_CAGES = 25 ;



    public int get_numberAnimals (){
        int size = 0 ;
        for  (int i = 0; i < NBR_CAGES; i++) {
            if (this.animals[i] != null) {
                size++;
            }
        }
        return size;
    }

    public String get_name (){
        return this.name;
    }

    public String get_city (){
        return this.city;
    }
    public int get_number_Cages (){
        return this.get_numberAnimals();
    }

    public void setName(String name) {
        this.name = name;
    }

    public void set_city(String city) {
        this.city = city;
    }


    public Zoo (String name, String city) {
        this.name = name;
        this.city = city;
    }

    public void displayZoo () {
        System.out.println("Zoo name : " + this.name + "\ncity : " + this.city + "\nnumber of cages : " +  this.get_number_Cages());
        for (int i = 0; i < get_numberAnimals() ; i++) {
            animals[i].displayAnimal();
        }
    }

    public String toString () {
        return "Zoo name : " + this.name + "\ncity : " + this.city + "\nnumber of cages : " +  this.get_number_Cages();

    }

    public boolean AddAnimal (Animal animal) {
        if (this.get_numberAnimals() == 25 || this.searchAnimal(animal.Name) != -1 ) {
            System.out.println("Animal already exists");
            return false ;
        }
        else {
            this.animals[this.get_numberAnimals()] = animal;
            return true;
        }
    }

    public int searchAnimal (String name) {
        for (int i = 0; i < this.get_numberAnimals() ; i++) {
            if (this.animals[i].Name.equals(name) ) {
                return i;
            }
        }
        return -1;
    }


    public boolean removeAnimal (String name) {
        int pos = this.searchAnimal(name);
        if ( pos == -1 ) {
            return false;
        }
        else {
            for (int i = pos; i < this.get_numberAnimals()  ; i++) {
                this.animals[i] = this.animals[i+1];
            }
            return true;
        }
    }

    public boolean isZooFull (){
        if(this.get_numberAnimals() == NBR_CAGES) {
            return true;
        }
        else {
            return false;
        }

    }


    static public Zoo CompareZoo(Zoo zoo1, Zoo zoo2) {
        if (zoo1.get_numberAnimals() < zoo2.get_numberAnimals()) {
            return zoo2 ;
        }
        else if (zoo1.get_numberAnimals() == zoo2.get_numberAnimals()) {
            return null;
        }
        else {
            return zoo1 ;
        }
    }

}
