import java.time.Year;

public class Car extends Vehicle {
    public Car(String make, String model, int year, int price, int quantity) {
        super(make, model, year, price, quantity);
    }

    public double calculateDepreciation() {
        int currentYear = Year.now().getValue();
        int age = currentYear - this.getYear();
        double depreciationRate = 0.45;
        double depreciation = this.getPrice() * Math.pow(1 - depreciationRate, age);
        return depreciation; 
    }

    public double calculateTotalPrice() {
        double depreciation = calculateDepreciation();
        return price - depreciation;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year);
    }

}