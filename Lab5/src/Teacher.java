
public class Teacher {

    String name;
    String dept;
    String courses = "";

    Teacher(String name, String dept) {
        this.name = name;
        this.dept = dept;
    }

    public void addCourse(Course s) {
        courses += s + "\n";
    }

    public void printDetail() {
        System.out.println("========================");
        System.out.println("Name: " + name);
        System.out.println("Department: " + dept);
        System.out.println("List of courses");
        System.out.println("========================");
        System.out.println(courses);
        System.out.println("========================");
    }

}
