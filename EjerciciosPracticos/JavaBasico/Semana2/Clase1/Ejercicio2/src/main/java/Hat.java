public class Hat extends Outfit{
    private String type;
    private String measurements;

    public Hat(String code, String name, double price, String brand, String size, String colour, String type, String measurements) {
        super(code, name, price, brand, size, colour);
        this.type = type;
        this.measurements = measurements;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getmeasurements() {
        return measurements;
    }

    public void setmeasurements(String measurements) {
        this.measurements = measurements;
    }

    @Override
    public void showBrand(){
        System.out.printf("Este sombrro es de marca: %s\n", this.getBrand());
    }
}
