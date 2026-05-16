public class StudentGradeSystem {
    private String name;
    private int marks;

    StudentGradeSystem(String name, int marks) { this.name = name; this.marks = marks; }

    public String getName() { return name; }
    public int getMarks() { return marks; }
    public void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) this.marks = marks;
        else System.out.println("Invalid marks!");
    }

    public String getGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 40) return "D";
        else return "F";
    }

    public void display() {
        System.out.println("Name: " + name + " | Marks: " + marks + " | Grade: " + getGrade());
    }

    public static void main(String[] args) {
        StudentGradeSystem s1 = new StudentGradeSystem("Gurshan", 92);
        StudentGradeSystem s2 = new StudentGradeSystem("Rahul", 65);
        StudentGradeSystem s3 = new StudentGradeSystem("Priya", 38);
        s1.display(); s2.display(); s3.display();
    }
}
