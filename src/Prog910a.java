//Nicole de la Mora // 02/14/23 <3 // 910a
import java.util.Scanner;
public class Prog910a {
    public static String decToBinary(int num){
        if(num == 0) return "0";
        if(num == 1) return "1";
        else return decToBinary(num/2) + num % 2;
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to be converted: ");
        int num = input.nextInt();
        while(num != -1){
            System.out.println(decToBinary(num));
            System.out.print("\n Enter the number to be converted: ");
             num = input.nextInt();
        }
    }
}
/*
Enter the number to be converted: 11
1011

 Enter the number to be converted: 28
11100

 Enter the number to be converted: 10
1010

 Enter the number to be converted: 5
101

 Enter the number to be converted: 3
11

 Enter the number to be converted: -1
 */