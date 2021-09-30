public class Main {
    public static void main(String[] args) {
        ClassRoom classRoom1 = new ClassRoom(new ExcelentPupil(), new GoodPupil());
        ClassRoom classRoom2 = new ClassRoom(new ExcelentPupil(), new GoodPupil(), new BadPupil());
        ClassRoom classRoom3 = new ClassRoom(new ExcelentPupil(), new ExcelentPupil(), new GoodPupil(), new BadPupil());
        System.out.println(classRoom1 + "\n" + classRoom2 + "\n" + classRoom3);
    }
}
