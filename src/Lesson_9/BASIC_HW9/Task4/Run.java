package Lesson_9.BASIC_HW9.Task4;

public class Run {
    public static void main(String[] args) {
        Device device1 = new Device("Samsung");
        device1.setPrice(500.5f);
        device1.setSerialNumber("67421");
        Device device2 = new Device("Samsung");
        device2.setPrice(500.5f);
        device2.setSerialNumber("67421");
        Device device3 = device1;

        Monitor monitor1 = new Monitor("Motorola", 2000, 1200);
        monitor1.setPrice(400.8f);
        monitor1.setSerialNumber("74332");
        Monitor monitor2 = new Monitor("Motorola", 2000, 1200);
        monitor2.setPrice(400.8f);
        monitor2.setSerialNumber("74332");
        Monitor monitor3 = monitor1;

        EthernetAdapter ethernetAdapter1 = new EthernetAdapter("LG", 1000);
        ethernetAdapter1.setPrice(300.3f);
        ethernetAdapter1.setSerialNumber("23231");
        ethernetAdapter1.setMac("H1:B4:O2:P0:C6:F7");
        EthernetAdapter ethernetAdapter2 = new EthernetAdapter("LG", 1000);
        ethernetAdapter2.setPrice(300.3f);
        ethernetAdapter2.setSerialNumber("23231");
        ethernetAdapter2.setMac("H1:B4:O2:P0:C6:F7");
        EthernetAdapter ethernetAdapter3 = ethernetAdapter1;

        System.out.println("Devices:");
        System.out.println("1: " + device1 + "\n2: " + device2 + "\n3: " + device3);
        System.out.println("device1 equals device2: " + device1.equals(device2));
        System.out.println("device1 equals device3: " + device1.equals(device3));
        System.out.println("device2 equals device3: " + device2.equals(device3));
        System.out.println("device1 hashcode: " + device1.hashCode());
        System.out.println("device2 hashcode: " + device2.hashCode());
        System.out.println("device3 hashcode: " + device3.hashCode());

        System.out.println("\nMonitors:");
        System.out.println("1: " + monitor1 + "\n2: " + monitor2 + "\n3: " + monitor3);
        System.out.println("monitor1 equals monitor2: " + monitor1.equals(monitor2));
        System.out.println("monitor1 equals monitor3: " + monitor1.equals(monitor3));
        System.out.println("monitor2 equals monitor3: " + monitor2.equals(monitor3));
        System.out.println("monitor1 hashcode: " + monitor1.hashCode());
        System.out.println("monitor2 hashcode: " + monitor2.hashCode());
        System.out.println("monitor3 hashcode: " + monitor3.hashCode());

        System.out.println("\nEthernetAdapters:");
        System.out.println("1: " + ethernetAdapter1 + "\n2: " + ethernetAdapter2 + "\n3: " + ethernetAdapter3);
        System.out.println("ethernetAdapter1 equals ethernetAdapter2: " + ethernetAdapter1.equals(ethernetAdapter2));
        System.out.println("ethernetAdapter1 equals ethernetAdapter3: " + ethernetAdapter1.equals(ethernetAdapter3));
        System.out.println("ethernetAdapter2 equals ethernetAdapter3: " + ethernetAdapter2.equals(ethernetAdapter3));
        System.out.println("ethernetAdapter1 hashcode: " + ethernetAdapter1.hashCode());
        System.out.println("ethernetAdapter2 hashcode: " + ethernetAdapter2.hashCode());
        System.out.println("ethernetAdapter3 hashcode: " + ethernetAdapter3.hashCode());
    }
}
