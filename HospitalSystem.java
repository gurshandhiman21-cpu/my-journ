class Patient {
    private String name;
    private int age;
    private String disease;

    Patient(String name, int age, String disease) {
        this.name = name; this.age = age; this.disease = disease;
    }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDisease() { return disease; }
    public void display() {
        System.out.println("Patient: " + name + " | Age: " + age + " | Disease: " + disease);
    }
}
class Doctor {
    private String name;
    private String specialization;

    Doctor(String name, String spec) { this.name = name; this.specialization = spec; }
    public String getName() { return name; }
    public void treat(Patient p) {
        System.out.println("Dr. " + name + " (" + specialization + ") is treating " + p.getName());
    }
}
public class HospitalSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient("Gurshan", 19, "Fever");
        Patient p2 = new Patient("Rahul", 35, "Diabetes");
        Doctor d1 = new Doctor("Sharma", "General Physician");
        Doctor d2 = new Doctor("Kapoor", "Endocrinologist");

        p1.display(); d1.treat(p1); System.out.println();
        p2.display(); d2.treat(p2);
    }
}
