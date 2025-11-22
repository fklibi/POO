package entites;


public class Animal {

    private String Family ;
    private String Name ;
    private int Age ;
    private boolean isMamel ;

    public Animal(String Family , String Name , int Age , boolean isMamel) {
        if (Age < 0 ){
            System.out.println("Invalid Age; Must be positive");
            return;
        }
        else {
            this.Family = Family;
            this.Name = Name;
            this.Age = Age;
            this.isMamel = isMamel;
        }
    }

    public void displayAnimal() {
        System.out.printf("\n   Family: " + this.getFamily() + "\n   Name: " + this.getName() + "\n   Age: " + this.getAge() + "\n    isMamel: " + this.isMamel);
    }

    //age
    public int  getAge() {
        return Age;
    }
    public void setAge(int Age) {
        if (Age < 0 ){
            System.out.println("Invalid Age; Must be positive");
            return;
        }
        else{
            this.Age = Age;
        }
    }

    //family
    public String getFamily() {
        return Family;
    }
    public void setFamily(String Family) {
        this.Family = Family;
    }

    //name
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        this.Name = name;
    }


    //mamel
    public boolean isMamel() {
        return isMamel;
    }
    public void setMamel(boolean mamel) {
        isMamel = mamel;
    }
}
