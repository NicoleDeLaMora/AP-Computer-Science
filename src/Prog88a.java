
public class Prog88a {
    public static void main(String[] args){


        //math.random * (max - min) +min
        int num1 = (int)(Math.random() * (13 - 1)) + 1;
        int num2 = (int)(Math.random() * (28 - 2)) + 2;

        int sum = num1 + num2;
        int dif = num2-num1;

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
        if (max == num1){  // check if max & num1 are te same value
            min = num2;
        } else
            min = num1;
        System.out.println("The numbers are: " + num1 + " and " + num2);
        System.out.println("The max is: " + max);
        System.out.println("The min is: " + min);
    }
}
/*
TO ROUND OFF MONEY:
double myWallet = 34.004876932
Two ways:
double myWRounded = (math.round(myWallet * 100.0) / 100.0
system.out.printf("myWRounded = %.2f\n, myWRounded); <--- USE THIS
 */

