// Student class
class Student {
    // Instance variables
    private String name;
    private int rollNo;
    private double marks;

    // Constructor
    public Student(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

    // Method to display student details
    public void display() {
        System.out.println("Roll No: " + rollNo + ", Name: " + name + ", Marks: " + marks);
    }
}

// Main class
public class StudentArray {
    public static void main(String[] args) {
        // Step 1: Declare an array of Student objects (but not create objects yet)
        Student[] students = new Student[3];  // Array of size 3

        // Step 2: Create and assign Student objects to array indices
        students[0] = new Student("Rahul", 101, 85.5);
        students[1] = new Student("Anjali", 102, 90.0);
        students[2] = new Student("Vikram", 103, 78.2);

        // Step 3: Display student details using a loop
        System.out.println("Student Details:");
        for (int i = 0; i < students.length; i++) {
            students[i].display();
        }
    }
}
