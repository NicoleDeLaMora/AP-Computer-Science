//Nicole de la Mora // today // LP4-6
import java.util.*;
public class LP46 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num1 = (int)(Math.random() * (10 - 1)) + 1;
        int num2 = (int)(Math.random() * (10 - 1)) + 1;
        int x = (int)(Math.random() *(4-1))+1;
        double ans = 0;
        if (x == 1){
            System.out.println("what is " + num1 + " * " + num2);
            ans = num1 * num2;
        }else if(x==2){
            System.out.println("what is " + num1 + " + " + num2);
            ans = num1+num2;
        }else if(x==3){
            System.out.println("what is " + num1 + " - " + num2);
            ans = num1-num2;
        }else {
            System.out.println("what is " + num1 + " / " + num2);
            ans = num1 / num2;
        }
        double ta = scan.nextDouble();
        if (ta == ans){
            System.out.println("Correct!");
        }else System.out.println("Wrong!");
    }

}
/*
what is 4 - 8
-4
Correct!
 */