//this class will hold the variables and methods for the main
import java.util.Scanner;
public class Student {
 private int[] at = new int[3];
 private int[][] sched = new int[3][3];
 private int[] grade = new int[3];
 //this method will take the attendance of a student
  public void Attendance(int x){
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter 0 for absent, 1 for tardy, and 2 for present");
    int y  = reader.nextInt();
    while (y<0 || y>2){
      System.out.println("Error! Enter 0 for absent, 1 for tardy, and 2 for present");
      y = reader.nextInt();
    }
    at[x-1] = y;
  }
  public void ReportAttendance(int x) {
    if (at[x-1] == 0) {
      System.out.println("Absent for today");
    } else if (at[x-1] == 1) {
      System.out.println("Tardy for today");
    } else if (at[x-1] == 2) {
      System.out.println("Present for today");
    }
  }
  //this method will allow the user to schedule classes
  public void Schedule(int x){
    int check;
    Scanner reader = new Scanner(System.in);
    System.out.println("Please choose 3 classes from the options below: ");
    System.out.println("What Math class will you be taking 1. Advanced Prealgebra or 2. Honors Calculus VII?");
    check = reader.nextInt();
    while (check < 1 || check > 2) {
      System.out.println("Error! Please reenter the correct class number you want to attend");
      check = reader.nextInt();
    }
    sched[x-1][0] = check;
    System.out.println("What History class will you be taking 3. Regular US History (RUSH) or 4. Honors US History (HUSH)");
    check = reader.nextInt();
    while (check < 3 || check > 4) {
      System.out.println("Error! Please reenter the correct class number you want to attend");
      check = reader.nextInt();
    }
    sched[x-1][1] = check;
    System.out.println("What English class will you be taking 5. Language Arts or 6. AP Spanish Lit?");
    check = reader.nextInt();
    while (check < 5 || check > 6) {
      System.out.println("Error! Please reenter the correct class number you want to attend");
      check = reader.nextInt();
    }
    sched[x-1][2] = check;
  }
  //this method will allow the user to enter in a percent and the program will convert it to letter grades
  public void AssignGrade(int x){
    Scanner reader = new Scanner(System.in);
    System.out.println("Please enter in your percent grade");
    grade[x-1] = reader.nextInt();
  }
  //this method will convert the grades into the letter form and report
  public void ReportGrade(int x){
      if(grade[x-1] <= 60){
        System.out.println("You got an F :3 RIP");
      }
      else if((grade[x-1] > 60) && (grade[x-1] <= 69)){
        System.out.println("You got a D");
      }
      else if((grade[x-1] <= 79) && (grade[x-1] > 69)){
        System.out.println("You got a C");
      }
      else if((grade[x-1] <= 89) && (grade[x-1] > 79)){
        System.out.println("You got a B");
      }
      else if ((grade[x-1]>89)){
        System.out.println("You got an A");
      }
      System.out.println("");
  }
  //this method will print out the classes the user has registered for
 public void ReportSched(int x){
   System.out.println("You are taking these classes: ");
   for(int i = 0; i < 3; i++){
    int number = sched[x-1][i];
    switch (number) {
      case 1:
        System.out.print("Advanced Prealgebra 💀, ");
        break;
      case 2:
        System.out.print("Honors Calculus VII, ");
        break;
      case 3:
        System.out.print("RUSH 😀😂👌❤️😍, ");
        break;
      case 4:
        System.out.print("HUSH, ");
        break;
      case 5:
        System.out.print("Language Arts");
        break;
      case 6:
        System.out.print("AP Spanish Lit 🤪 ");
        break;
      default:
        System.out.println("Error! Please reenter schedule with option 2 on the next prompt");
        break;
    }
  }
  System.out.println("");
}
}