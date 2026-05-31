package SmartHomeApp.Devices;

public class Heater implements Device {
    private String location;

    public Heater(String location) {
        this.location = location;
    }

    public void startDevice() {
        System.out.println("Heater turned on in " + location);
    }
}
