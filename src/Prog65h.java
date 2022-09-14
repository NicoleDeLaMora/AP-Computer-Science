//Nicole de la Mora // 9/13/2022 // Program 65h
import java.util.*;
public class Prog65h{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
   /*
  OLD:
    20 shilling = pound
    12 pence = shilling
  NEW: 
    100 pence = pound
ex: what used to be 5.2.8 (pound.shilling.pence) is now 5.13
    */
    System.out.println("Enter pounds: ");
    double pund = scan.nextDouble();
    System.out.println("Enter shillings: ");
    double shill = scan.nextDouble();
    System.out.println("Enter pence: ");
    double pence = scan.nextDouble();
    double tot = 0;


    shill = pence / 12 + shill;
    pund = shill/20 + pund;


    
    System.out.printf("Decimal pounds = %.2f\n", pund);
    
  }
}
/*
Enter pounds:
7
Enter shillings:
17
Enter pence:
9
Decimal pounds = 7.89
 */
