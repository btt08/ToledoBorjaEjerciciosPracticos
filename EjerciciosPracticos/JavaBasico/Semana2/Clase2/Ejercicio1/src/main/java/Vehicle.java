import java.time.Year;
import java.util.Calendar;

public abstract class Vehicle {
    String id;
    String licensePlate;
    String brand;
    String model;
    int year;
    double price;

    abstract int getVehicleAge();
}

