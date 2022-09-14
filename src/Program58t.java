//Nicole de la Mora / 9/13/2022 / Prog 58T
import java.util.*;
public class Program58t{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    //input
  System.out.print("What is the purchsase price? ");
      double p = scan.nextDouble();
    
  System.out.print("What is the recived amount? ");
      double a = scan.nextDouble();

    //calculations
    double d = a-p;
    int dollars = (int)d / 1;
    d = (d % 1) * 100;
    int quart = (int)d / 25;
    d = d % 25;
    int dime = (int)d / 10;
    d = d % 10;
    int nick = (int)d / 5;
    d = d % 5;
    int pennies = (int)d;
     d = a-p;
    //output
    System.out.println("Purchase Price: $" + p);
    System.out.println("Amount recived: $" + a);
    System.out.println("Change Due: $" + d);
    System.out.println("Dollars: " + dollars);
    System.out.println("Quarters: " + quart);
    System.out.println("Dimes: " + dime);
    System.out.println("Nickels: " + nick);
    System.out.println("Pennies: " + pennies );
    
  }
}
/*
What is the purchsase price? 125.32
What is the recived amount? 140

Purchase Price: $125.32
Amount recived: $140.0
Change Due: $14.68
Dollars: 14
Quarters: 2
Dimes: 1
Nickels: 1
Pennies: 3
*/