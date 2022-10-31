//nicole de la Mora //  10/31/22 // LP 5-17
import java.util.*;
public class LP517 {
    public static void main(String[] args){

        String ans = "5962ee58";
        String wong = "";
        Scanner scan = new Scanner(System.in);
        for (int lcv = 1; lcv < 4; lcv++){
            System.out.println("Enter Password: ");
             String wrong = scan.nextLine();
            if (wrong.equals(ans)){
                System.out.println("Welcome");
                wrong = wong;
                break;
            }else System.out.println("Wrong answer. Try again.");
        }
       if (ans != wong){
           System.out.println("Acsess Denied.");
       }
    }

}
/*
Enter Password:
programmer7
Wrong answer. Try again.
Enter Password:
R*0!ST
Wrong answer. Try again.
Enter Password:
8675309
Wrong answer. Try again.
Acsess Denied.
 */
