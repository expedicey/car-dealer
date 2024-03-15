public abstract class Vehicle {
    protected String make;
    protected String model;
    protected int year;
    protected int price;
    protected int quantity;

    public Vehicle(String make, String model, int year, int price, int quantity) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.quantity = quantity;
    }

    public abstract void displayVehicleDetails();

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

    public int getPrice() {
        return this.price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


}