public class Penguin extends Aquatic {
    protected float swimmingDepth;

    public Penguin() { super(); }

    public Penguin(String family, String name, int age, boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth = swimmingDepth;
    }

    @Override
    public String toString() {
        String parentToString = super.toString();
        String baseString = parentToString.substring(0, parentToString.length() - 1);
        return baseString + ", Profondeur de nage=" + swimmingDepth + "]";
    }

    @Override
    public void swim() {
        System.out.println("Ce pingouin nage (et il est mignon).");
    }
}