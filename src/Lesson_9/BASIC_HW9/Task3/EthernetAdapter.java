package Lesson_9.BASIC_HW9.Task3;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, int speed) {
        super(manufacturer);
        this.speed = speed;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public String getMac() {
        return mac;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", speed = " + getSpeed() +
                ", mac = " + getMac();
    }
}
