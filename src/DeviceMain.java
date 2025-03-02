public class DeviceMain {
    public static void main(String[] args) {

        Device phone1 = new Smartphone("123-456-789", "Galaxy S21", 50, 108);
        Device laptop1 = new Laptop("987-654-321", "MacBook Pro", 30, 10);

        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

        System.out.println("\nЗаряжаем устройства:");
        DeviceManager.chargeDevice((Chargeable) phone1, 30);
        DeviceManager.chargeDevice((Chargeable) laptop1, 50);

        System.out.println("\nПосле зарядки:");
        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

        Chargeable[] chargeables = {(Chargeable) phone1, (Chargeable) laptop1};
        System.out.println("\nЗаряжаем все устройства еще раз:");
        DeviceManager.chargeDevice(chargeables, 20);

        System.out.println("\nПосле повторной зарядки:");
        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

    }
}
