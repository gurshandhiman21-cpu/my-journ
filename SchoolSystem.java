interface Teachable {
    void teach(String subject);
}
interface Learnable {
    void learn(String subject);
}
class Teacher implements Teachable {
    String name;
    Teacher(String name) { this.name = name; }
    public void teach(String subject) {
        System.out.println("Teacher " + name + " is teaching " + subject);
    }
}
class Student implements Learnable {
    String name;
    int rollNo;
    Student(String name, int roll) { this.name = name; this.rollNo = roll; }
    public void learn(String subject) {
        System.out.println("Student " + name + " (Roll: " + rollNo + ") is learning " + subject);
    }
}
class School {
    String schoolName;
    School(String name) { this.schoolName = name; }
    void conduct(Teacher t, Student s, String subject) {
        System.out.println("--- " + schoolName + " ---");
        t.teach(subject);
        s.learn(subject);
    }
}
public class SchoolSystem {
    public static void main(String[] args) {
        School school = new School("Rayat Bahra");
        Teacher t = new Teacher("Mr. Kumar");
        Student s = new Student("Gurshan", 101);
        school.conduct(t, s, "OOP in Java");
    }
}
