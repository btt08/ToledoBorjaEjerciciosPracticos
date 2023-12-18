public class Trousers extends Outfit{
    private String style;
    private String fabric;

    public Trousers(String code, String name, double price, String brand, String size, String colour, String style, String fabric) {
        super(code, name, price, brand, size, colour);
        this.style = style;
        this.fabric = fabric;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    @Override
    public void showBrand(){
        System.out.printf("Estos pantalones son de marca: %s\n", this.getBrand());
    }
}
