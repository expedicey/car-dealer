public class Car extends Vehicle {
    public Car(String make, String model, int year, double price, int quantity) {
        super(make, model, year, price, quantity);
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }
}