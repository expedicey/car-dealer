public class Customer {
    private String name;
    private String address;
    private double priceRange;

    public Customer(String name, String address, double priceRange) {
        this.name = name;
        this.address = address;
        this.priceRange = priceRange;
    }

    public void sendInquiry(String message) {
        System.out.println(name + " sent an inquiry: " + message);
        System.out.println();
    }
    
    public void respondToOffer(Dealer dealer, Vehicle car, Vehicle alternative) {
        if (car.getPrice() <= this.priceRange && car.getQuantity() > 0) {
            System.out.println(name + " told " + dealer.getName() + " that they will take the " + car.getMake() + " " + car.getModel() + " and asked to ship it to " + address);
            System.out.println();
        } else if (alternative.getPrice() <= this.priceRange && alternative.getQuantity() > 0) {
            System.out.println(name + " told " + dealer.getName() + " that they are interested in the " + alternative.getMake() + " " + alternative.getModel() + " and asked to ship it to " + address);
            System.out.println();
        } else {
            System.out.println(name + " told " + dealer.getName() + " that both cars are out of their price range.");
            System.out.println();
        }
    }

    public String getName() {
        return name;
    }

    public double getPriceRange() {
        return priceRange;
    }

    public String getAddress() {
        return address;
    }
}