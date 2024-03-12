package IS202_EL_00000099782_Raiyan_week6;

public class Dealer {
    private String name;
    private String address;

    public Dealer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void sellCar(Car car, Customer customer) {
        System.out.println(name + " sold a " + car.getMake() + " " + car.getModel() + " to " + customer.getName());
    }

    public void respondToInquiry(Car car) {
        System.out.println("Dear customer, the " + car.getMake() + " " + car.getModel() + " is a great choice. It's a " + car.getYear() + " model and costs $" + car.getPrice() + ".");
    }

    
}