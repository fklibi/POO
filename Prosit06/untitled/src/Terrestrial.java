public class Terrestrial extends Animal {
    protected int nbrLegs;

    // Instruction 21: Constructeur par défaut
    public Terrestrial() {
        super();
    }

    // Instruction 22: Constructeur paramétré
    public Terrestrial(String family, String name, int age, boolean isMammal, int nbrLegs) {
        super(family, name, age, isMammal);
        this.nbrLegs = nbrLegs;
    }

    // Instruction 23: Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", Nombre de pattes=" + nbrLegs + "]";
    }
}