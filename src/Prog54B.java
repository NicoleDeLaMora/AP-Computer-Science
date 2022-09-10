import java.util.Scanner;

public class Prog54B {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("What is the first number?");
        int A = scan.nextInt();
        System.out.println("What is the second number?");
        int B = scan.nextInt();
        System.out.println("What is the third number?");
        int C = scan.nextInt();
        System.out.println("What is the fourth number?");
        int D = scan.nextInt();
        int num1 = A + B + C + D;
      double average = (double)num1 / 4;
      System.out.println("The sum of the four numbers is: " + num1);
      System.out.println("The average of the four numbers is: " + average);


    }

}

