package SmartHomeApp;

import SmartHomeApp.Devices.Device;

public class DeviceController {
    public void turnOnDevice(Device device) {
        device.startDevice();
    }
}
