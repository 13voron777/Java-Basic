package Lesson_9.BASIC_HW9.Task3;

public class Run {
    public static void main(String[] args) {
        Device device = new Device("Samsung");
        device.setPrice(500.5f);
        device.setSerialNumber("67421");

        Monitor monitor = new Monitor("Motorola", 2000, 1200);
        monitor.setPrice(400.8f);
        monitor.setSerialNumber("74332");

        EthernetAdapter ethernetAdapter = new EthernetAdapter("LG", 1000);
        ethernetAdapter.setPrice(300.3f);
        ethernetAdapter.setSerialNumber("23231");
        ethernetAdapter.setMac("H1:B4:O2:P0:C6:F7");

        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);
    }
}
