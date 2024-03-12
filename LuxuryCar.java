package IS202_EL_00000099782_Raiyan_week6;

public class LuxuryCar extends Car {
    private String luxuryFeatures;

    public LuxuryCar(String make, String model, int year, double price, boolean availability, String luxuryFeatures) {
        super(make, model, year, price, availability);
        this.luxuryFeatures = luxuryFeatures;
    }

    @Override
    public void displayVehicleDetails() {
        super.displayVehicleDetails();
        System.out.println("Luxury Features: " + luxuryFeatures);
    }
}