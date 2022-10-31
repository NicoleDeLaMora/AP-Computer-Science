//Nicole de la Mora // 10/31/22 // LP5-6
import java.util.*;
public class LP56{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("What is your number? ");
        int num = scan.nextInt();
        //100
        int hund = (int)num/100;
        //10
        int ten = (num - hund*100)/10;
        //1
        int one = num - (hund*100) - (ten*10);
        System.out.println("The sum of the digits is: " + (hund+ten+one));
    }
}
/*
What is your number? 892
The sum of the digits is: 19
 */