public class Smartphone extends Device implements Chargeable{

    private final int cameraResolution;

    public Smartphone(String serialNumber, String model, int batteryLevel, int cameraResolution) {
        super(serialNumber, model, batteryLevel);
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution() {
        return cameraResolution;
    }

    @Override
    public void charge(int amount) {
        setBatteryLevel(getBatteryLevel() + amount > 100? 100 : getBatteryLevel() + amount);
        System.out.println("Смартфон заряжен до " + getBatteryLevel() + " %");
    }

    @Override
    public String toString() {
        return "Устройство: " + getModel() + ", серийный номер: " + getSerialNumber() + ", камера: "
                + getCameraResolution() + ", заряд: " + getBatteryLevel() + "%";
    }
}
