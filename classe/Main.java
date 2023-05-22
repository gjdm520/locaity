package ruangong.classe;

public class Main {
    public static void main(String[] args) {
        AbstractCourse course1 = new CourseWithCheck();
        course1.createCourse();

        System.out.println("--------------------");

        AbstractCourse course2 = new CourseWithoutCheck();
        course2.createCourse();
    }
}
