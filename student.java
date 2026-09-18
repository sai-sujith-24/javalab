import java.util.Scanner;
 
 class  student
 {
    String hallTicketNumber;
    String studentName;
    String department;
     Student(String hallTicketNumber,String studentName,String department)
     {
        this.hallTicketNumber=hallTicketNumber;
        this.studentName=studentName;
        this.department=department;

     }
     void display()
     {
        System.out.print("Hall Ticket Number"+hallTicketNumber);
        System.out.print("Student Name"+studentName);
        System.out.print("Department"+department);
        System.out.println();

     }
 } 
 public class StudentDemo
 {
    public static void main(String{}args)
    {
        scanner sc=new Scanner()