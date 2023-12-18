import java.time.Year;

public class Bike extends Vehicle implements Combustion{
    double engineDisplacement;
    String engineType;

    public Bike(String id, String licensePlate, String brand, String model, int year, double price,double engineDisplacement, String engineType) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.engineDisplacement = engineDisplacement;
        this.engineType = engineType;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "engineDisplacement=" + engineDisplacement +
                ", engineType='" + engineType + '\'' +
                ", id='" + id + '\'' +
                ", licensePlate='" + licensePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", getVehicleAge= " + getVehicleAge() +
                '}';
    }

    @Override
    int getVehicleAge() {
        return Year.now().getValue() - this.year;
    }

    @Override
    public void refuel() {
        System.out.println("La moto está repostando gasolina");
    }
}
