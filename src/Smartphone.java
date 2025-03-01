public class Smartphone extends Device implements Chargeable{

    private int cameraResolution;

    public Smartphone(String serialNumber, String model, int batteryLevel, int cameraResolution) {
        super(serialNumber, model, batteryLevel);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    public void setCameraResolution(int cameraResolution) {
        this.cameraResolution = cameraResolution;
    }

    @Override
    public void charge(int amount) {
        setBatteryLevel(getBatteryLevel() + amount);
    }

    @Override
    public String toString() {
        return "Устройство: " + getModel() + ", серийный номер: " + getSerialNumber() + ", камера: "
                + getCameraResolution() + ", заряд: " + getBatteryLevel() + "%";
    }
}
