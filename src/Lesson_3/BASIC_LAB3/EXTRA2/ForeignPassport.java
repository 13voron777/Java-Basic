package Lesson_3.BASIC_LAB3.EXTRA2;

import java.util.Arrays;

public class ForeignPassport extends Passport {
    private String[] visas;

    public ForeignPassport(String firstName, String secondName, String middleName, String birthDate,
                           int serial, int number, String[] visas) {
        super(firstName, secondName, middleName, birthDate, serial, number);
        this.visas = visas;
    }

    public String[] getVisas() {
        return visas;
    }

    @Override
    public String toString() {
        return "ForeignPassport: " +
                "firstName = " + this.getFirstName() +
                ", secondName = " + this.getSecondName() +
                ", middleName = " + this.getMiddleName() +
                ", birthDate = " + this.getBirthDate() +
                ", serial = " + this.getSerial() +
                ", number = " + this.getNumber() +
                ", visas = " + Arrays.toString(visas);
    }
}
