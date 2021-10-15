package Lesson_9.BASIC_HW9.Task4;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EthernetAdapter ethernetAdapter = (EthernetAdapter) o;
        return this.getPrice() == ethernetAdapter.getPrice()
                && this.getManufacturer().equals(ethernetAdapter.getManufacturer())
                && this.getSerialNumber().equals(ethernetAdapter.getSerialNumber())
                && this.getSpeed() == ethernetAdapter.getSpeed()
                && this.getMac().equals(ethernetAdapter.getMac());
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        result = 37 * result + speed;
        result = 37 * result + (getMac() == null ? 0 : getMac().hashCode());
        return result;
    }
}
