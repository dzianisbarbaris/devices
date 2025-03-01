public class Laptop extends Device implements Chargeable {

    private int batteryLife;

    public Laptop(String serialNumber, String model, int batteryLevel, int batteryLife) {
        super(serialNumber, model, batteryLevel);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    public void setBatteryLife(int batteryLife) {
        this.batteryLife = batteryLife;
    }

    @Override
    public void charge(int amount) {
        setBatteryLevel(getBatteryLevel() + amount);
    }

    @Override
    public String toString() {
        return "Устройство: " + getModel() + ", серийный номер: " + getSerialNumber() + ", время работы от батареи: "
                + getBatteryLife() + ", заряд: " + getBatteryLevel() + "%";
    }
}
