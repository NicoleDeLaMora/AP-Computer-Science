
//Nicole de la Mora, 9//12//22 Prog58h
import java.util.Scanner;

public class Prog58h {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    // to much booty in the pants!
    // DANCE!!

    // input/
    System.out.println("What is the amount? ");
    double p = scan.nextDouble();
    System.out.println("What is the rate(percent)?");
    double r = scan.nextDouble();
    System.out.println("What is the amount of days at intrest?");
    double t = scan.nextDouble();
    System.out.println("What is the  number of days compounded per year?");
    double n = scan.nextDouble();
    // math
    double a = p * ((1 + (Math.pow((n * t / 365), (0.01 * r) / n))));
    double i = a - p;

    System.out.printf("a = %.2f\n");
    System.out.printf("i = %.2f\n");

    // output
    System.out.println("Amount saved: " + p);
    System.out.println("Intrest Rate: " + r);
    System.out.println("Number of times compounded per year: " + n);
    System.out.println("Number of days at intrest: " + t);
    System.out.println("Intrest earned: " + i);
    System.out.println("The total amount in savings: " + a);
  }
  
}