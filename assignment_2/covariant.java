// Superclass
class Vehicle {
    Vehicle getVehicle() {
        System.out.println("This is a Vehicle");
        return this;
    }
}

// Subclass
class Car extends Vehicle {
    @Override
    Car getVehicle() {
        System.out.println("This is a Car");
        return this;
    }
}

public class covariant {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle();
        Car myCar = new Car();
        Vehicle myAnotherCar = new Car(); // Demonstrating polymorphism
        
        // Calls method in Vehicle class
        myVehicle.getVehicle();
        
        // Calls overridden method in Car class
        myCar.getVehicle();
        
        // Calls overridden method in Car class due to polymorphism
        myAnotherCar.getVehicle();
    }
}
