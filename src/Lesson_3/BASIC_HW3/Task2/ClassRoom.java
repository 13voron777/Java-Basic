package Lesson_3.BASIC_HW3.Task2;

public class ClassRoom {
    private Pupil[] pupils = new Pupil[4];

    public ClassRoom(Pupil pupil1, Pupil pupil2) {
        this.pupils[0] = pupil1;
        this.pupils[1] = pupil2;
        this.pupils[2] = new ExcelentPupil();
        this.pupils[3] = new BadPupil();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
        this.pupils[0] = pupil1;
        this.pupils[1] = pupil2;
        this.pupils[2] = pupil3;
        this.pupils[3] = new ExcelentPupil();
    }

    public ClassRoom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
        this.pupils[0] = pupil1;
        this.pupils[1] = pupil2;
        this.pupils[2] = pupil3;
        this.pupils[3] = pupil4;
    }

    @Override
    public String toString() {
        System.out.println(this.getClass().getSimpleName());
        for (Pupil pupil : this.pupils) {
            pupil.study();
            pupil.read();
            pupil.write();
            pupil.relax();
            System.out.println();
        }
        return "";
    }
}
