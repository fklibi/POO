package entities;

public class Animal {
    // 🔹 Attributs privés
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    // 🔹 Constructeur par défaut
    public Animal() {
    }

    // 🔹 Constructeur paramétré
    public Animal(String family, String name, int age, boolean isMammal) {
        this.family = family;
        this.name = name;
        this.age = age;
        this.isMammal = isMammal;
    }

    // 🔹 Getters et Setters
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        if (family != null && !family.isEmpty()) {
            this.family = family;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    @Override
    public String toString() {
        return "Family: " + family + ", Name: " + name + ", Age: " + age + ", Mammal: " + isMammal;
    }
}
