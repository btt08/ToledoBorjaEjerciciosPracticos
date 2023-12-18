public class Bird extends Animal{
    private double wingSpan;
    private String flightType;
    private String featherColour;
    private String beakType;

    @Override
    public void speak() {
        System.out.println("Hola, soy un pájaro");
    }
}
