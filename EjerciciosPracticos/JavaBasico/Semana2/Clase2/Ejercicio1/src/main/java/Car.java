import java.time.Year;

public class Car extends Vehicle implements Electric {
    double batteryCapacity;
    double drivingRange;

    public Car(String id, String licensePlate, String brand, String model, int year, double price, double batteryCapacity, double drivingRange) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.batteryCapacity = batteryCapacity;
        this.drivingRange = drivingRange;
    }

    @Override
    public String toString() {
        return "Car{" +
                "batteryCapacity=" + batteryCapacity +
                ", drivingRange=" + drivingRange +
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
    public void chargeEnergy() {
        System.out.println("El coche está cargando la batería");
    }

    @Override
    int getVehicleAge() {
        return Year.now().getValue() - this.year;
    }
}
