public class Mammal extends Animal{
    private int numberOfLegs;
    private String reproduction;
    private String furColour;
    private String habitat;

    @Override
    public void speak() {
        System.out.println("Hola, soy un mamífero");
    }
}
