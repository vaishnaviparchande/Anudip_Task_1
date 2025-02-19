// 1. Program using Vector to store and print student details
import java.util.Vector;

public class StudentDetails {
    public static void main(String[] args) {
        // Creating a Vector to store student details
        Vector<String> students = new Vector<>();

        // Adding student details to the Vector
        students.add("Name: Rahul, Age: 20, Course: CSE");
        students.add("Name: Priya, Age: 21, Course: IT");
        students.add("Name: Amit, Age: 22, Course: ECE");

        // Printing student details using for-each loop
        System.out.println("Student Details:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}

//Output:

/*

 Student Details:
 Name: Rahul, Age: 20, Course: CSE
 Name: Priya, Age: 21, Course: IT
 Name: Amit, Age: 22, Course: ECE
 
*/





