interface Vehicle {
    void start();
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

class Bike implements Vehicle {
    public void start() {
        System.out.println("Bike Started");
    }
}

class VehicleFactory {

    public static Vehicle getVehicle(String type) {

        if (type.equalsIgnoreCase("Car"))
            return new Car();

        return new Bike();
    }
}

public class FactoryPattern {

    public static void main(String[] args) {

        Vehicle v1 = VehicleFactory.getVehicle("Car");
        Vehicle v2 = VehicleFactory.getVehicle("Bike");

        v1.start();
        v2.start();
    }
}