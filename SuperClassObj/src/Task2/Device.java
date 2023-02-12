package Task2;

import java.sql.SQLOutput;

public class Device {
    String manufacturer;
    float price;
    String serialNumber;

    Device(String manufacturer, float price, String serialNumber){
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if(obj == null || getClass() != obj.getClass()) return false;
        Device device = (Device) obj;
        if (manufacturer != device.manufacturer && price != device.price && serialNumber != device.serialNumber) return false;
        return true;
    }


    @Override
    public int hashCode(){

        int result = 17;

        result = 37 * result + (manufacturer == null ? 0 : manufacturer.hashCode());
        result = 37 * result + Float.floatToIntBits(price);
        result = 37 * result + (serialNumber == null ? 0 : serialNumber.hashCode());

        return result;
    }

    public static void main(String[] args) {
        //Task 1
        Device device = new Device("Samsung", 120, "ZXC111211UE");
        Device device2 = new Device("Samsung", 120, "ZXC111211UE");
        Device device3 = device;
        //Task 2
        Device device4 = new Device("Apple", 110, "ZXC111211AE");
        Device device5 = new Device("Xiaomi", 180, "ZXC321211UE");

        //Task 1
        Monitor monitor = new Monitor(1920, 1080);
        Monitor monitor2 = new Monitor(1920, 1080);
        Monitor monitor3 = monitor;
        //Task 2
        Monitor monitor4 = new Monitor(2560, 1980);
        Monitor monitor5 = new Monitor(0, 0);

        //Task 1
        EthernetAdapter ethernetAdapter = new EthernetAdapter(1, "EUI-48");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter(1, "EUI-48");
        EthernetAdapter ethernetAdapter3 = ethernetAdapter;
        //Task 2
        EthernetAdapter ethernetAdapter4 = new EthernetAdapter(10, "EUI-58");
        EthernetAdapter ethernetAdapter5 = new EthernetAdapter(4, "EUI-96");


        System.out.println("Task1: ");
        System.out.println(device.equals(device2));
        System.out.println(device.equals(device3));
        System.out.println(" ");
        System.out.println(monitor.equals(monitor2));
        System.out.println(monitor.equals(monitor3));
        System.out.println(" ");
        System.out.println(ethernetAdapter.equals(ethernetAdapter2));
        System.out.println(ethernetAdapter.equals(ethernetAdapter3));
        System.out.println(" ");
        System.out.println("Task2: ");
        System.out.println(device.hashCode());
        System.out.println(device4.hashCode());
        System.out.println(device5.hashCode());
        System.out.println(" ");
        System.out.println(monitor.hashCode());
        System.out.println(monitor4.hashCode());
        System.out.println(monitor5.hashCode());
        System.out.println(" ");
        System.out.println(ethernetAdapter.hashCode());
        System.out.println(ethernetAdapter4.hashCode());
        System.out.println(ethernetAdapter5.hashCode());
    }

}
