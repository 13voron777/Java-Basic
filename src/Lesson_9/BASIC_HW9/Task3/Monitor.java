package Lesson_9.BASIC_HW9.Task3;

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
}
