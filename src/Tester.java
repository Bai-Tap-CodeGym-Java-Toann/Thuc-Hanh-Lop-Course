import org.jetbrains.annotations.NotNull;

public class Tester {
    public static void main(String[] args) {
        Course course = new Course("toan");
        displayCourse(course);
        course.addStudent("lana");
        displayCourse(course);
        course.addStudent("toandz");
        displayCourse(course);
        course.addStudent("frank");
        displayCourse(course);

    }

    public static void displayCourse( Course course) {
        System.out.println("Course \"" + course.getName()
                + "\" has " + course.getStudentsCount()
                + " student(s): {");
        String[] students = course.getStudents();
        for (int i = 0; i < course.getStudentsCount(); i++) {
            System.out.println("\t\"" + students[i] + "\",");
        }
        System.out.println("}");
    }
}
