public class Dealer {
    private String name;
    private String address;
    private Car[] cars;
    private int carCount = 0;

    public Dealer(String name, String address) {
        this.name = name;
        this.address = address;
        this.cars = new Car[10];
    }

    public void addCar(Car car) {
        if (carCount == cars.length) {
            Car[] temp = new Car[cars.length * 2];
            for (int i = 0; i < carCount; i++) {
                temp[i] = cars[i];
            }
            cars = temp;
        }
        cars[carCount] = car;
        carCount++;
    }

    public void sellCar(Customer customer, Car car, Car alternative) {
        if (car.calculateTotalPrice() <= customer.getPriceRange() && car.getQuantity() > 0) {
            System.out.println(name + " sold a " + car.getMake() + " " + car.getModel() + " to " + customer.getName());
            System.out.println();
            car.setQuantity(car.getQuantity() - 1);
        } else if (alternative.calculateTotalPrice() <= customer.getPriceRange() && alternative.getQuantity() > 0) {
            System.out.println(name + " sold a " + alternative.getMake() + " " + alternative.getModel() + " to " + customer.getName());
            System.out.println();
            alternative.setQuantity(alternative.getQuantity() - 1);
        } else {
            System.out.println(name + " could not sell a car to " + customer.getName() + " because both cars are out of their price range.");
        }
        
    }

    public void respondToInquiry(Customer customer, Car car, Car alternative) {
        if (car.getQuantity() > 0 && car.calculateTotalPrice() <= customer.getPriceRange()) {
            System.out.println("Dear customer, here are the details of the car you're interested in:");
            car.displayVehicleDetails();
            System.out.println("And for the Price this year: $" + car.calculateTotalPrice());
        } else {
            if (alternative.calculateTotalPrice() < customer.getPriceRange() && alternative.getQuantity() > 0) {
                System.out.println("I'm sorry, but the car you're interested in is not currently available or over your budget. However, we have a cheaper alternative:");
                alternative.displayVehicleDetails();
                System.out.println("And for the Price this year: $" + alternative.calculateTotalPrice());
            } else {
                System.out.println("I'm sorry, but we don't have any cheaper alternatives at the moment.");
            }
        }
        System.out.println();
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

}