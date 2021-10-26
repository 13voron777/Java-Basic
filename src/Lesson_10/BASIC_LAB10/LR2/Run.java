package Lesson_10.BASIC_LAB10.LR2;

public class Run {
    public static void main(String[] args) {
        MyIterator<Integer> myIterator = new MyIterator<Integer>(new Integer[]{1, 2, 3, 4, 5});
        while (myIterator.hasNext()) {
            System.out.println(myIterator.next());
        }
    }
}
