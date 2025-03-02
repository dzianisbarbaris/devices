public class Laptop extends Device implements Chargeable {

    private final int batteryLife;

    public Laptop(String serialNumber, String model, int batteryLevel, int batteryLife) {
        super(serialNumber, model, batteryLevel);
        this.batteryLife = batteryLife;
    }

    public int getBatteryLife() {
        return batteryLife;
    }

    @Override
    public void charge(int amount) {
        setBatteryLevel(getBatteryLevel() + amount > 100? 100 : getBatteryLevel() + amount);
        System.out.println("Ноутбук заряжен до " + getBatteryLevel() + " %");
    }

    @Override
    public String toString() {
        return "Устройство: " + getModel() + ", серийный номер: " + getSerialNumber() + ", время работы от батареи: "
                + getBatteryLife() + ", заряд: " + getBatteryLevel() + "%";
    }
}
