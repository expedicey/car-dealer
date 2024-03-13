package IS202_EL_00000099782_Raiyan_week6;

public class Main {
    public static void main(String[] args) {
        // Create a car
        Car car = new Car("Toyota", "Corolla", 2020, 20000, 7);
        Car car2 = new Car("Honda", "Civic", 2021, 25000, 2);
        Car car3 = new Car("Toyota", "Camry", 2021, 30000, 5);

        // Create a luxury car
        LuxuryCar luxuryCar = new LuxuryCar("Mercedes", "S Class", 2021, 100000, 2, "Leather seats, Sunroof");

        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St", "123-456-7890", "johndoe@example.com");
        Customer customer2 = new Customer("Jane Doe", "789 Second St", "987-654-3210", "janedoe@example.com");

        // Create a dealer
        Dealer dealer = new Dealer("ABC Motors", "456 High St");

        // Customer sends an inquiry
        customer.sendInquiry("I am interested in the " + car.getMake() + " " + car.getModel());
        customer2.sendInquiry("I am interested in the " + luxuryCar.getMake() + " " + luxuryCar.getModel());

        // Dealer responds to the inquiry
        dealer.respondToInquiry(car, car2);
        dealer.respondToInquiry(luxuryCar, car3);

        // Customer responds to the offer
        customer.respondToOffer(dealer, car, luxuryCar);
        customer2.respondToOffer(dealer, luxuryCar, car3);

        // Dealer sells a car
        dealer.sellCar(customer, car, luxuryCar);
        dealer.sellCar(customer2, luxuryCar, car3);
    }
}