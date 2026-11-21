import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks (0 to 100): ");
        double marks = input.nextDouble();

        if (!Double.isFinite(marks) || marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Enter a number from 0 to 100.");
            return;
        }

        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'B';
        } else if (marks >= 70) {
            grade = 'C';
        } else if (marks >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade: " + grade);
    }
}
