//Nicole de la Mora // 9/14/2022 // Program 82a
import java.util.*;
public class Prog82a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the speed limit? ");
        int limit = scan.nextInt();
        System.out.println("What is the vehicle speed?");
        int speed = scan.nextInt();
        double fine = 20 + ((speed - limit) * 5);

        System.out.println("Fine--------- $" + fine + "0");
    }
}
/*
What is the speed limit?
55
What is the vehicle speed?
70
Fine--------- $95.00
 */