package Unit05;

public class Classroom {
    public static void main(String[] args) {
        // USE the Student class
        Student S1 = new Student(16, 3.5, "John");
        Student S2 = new Student(17, 3.8, "Bill");

        System.out.println("Student 1's name is " + S1.getName() + ", they are " + S1.getAge() + " years old, and have a " + S1.getGpa() + " gpa.");
        System.out.println("Student 2's name is " + S2.getName() + ", they are " + S2.getAge() + " years old, and have a " + S2.getGpa() + " gpa.");

    }
}
