public abstract class Aquatic extends Animal { // CLASSE ABSTRAITE (Inst. 26.3)
    protected String habitat;

    public Aquatic() { super(); }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    // Instruction 31: Redéfinition de equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Aquatic)) return false;

        Aquatic aquatic = (Aquatic) obj;

        // Deux animaux aquatiques sont identiques si : Même name, age, et habitat [cite: 25, 26, 27, 28]
        return super.age == aquatic.age &&
                super.name.equals(aquatic.name) &&
                this.habitat.equals(aquatic.habitat);
    }

    // Instruction 23: Redéfinition de toString()
    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat + "]";
    }

    // Instruction 26.3
    public abstract void swim();
}