//Nicole de la Mora // 10/30 // LP 4-10
import java.util.*;

public class LP410{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
      //rectangle
      System.out.println("Rectangular Prism");
      System.out.print("What is the width? ");
        int width = scan.nextInt();
      System.out.print("What is the length? ");
        int length = scan.nextInt();
      System.out.print("What is the Height? ");
        int height = scan.nextInt();
      System.out.println("The Volume is: " + (width * length * height));
System.out.println();
      //circle
      System.out.println("Sphere");
      System.out.print("What is the radius? ");
        int radius = scan.nextInt();
      System.out.println("The volume is: " + (Math.pow((radius * 2), 3) *               3.14159) / 6);
System.out.println();
      //Cube
      System.out.println("Cube");
      System.out.print("What is the length of one side? ");
        int len = scan.nextInt();
      System.out.println("The volume is: " + Math.pow(len, 3));
  }
}
/*
Rectangular Prism
What is the width? 4
What is the length? 3
What is the Height? 5
The Volume is: 60

Sphere
What is the radius? 3
The volume is: 113.09724

Cube
What is the length of one side? 4
The volume is: 64.0
*/