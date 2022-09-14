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

    //convert all to pence, multiply by 0.01
    //pund/20 + shill = shill
    //shill / 12 + pence = pence
    //shill = pund*20 + shill;
    //pence = shill*12 + pence;
    //tot = pence * 0.01;
//pence / 12 = shill
    //shill / 20  = pound
    shill = pence / 12 + shill;
    pund = shill/20 + pund;

    
    System.out.println("Decimal pounds = " + tot);
    
  }
}
