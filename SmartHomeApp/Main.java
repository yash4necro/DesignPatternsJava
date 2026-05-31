package SmartHomeApp;

import SmartHomeApp.Devices.Heater;
import SmartHomeApp.Devices.Light;

public class Main {
    public static void main(String[] args) {
        Light philipsHueLight = new Light("Living Room");
        DeviceController lightController = new DeviceController();
        lightController.turnOnDevice(philipsHueLight);

        Heater honeywellHeater = new Heater("Basement"); 
        DeviceController heaterController = new DeviceController();
        heaterController.turnOnDevice(honeywellHeater);
    }
}
