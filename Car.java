package IS202_EL_00000099782_Raiyan_week6;

public class Car extends Vehicle {
    private int quantity;

    public Car(String make, String model, int year, double price, int quantity) {
        super(make, model, year, price);
        this.quantity = quantity;
    }

    @Override
    public void displayVehicleDetails() {
        System.out.println("Make: " + make + ", Model: " + model + ", Year: " + year + ", Price: " + price);
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}