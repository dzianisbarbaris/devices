public class DeviceManager {

    public static void printDevice(Device device) {
        System.out.println(device.toString());
    }

    public void printDevice(Device[] devices) {
        for (int i = 0; i < devices.length; i++) {
            System.out.println(devices[i].toString());
        }
    }

    public static int getTotalDevices() {
        return Device.getTotalDevices();
    }


    public static void chargeDevice(Chargeable device, int amount) {
        device.charge(amount);
    }

    public static void chargeDevice(Chargeable[] devices, int amount) {
        for (int i = 0; i < devices.length; i++) {
            devices[i].charge(amount);
        }
    }
}
