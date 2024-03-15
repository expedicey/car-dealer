public class Dealer {
    private String name;
    private String address;

    public Dealer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public void sellCar(Customer customer, Vehicle car, Vehicle alternative) {
        if (car.getPrice() <= customer.getPriceRange() && car.getQuantity() > 0) {
            System.out.println(name + " sold a " + car.getMake() + " " + car.getModel() + " to " + customer.getName());
            System.out.println();
            car.setQuantity(car.getQuantity() - 1);
        } else if (alternative.getPrice() <= customer.getPriceRange() && alternative.getQuantity() > 0) {
            System.out.println(name + " sold a " + alternative.getMake() + " " + alternative.getModel() + " to " + customer.getName());
            System.out.println();
            alternative.setQuantity(alternative.getQuantity() - 1);
        } else {
            System.out.println(name + " could not sell a car to " + customer.getName() + " because both cars are out of their price range.");
        }
    }

    public void respondToInquiry(Customer customer, Vehicle car, Vehicle alternative) {
        if (car.getQuantity() > 0 && car.getPrice() <= customer.getPriceRange()) {
            System.out.println("Dear customer, the " + car.getMake() + " " + car.getModel() + " is a great choice. It's a " + car.getYear() + " model and costs $" + car.getPrice() + ".");
            System.out.println();
        } else if (alternative.getPrice() < car.getPrice() && alternative.getQuantity() > 0) {
            System.out.println("I'm sorry, but the " + car.getMake() + " " + car.getModel() + " is not currently available or over your budget. However, we have a cheaper alternative: the " + alternative.getMake() + " " + alternative.getModel() + ". It's a " + alternative.getYear() + " model and costs $" + alternative.getPrice() + ".");
            System.out.println();
        } else {
            System.out.println("I'm sorry, but we don't have any cheaper alternatives at the moment.");
        }
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}