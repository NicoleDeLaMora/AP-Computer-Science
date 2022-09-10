import java.util.Scanner;
public class Prog58B {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // INPUTS
        System.out.print("What is A? ");
        double A = scan.nextDouble();

        System.out.print("What is B? ");
        double B = scan.nextDouble();

        System.out.print("What is C?");
        double C = scan.nextDouble();

        Double square = Math.pow(A, 2);
      Double rootA = (-B+ Math.sqrt(Math.pow(B,2) - 4*A*C) )/2*A;
    Double rootB = (-B - Math.sqrt(Math.pow(B,2) - 4*A*C) )/2*A;
    System.out.println("The roots are: " + rootA + " and " + rootB );
    
    }



}
