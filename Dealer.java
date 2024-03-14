public class Dealer {
    private String name;
    private String address;

    public Dealer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void sellCar(Customer customer, Vehicle car, Vehicle alternative) {
        if (car.getQuantity() > 0) {
            System.out.println(name + " sold a " + car.getMake() + " " + car.getModel() + " to " + customer.getName());
            car.setQuantity(car.getQuantity() - 1);
        } else {
            System.out.println(name + " sold a " + alternative.getMake() + " " + alternative.getModel() + " to " + customer.getName());
            alternative.setQuantity(alternative.getQuantity() - 1);
        }
    }

    public void respondToInquiry(Vehicle car, Vehicle alternative) {
        if (car.getQuantity() > 0) {
            System.out.println("Dear customer, the " + car.getMake() + " " + car.getModel() + " is a great choice. It's a " + car.getYear() + " model and costs $" + car.getPrice() + ".");
        } else {
            System.out.println("I'm sorry, but the " + car.getMake() + " " + car.getModel() + " is not currently available. However, we have a " + alternative.getMake() + " " + alternative.getModel() + " available. It's a " + alternative.getYear() + " model and costs $" + alternative.getPrice() + ".");
        }
    }

    public void repairCar(Car car) {
        if (car.isDamaged()) {
            car.repair();
            System.out.println("The " + car.getMake() + " " + car.getModel() + " has been repaired.");
        } else {
            System.out.println("The " + car.getMake() + " " + car.getModel() + " does not need repairs.");
        }
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}