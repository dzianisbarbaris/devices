public class DeviceManager {

    static void printDevice(Device device) {
        System.out.println(device.toString());
    }

    void printDevice(Device[] devices) {
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i].toString());
        }
    }

    int getTotalDevices() {
        return getTotalDevices();
    }

    static void chargeDevice(Chargeable device, int amount) {
        device.charge(amount);
    }

    static void chargeDevice(Chargeable[] devices, int amount) {
        for (int i = 0; i < devices.length;i++) {
            devices[i].charge(amount);
        }
    }
}
