//daniel, peter, wendy
//11/2/21
//this program will act as a registration system for a school

import java.util.Scanner;
class Main {
  Student s = new Student();
  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);
    System.out.println("Welcome! This is a system that is used to schedule your classes, report your grades, and keep track of your attendance. You will be prompted to enter in numbers to perform some of these functions below:");
    Main m = new Main();
    for(int x = 1; x <= 3; x++){
      m.Options(x);
    }
     System.out.println("Thank you for using this system! :)");
  }
 //this method will print out the options for the user to choose from and then based on the number it will call a method from student
  public void Options(int x){
    Scanner reader = new Scanner(System.in);
    int number = 0;
     System.out.println("Please enter one of the below numbers for your student.");
    while (number != 7){
    System.out.println(" 1. Mark Attendance \n 2. Report Attendance \n 3. Schedule Classes \n 4. Print out Classes \n 5. Assign Grades \n 6. Report Grades \n 7. Exit ");
    number = reader.nextInt();
    switch(number){
      case 1:
        s.Attendance(x);
        break;
      case 2:
        s.ReportAttendance(x);
        break;
      case 3:
        s.Schedule(x);
        break;
      case 4:
        s.ReportSched(x);
        break;
      case 5:
        s.AssignGrade(x);
        break;
      case 6:
        s.ReportGrade(x);
        break;
      case 7:
        break;
      default:
        System.out.println("Error! Please try again.");  
    }
   }
  }
}