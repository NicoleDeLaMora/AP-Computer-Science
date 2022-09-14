// Nicole de la Mora // 9/13/2022 // Program 76a
import java.util.*;
public class Prog76a{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("What is the number (between 1-9)");
    int num = scan.nextInt();
    int tot = (num * 9) * 12345679;
    System.out.println("(" + num + " * 9) * 12345679 = " + tot);
  }
}
/*
What is the number (between 1-9)
5
(5 * 9) * 12345679 = 555555555
 */