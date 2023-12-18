public class Reptile extends Animal{
    private double lenght;
    private String scaleType;
    private String venomType;
    private String habitat;

    @Override
    public void speak() {
        System.out.println("Hola, soy un reptil");
    }
}
