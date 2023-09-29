package main.java.com.demo.dp.creational.factorymethod;

public class VehicleFactory {
    private VehicleFactory() {
    }

    public static final Vehicle getVehicle(VehicleType vehicleType) {
        return switch (vehicleType) {
            case CAR -> new Car();
            case YACHT -> new Yacht();
            default -> throw new IllegalArgumentException("This type is invalid");
        };
    }
}
