public class Tshirt extends Outfit{
    private String sleeveType;
    private String neckType;

    public Tshirt(String code, String name, double price, String brand, String size, String colour, String sleeveType, String neckType) {
        super(code, name, price, brand, size, colour);
        this.sleeveType = sleeveType;
        this.neckType = neckType;
    }

    public String getSleeveType() {
        return sleeveType;
    }

    public void setSleeveType(String sleeveType) {
        this.sleeveType = sleeveType;
    }

    public String getNeckType() {
        return neckType;
    }

    public void setNeckType(String neckType) {
        this.neckType = neckType;
    }

    @Override
    public void showBrand(){
        System.out.printf("Esta camiseta es de marca: %s\n", this.getBrand());
    }
}
