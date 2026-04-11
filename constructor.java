class Student{
    String Name;
    int age;

    // Student(){
    //     Name = "unknown";
    //     age = 0;
    // }
    void display(){
        System.out.println(Name+ " " +age );
    }
}
public class constructor {
    public static void main(String[]args){
        Student s1 = new Student();
        s1.display();
    }

}
