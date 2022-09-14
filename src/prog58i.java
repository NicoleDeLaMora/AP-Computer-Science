import java.util.*;
//Nicole de la Mora // 9/13/22 // Prog58i

public class prog58i {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //input
        System.out.println("The amount I wish to borrow is: $");
        double p = input.nextDouble();

        System.out.println("The loan rate is: $");
        double r = input.nextDouble();

        System.out.println("The number of months it will take to pay off the loan is: ");
        double m = input.nextDouble();

        //math
        double MP = p*(r/1200) * (Math.pow(m,(1+(r/1200)))/(Math.pow(m, (1+(r/1200)))-1));
    System.out.printf("My monthly payments will be: $%.2f\n", MP);
    System.out.printf("The total intrest paid is $%.2f\n", MP*m);
    System.out.printf("The total amount paid is: $%.2f\n", ((MP+m)+p));

/*
My monthly payments will be: $93.10
The total intrest paid is $3351.66
The total amount paid is: $7629.10
 */
    }
}
