public class Outfit {
    private String code;
    private String name;
    private double price;
    private String brand;
    private String size;
    private String colour;

    public Outfit(String code, String name, double price, String brand, String size, String colour) {
        setCode(code);
        setName(name);
        setPrice(price);
        setBrand(brand);
        setSize(size);
        setCode(colour);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void showBrand(){}
}
