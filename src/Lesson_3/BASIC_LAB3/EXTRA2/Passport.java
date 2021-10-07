package Lesson_3.BASIC_LAB3.EXTRA2;

public class Passport {
    private String firstName;
    private String secondName;
    private String middleName;
    private String birthDate;
    private int serial;
    private int number;

    public Passport(String firstName, String secondName, String middleName, String birthDate, int serial, int number) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.middleName = middleName;
        this.birthDate = birthDate;
        this.serial = serial;
        this.number = number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public int getSerial() {
        return serial;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Passport: " +
                "firstName = " + firstName +
                ", secondName = " + secondName +
                ", middleName = " + middleName +
                ", birthDate = " + birthDate +
                ", serial = " + serial +
                ", number = " + number;
    }
}
