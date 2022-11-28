//Nicole de la Mora // 11/28/22 // String Interview Question 6 Array
import java.util.*;
public class StrInterveiw6Arr {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = scan.nextLine().toLowerCase();
        String ab = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"; //a string is a char array
        int[] count = new int[26];

        for(int lcv = 0; lcv < str.length(); lcv++){  //for every letter in og string, chack if same in each lettr of alph, add to letter
            for(int lcv2 = 0; lcv2 < ab.length(); lcv2++){
                if(str.substring(lcv, lcv+1).equals(ab.substring(lcv2, lcv2+1)))
                    count[lcv]++;
            }
        }
        int unique = 0;
        for(int n : count){
            if(n>0) unique++;
        }
        System.out.println("Unique Letter: " + unique);
    }
}
