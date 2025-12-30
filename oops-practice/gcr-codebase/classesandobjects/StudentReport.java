//package classesandobjects;
// Class to represent a Student
class Student {
    // Attributes
    String name;
    String rollNumber;
    double[] marks; // Array to store marks for 3 subjects

    // Constructor to initialize the student object
    Student(String name, String rollNumber, double mark1, double mark2, double mark3) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = new double[3];
        this.marks[0] = mark1;
        this.marks[1] = mark2;
        this.marks[2] = mark3;
    }

    // Method to calculate the grade based on average marks
    String calculateGrade() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        double average = total / marks.length;

        if (average >= 80){
            return "A";
        } else if (average >= 70) {
            return "B";
        } else if (average >= 60) {
            return "C";
        } else if (average >= 50) {
            return "D";
        } else{
            return "F";
        }
    }

    // Method to display the student's details and grade
    void displayStudentDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Student RollNumber: " + rollNumber);
        System.out.println("Student Marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark" + (i + 1) + ": " + marks[i]);
        }
        System.out.println("Grade " + calculateGrade());
        System.out.println(); // Blank line for separation
    }
}

// Main class
public class StudentReport{
    public static void main(String[] args) {
        // Create student objects
        Student student1 = new Student("Thamarai", "ECE001", 80, 70, 75);
        Student student2 = new Student("Kannan", "CSC002", 60, 65, 50);

        // Display student details and grades
        student1.displayStudentDetails();
        student2.displayStudentDetails();
    }
}
