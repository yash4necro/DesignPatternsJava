package SmartHomeApp.Devices;

public class Light implements Device {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void startDevice() {
        System.out.println("Light turned on in " + location);
    }
}
