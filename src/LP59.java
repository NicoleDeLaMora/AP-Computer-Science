
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
     System.out.printf("%d\t\t%d\t\t%d\t\t%d\t\t%d\n", (int)p1, (int)p2, (int)p3, (int)p4, (int)p5);
      lcv++;
    }


    // System.out.printf("%d\t\t%d\t\t%.5f\t\t%d\t\t%.5f\n",(int)num,(int)square,sqrt,(int)cube,root);

  }
}
/*
x^1 	 x^2 	 x^3 	 x^4 	 x^5
1		1		1		1		1
2		4		8		16		32
3		9		27		81		243
4		16		64		256		1024
5		25		125		625		3125
6		36		216		1296		7776
 */