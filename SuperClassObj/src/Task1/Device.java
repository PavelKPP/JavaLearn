package Task1;

public class Device {
    String Manufacturer;
    float price;
    String serialNumber;

    Device(String Manufactrurer, float price, String serialNumber){
        this.Manufacturer = Manufactrurer;
        this.price = price;
        this.serialNumber = serialNumber;
    }


    @Override
    public String toString(){
        return String.format("manufacturer= %s, price=%d, serialNumber=%s", Manufacturer, (int)price, serialNumber);
    }

    public static void main(String[] args) {
        Device device = new Device("Apple", 120, "ZX6543217AA");
        Monitor monitor = new Monitor(1920, 1080);



        System.out.println("Device: " + device);
        System.out.println("Monitor: " + device + " " + monitor);
    }

}
