Создайте новый репозиторий в github. Создайте новый проект и сделайте там задачу, и запуште в новый репозиторий(ветка main). Удачи !!!!! Да прибудет с вами GIT
Где сделать константы где final где static сами решите.

Описание задачи:
Базовый класс Device:

Поля:
String serialNumber – серийный номер (уникален для каждого устройства).
String model – модель устройства.
int totalDevices – общее количество устройств.
int batteryLevel - уровень заряда устройства
Методы:
Конструктор инициализирует поля и увеличивает totalDevices.
String getSerialNumber() – возвращает серийный номер (нельзя переопределить).
toString() – возвращает информацию об устройстве.
equals() и hashCode() – два устройства считаются одинаковыми, если совпадают серийные номера.
clone() – создание копии устройства.
--------------------------------------------------
Классы-наследники:

Smartphone – добавляет поле int cameraResolution (разрешение камеры).
Переопределяет toString() для добавления информации о камере.
charge() увеличивает уровень заряда, но не больше 100%

Laptop – добавляет поле int batteryLife (время работы от батареи).
Переопределяет toString() для добавления информации о батарее.
charge() увеличивает уровень заряда, но не больше 100%

Класс DeviceManager:

void printDevice(Device device) – выводит информацию об устройстве.
void printDevice(Device[] devices) – выводит информацию об устройствах.
int getTotalDevices() – возвращает количество всех устройств.
void chargeDevice(Chargeable device, int amount) – заряжает одно устройство.
void chargeDevice(Chargeable[] devices, int amount) – заряжает массив устройств.
----------------------------------------------
Интерфейс Chargeable:
Описывает способность устройства заряжаться.
Методы:
void charge(int amount) – заряжает устройство на указанное количество процентов. amount - это количество процентов на которое подзарядится устройство
int getBatteryLevel() – возвращает текущий уровень заряда.
Реализация в классах:
Smartphone и Laptop будут реализовывать Chargeable, потому что они умеют заряжаться.
DeviceManager будет использовать интерфейс Chargeable для зарядки всех устройств.

-----------------------------Класс Main -------------------------
public class Main {
public static void main(String[] args) {
Device phone1 = new Smartphone("123-456-789", "Galaxy S21", 108);
Device laptop1 = new Laptop("987-654-321", "MacBook Pro", 10);

        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

        System.out.println("\nЗаряжаем устройства:");
        DeviceManager.chargeDevice(phone1, 30);
        DeviceManager.chargeDevice(laptop1, 50);

        System.out.println("\nПосле зарядки:");
        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);

        Chargeable[] chargeables = {phone1, laptop1};
        System.out.println("\nЗаряжаем все устройства еще раз:");
        DeviceManager.chargeDevice(chargeables, 20);

        System.out.println("\nПосле повторной зарядки:");
        DeviceManager.printDevice(phone1);
        DeviceManager.printDevice(laptop1);
    }
}

---------------Консоль-------------------------------
Устройство: Galaxy S21, серийный номер: 123-456-789, камера: 108 MP, заряд: 50%
Устройство: MacBook Pro, серийный номер: 987-654-321, время работы от батареи: 10 часов, заряд: 30%

Заряжаем устройства:
Смартфон заряжен до 80%
Ноутбук заряжен до 80%

После зарядки:
Устройство: Galaxy S21, серийный номер: 123-456-789, камера: 108 MP, заряд: 80%
Устройство: MacBook Pro, серийный номер: 987-654-321, время работы от батареи: 10 часов, заряд: 80%

Заряжаем все устройства еще раз:
Смартфон заряжен до 100%
Ноутбук заряжен до 100%

После повторной зарядки:
Устройство: Galaxy S21, серийный номер: 123-456-789, камера: 108 MP, заряд: 100%
Устройство: MacBook Pro, серийный номер: 987-654-321, время работы от батареи: 10 часов, заряд: 100%

