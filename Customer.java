package IS202_EL_00000099782_Raiyan_week6;

public class Customer {
    private String name;
    private String address;
    private String phoneNumber;
    private String email;
    private String preferredCarModel;

    public Customer(String name, String address, String phoneNumber, String email, String preferredCarModel) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.preferredCarModel = preferredCarModel;
    }

    public void sendInquiry(String message) {
        System.out.println(name + " sent an inquiry: " + message);
    }

    public String getName() {
        return name;
    }
}