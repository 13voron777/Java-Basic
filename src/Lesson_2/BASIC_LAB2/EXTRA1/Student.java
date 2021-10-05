package Lesson_2.BASIC_LAB2.EXTRA1;

public class Student {
    private String fio;
    private String birth_date;
    private String contactNum;
    private int groupNum;
    private static int counter;

    public Student(String fio, String birth_date) {
        this.fio = fio;
        this.birth_date = birth_date;
        counter++;
    }

    public Student(String fio, String birth_date, String contactNum, int groupNum) {
        this(fio, birth_date);
        this.contactNum = contactNum;
        this.groupNum = groupNum;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public void setBirth_date(String birth_date) {
        this.birth_date = birth_date;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getFio() {
        return fio;
    }

    public String getBirth_date() {
        return birth_date;
    }

    public String getContactNum() {
        return contactNum;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Student: FIO: " + fio + ", birth_date: "+ birth_date
                + ", contactNum: " + contactNum + ", groupNum: " + groupNum;
    }
}
