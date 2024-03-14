public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;

    public Customer(String name, String address, String phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public void sendInquiry(String message) {
        System.out.println(name + " sent an inquiry: " + message);
    }
    
    public void respondToOffer(Dealer dealer, Vehicle car, Vehicle alternative) {
        if (car.getQuantity() > 0) {
            System.out.println(name + " told " + dealer.getName() + " that they will take the " + car.getMake() + " " + car.getModel() + " and asked to ship it to " + address);
        } else {
            System.out.println(name + " told " + dealer.getName() + " that they are interested in the " + alternative.getMake() + " " + alternative.getModel() + " and asked to ship it to " + address);
        }
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

}