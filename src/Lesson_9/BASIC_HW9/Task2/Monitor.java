package Lesson_9.BASIC_HW9.Task2;

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
}
