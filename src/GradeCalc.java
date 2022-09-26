//Nicole de la Mora // Grade Calc // 9//26//22
import java.util.*;
public class GradeCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your grade as a percent: ");
        double gp = in.nextDouble();
        String grade = "";
        //WRONG: if grade = 90, it will always be C because 90>70
        if (gp >= 90) grade = "A";
        else if (gp >= 80) grade = "B";
        else if (gp >= 70) grade = "C";
        else if (gp >= 60) grade = "D";
        else grade = "F";
        //else if gets you to check unother condition
        //else is anything else

        System.out.println("Your grade is: " + grade);

    }
    }
       /*
Enter your grade as a percent: 95
Your grade is: A
 */