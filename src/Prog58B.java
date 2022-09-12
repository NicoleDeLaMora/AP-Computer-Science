import java.util.Scanner;
public class Prog58B {
//in
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is A? ");
        double A = scan.nextDouble();

        System.out.print("What is B? ");

 
        System.out.print("What is C?");
        double C = scan.nextDouble();
//math
      double rootA = (-B + Math.sqrt(Math.pow(B,2) - 4*A*C) )/2*A;
    double rootB = (-B - Math.sqrt(Math.pow(B,2) - 4*A*C) )/2*A;
      //out
    System.out.println("The roots are: " + rootA + " and " + rootB );
    
    }
}
