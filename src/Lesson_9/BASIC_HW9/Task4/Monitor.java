package Lesson_9.BASIC_HW9.Task4;

public class Monitor extends Device {
    private int resolutionX;
    private int resolutionY;

    public Monitor(String manufacturer, int resolutionX, int resolutionY) {
        super(manufacturer);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", X = " + getResolutionX() +
                ", Y = " + getResolutionY();
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Monitor monitor = (Monitor) o;
        return this.getPrice() == monitor.getPrice()
                && this.getManufacturer().equals(monitor.getManufacturer())
                && this.getSerialNumber().equals(monitor.getSerialNumber())
                && this.getResolutionX() == monitor.getResolutionX()
                && this.getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 37 * result + (getManufacturer() == null ? 0 : getManufacturer().hashCode());
        result = 37 * result + Float.floatToIntBits(getPrice());
        result = 37 * result + (getSerialNumber() == null ? 0 : getSerialNumber().hashCode());
        result = 37 * result + getResolutionX();
        result = 37 * result + getResolutionY();
        return result;
    }
}
