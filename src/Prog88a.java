
public class Prog88a {
    public static void main(String[] args){


        //math.random * (max - min) +min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (28 - 2)) + 2;

        int sum = num1 + num2;
        int prod = num1 * num2;
        double av = sum / 2;
        //DON'T DO THIS ON AP EXAM
        //the opposite of than is than =
        int max, min;
        if(num1 > num2){
            max = num1;
            min = num2;
        } else {
            max = num2;
            min = num1;
        }
      
      int dif = max-min;
      int dis = Math.abs(dif);
 //output
      System.out.println("The numbers are: " + num1 + " and " + num2);             
      System.out.println("SUM: " + sum);
      System.out.println("DIFFERENCE: " + dif);
      System.out.println("PRODUCT: " + prod);
      System.out.println("AVERAGE: " + av);
      System.out.println("DISTANCE: " + dis);
      System.out.println("MAX: " + max);
      System.out.println("MIN: " + min);
    }
}
/*
TO ROUND OFF MONEY:
double myWallet = 34.004876932
Two ways:
double myWRounded = (math.round(myWallet * 100.0) / 100.0
system.out.printf("myWRounded = %.2f\n, myWRounded); <--- USE THIS
 */
/*
The numbers are: 12 and 4
SUM: 16
DIFFERENCE: 8
PRODUCT: 48
AVERAGE: 8.0
DISTANCE: 8
MAX: 12
MIN: 4
*/
