package main.java.com.demo.dp.creational.factorymethod;

public class TestFactory {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle(VehicleType.YACHT);
        System.out.println(vehicle.getVehicleName());
    }
}
