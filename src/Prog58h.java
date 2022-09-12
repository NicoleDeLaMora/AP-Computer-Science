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
    double ex = (n * t) / 365;
    double ar = (0.01 * r) / n;
    double a = p * (1 + Math.pow(ar, ex));
    double i = a - p;

    // output
    System.out.println("Amount saved: " + p);
    System.out.println("Intrest Rate: " + r);
    System.out.println("Number of times compounded per year: " + n);
    System.out.println("Number of days at intrest: " + t);
    System.out.println("Intrest earned: " + i);
    System.out.println("The total amount in savings: " + a);
  }
}