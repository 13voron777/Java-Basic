package Lesson_8.BASIC_HW8.Task2;

public class Worker {
    private String fio;
    private String work;
    private int startYear;

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void setStartYear(int startYear) {
        this.startYear = startYear;
    }

    public String getFio() {
        return fio;
    }

    public String getWork() {
        return work;
    }

    public int getStartYear() {
        return startYear;
    }

    @Override
    public String toString() {
        return "fio = " + this.getFio() +
                "; work = " + this.getWork() +
                "; startYear = " + this.getStartYear();
    }
}
