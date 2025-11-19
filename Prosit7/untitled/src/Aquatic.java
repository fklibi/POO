public abstract class Aquatic extends Animal {
    protected String habitat;

    public Aquatic() { super(); }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Aquatic)) return false;

        Aquatic aquatic = (Aquatic) obj;

        return super.age == aquatic.age &&
                super.name.equals(aquatic.name) &&
                this.habitat.equals(aquatic.habitat);
    }

    @Override
    public String toString() {
        return super.toString() + ", Habitat=" + habitat + "]";
    }

    public abstract void swim();
}