package Unit05;
// DEFINE the student class
// age, gpa, name
public class Student {
    private int age;
    private double gpa;
    private String name;

    public Student(int age, double gpa, String name) {
        this.age = age;
        this.gpa = gpa;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public String getName() {
        return name;
    }
}
