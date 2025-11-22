public class Dolphin extends Aquatic {
    protected float swimmingSpeed;

    public Dolphin() { super(); }

    public Dolphin(String family, String name, int age, boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed = swimmingSpeed;
    }

    @Override
    public String toString() {
        String parentToString = super.toString();
        String baseString = parentToString.substring(0, parentToString.length() - 1);
        return baseString + ", Vitesse de nage=" + swimmingSpeed + "]";
    }

    @Override
    public void swim() {
        System.out.println("Ce dauphin nage.");
    }
}