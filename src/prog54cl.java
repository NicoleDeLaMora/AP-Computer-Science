//Nicole de la Mora // 10/20/22// 54b Classes
import java.util.*;
public class prog54cl {
    //driver program
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        //input
        System.out.print("Enter first number: ");
        int a1 = scan.nextInt();

        System.out.print("Enter second number: ");
        int b1 = scan.nextInt();

        System.out.print("Enter third number: ");
        int c1 = scan.nextInt();

        System.out.print("Enter fourth number: ");
        int d1 = scan.nextInt();
        System.out.println();

        //make new instance of cl54b(initiate the class)
        prog54aClass wow = new prog54aClass(a1, b1, c1, d1);
        wow.calculation();

        int total = wow.getTOT();
        int average = wow.getAve();

        System.out.println("The sum of the four numbers is " + total);
        System.out.println("The average of the four numbers is " + average);
    }
}
/*
Enter first number: 475
Enter second number: 821
Enter third number: 369
Enter fourth number: 562

The sum of the four numbers is 2227
The average of the four numbers is 556
 */