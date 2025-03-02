import java.util.Objects;
import java.util.Random;

public abstract class Device implements Cloneable {
    private final String serialNumber;
    private final String model;
    private static int totalDevices = 0;
    private int batteryLevel;

    public Device(String serialNumber, String model, int batteryLevel) {
        this.serialNumber = serialNumber;
        this.model = model;
        this.batteryLevel = batteryLevel;
        totalDevices++;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public static int getTotalDevices() {
        return totalDevices;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Device device = (Device) o;
        return Objects.equals(serialNumber, device.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(serialNumber);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Устройство: " + getModel() + ", серийный номер: " + getSerialNumber() + ", заряд: " + getBatteryLevel() + "%";
    }

}
