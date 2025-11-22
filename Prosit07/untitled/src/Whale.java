public class Whale extends Aquatic {
    public Whale() {
        super();
    }

    public Whale(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    @Override
    public void swim() {
        System.out.println("Cette baleine nage massivement.");
    }
}