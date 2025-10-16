public class Whale extends Aquatic {
    public Whale() {
        super();
    }

    public Whale(String family, String name, int age, boolean isMammal, String habitat) {
        super(family, name, age, isMammal, habitat);
    }

    // Implémentation de la méthode abstract swim() de Aquatic (Inst. 26.3)
    @Override
    public void swim() {
        System.out.println("Cette baleine nage massivement.");
    }
}