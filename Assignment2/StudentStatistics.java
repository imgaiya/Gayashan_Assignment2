 
/**
 * Write a description of class studentStatistics here.
 *
 * @author (B.A. Gayashan Madhuka)
 * @version (1.0.6 2023/09/26)
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Student {
    String studentLastName; 
    String studentFirstName; 
    int studentID;
    double assignmentNo1; 
    double assignmentNo2; 
    double assignmentNo3; 
    double studentTotalMark;
    
    // Initializing student details
    public Student(String studentLastName, String studentFirstName, int studentID, 
    double assignmentNo1, double assignmentNo2, double assignmentNo3) {
        this.studentLastName = studentLastName;
        this.studentFirstName = studentFirstName;
        this.studentID = studentID;
        this.assignmentNo1 = assignmentNo1;
        this.assignmentNo2 = assignmentNo2;
        this.assignmentNo3 = assignmentNo3;
        this.studentTotalMark = assignmentNo1 + assignmentNo2 + assignmentNo3;
    }
}
public class StudentStatistics {

    private static final String FILENAME = "prog5001_students_grade_2022.txt"; //declareing the details sheet
    private static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {
        readFromFile(FILENAME);
        // Declaring possible cases
        while (true) {
            showMenu();
            int choice = getUserChoice();

            switch (choice) {
                case 1:
                    calculateTotalMarks();
                    break;
                case 2:
                    printStudentsBelowThreshold();
                    break;
                case 3:
                    printTopAndBottomStudents();
                    break;
                case 4:
                    System.out.println("The program is already Exist");
                    System.exit(0);
                default:
                    System.out.println("The choice is invalid. Please enter a valid option.");
            }
        }
    }
}