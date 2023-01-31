import java.util.*;
public class MSOE2{
  public static void main(String[] args){
Scanner scan = new Scanner(System.in);
    //practice num 2, , Quadratic Formula
    System.out.print("Enter side a's length ");
    double a = scan.nextDouble();

    System.out.print("Enter side c's length ");
    double c = scan.nextDouble();

    System.out.print("Enter angle a's degree");
    double da = scan.nextDouble();

    double dc = Math.sin(a) / da;

    System.out.println("Angle C = " + dc);
   
  }
}