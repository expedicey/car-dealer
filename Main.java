public class Main {
    public static void main(String[] args) {
        // Create a car
        Car car = new Car("Toyota", "Corolla", 2020, 20000, 7);
        Car car2 = new Car("Honda", "Civic", 2021, 25000, 2);
        Car car3 = new Car("Toyota", "Camry", 2021, 15000, 5);

        // Create a customer
        Customer customer = new Customer("John Doe", "123 Main St",15000);
        Customer customer2 = new Customer("Jane Doe", "789 Second St", 80000);
        
        // Create a dealer
        Dealer dealer = new Dealer("ABC Motors", "456 High St");

        System.out.println("First Customer");
        customer.sendInquiry("I am interested in " + car.getMake() + " " + car.getModel() + ". And i have a budget of $" + customer.getPriceRange());
        dealer.respondToInquiry(customer, car, car3);
        customer.respondToOffer(dealer, car, car3);
        dealer.sellCar(customer, car, car3);

        System.out.println("-----------------------------------");
        System.out.println("Second Customer");
        customer2.sendInquiry("I am interested in " + car2.getMake() + " " + car2.getModel() + ". And i have a budget of $" + customer2.getPriceRange());
        dealer.respondToInquiry(customer2, car2, car);
        customer2.respondToOffer(dealer, car2, car);
        dealer.sellCar(customer2, car2, car);

    }
}