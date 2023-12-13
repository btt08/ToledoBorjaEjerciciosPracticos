package ejercicio1;

public class Appliance{
    private String id;
    private String brand;
    private String model;
    private int wattage;
    private String colour;

    public Appliance() {}

    public Appliance(String id, String brand, String model, int wattage, String colour){
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.wattage = wattage;
        this.colour = colour;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getWattage() {
        return wattage;
    }
}
