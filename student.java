import java.util.Scanner;

class student {
    String hallTicketNumber;
    String studentName;
    String department;

    student(String hallTicketNumber, String studentName, String department) {
        this.hallTicketNumber = hallTicketNumber;
        this.studentName = studentName;
        this.department = department;
    }

    void display() {
        System.out.println("Hall Ticket Number: " + hallTicketNumber);
        System.out.println("Student Name: " + studentName);
        System.out.println("Department: " + department);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter hall ticket number: ");
        String number = sc.nextLine();
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter department: ");
        String dept = sc.nextLine();
        student s = new student(number, name, dept);
        s.display();
        sc.close();
    }
}
