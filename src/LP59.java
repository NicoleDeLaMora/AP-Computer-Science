
//Nicole de la Mora // LP5-9
import java.util.*;

public class LP59 {
  public static void main(String[] args) {
    System.out.println("x^1 \t x^2 \t x^3 \t x^4 \t x^5");
    int lcv = 1;
    while (lcv < 7) {

      double p1 = Math.pow(lcv, 1);
      double p2 = Math.pow(lcv, 2);
      double p3 = Math.pow(lcv, 3);
      double p4 = Math.pow(lcv, 4);
      double p5 = Math.pow(lcv, 5);
      System.out.println(p1 + "      " + p2 + "      " + p3 + "      " + p4 + "      " + p5);
      lcv++;
    }
    System.out.printf("%.5\t\t%.5f\t\t%.5f\t\t%.5f\t\t%.5f\n", (int)p1, p2, p3, p4, p5);

    // System.out.printf("%d\t\t%d\t\t%.5f\t\t%d\t\t%.5f\n",(int)num,(int)square,sqrt,(int)cube,root);

  }
}