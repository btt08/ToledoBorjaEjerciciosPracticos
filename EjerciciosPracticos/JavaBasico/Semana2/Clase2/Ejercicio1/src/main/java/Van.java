import java.time.Year;

public class Van extends Vehicle implements Combustion{
    int tankCapacity;
    int gasRange;

    public Van(String id, String licensePlate, String brand, String model, int year, double price, int tankCapacity, int gasRange) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.tankCapacity = tankCapacity;
        this.gasRange = gasRange;
    }

    @Override
    public String toString() {
        return "Van{" +
                "tankCapacity=" + tankCapacity +
                ", gasRange=" + gasRange +
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
    public void refuel() {
        System.out.println("La camioneta está repostando gasolina");
    }

    @Override
    int getVehicleAge() {
        return Year.now().getValue() - this.year;
    }
}
