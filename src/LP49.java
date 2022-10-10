//nicole de la Mora//LP4-9
import java.util.*;
public class LP49 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int ran =(int)( Math.random() *(20-1)) + 1;
        System.out.println("Enter a number between 1 and 20");
        int tran = scan.nextInt();
        System.out.println("Computer's number: " + ran);
        System.out.println("Player's number: " + tran);
        if (tran == ran){
            System.out.println("You Won!");
        }else System.out.println("Better luck next time!");
    }
}
/*
Enter a number between 1 and 20
6
Computer's number: 19
Player's number: 6
Better luck next time!

 */