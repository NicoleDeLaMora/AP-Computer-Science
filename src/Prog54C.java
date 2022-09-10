import java.util.Scanner;

public class Prog54C {
  public static void main(String[] args){
//input
    Scanner scan = new Scanner(System.in);
    System.out.println("What is the Radius?");
    double rad = scan.nextDouble();
    double pi = 3.14159;
    //math
    double circum = 2*pi*rad;
    double area = pi*(rad*rad);
    //output
    System.out.println("The radius of the circle is: " + rad);
      System.out.println("The Area of the circle is: " + area);
    System.out.println("The circumfrance of the circle is " + circum);

    
  }
}