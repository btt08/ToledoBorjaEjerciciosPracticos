public class Shoe extends Outfit{
    private String material;
    private String shoelaceType;

    public Shoe(String code, String name, double price, String brand, String size, String colour, String material, String shoelaceType) {
        super(code, name, price, brand, size, colour);
        this.material = material;
        this.shoelaceType = shoelaceType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getShoelaceType() {
        return shoelaceType;
    }

    public void setShoelaceType(String shoelaceType) {
        this.shoelaceType = shoelaceType;
    }

    @Override
    public void showBrand(){
        System.out.printf("Estos zapatos son de marca: %s\n", this.getBrand());
    }
}
