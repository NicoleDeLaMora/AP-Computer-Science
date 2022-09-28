//nicole de la Mora // 9/28/22 // String Interveiw 7)
import java.util.*;
public class strINTERVEIW7 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        //scan = object of the scanner
        System.out.print("Enter a string!");
        String text = scan.nextLine();

        int vcount = 0;
        for (int lcv = 0; lcv < text.length(); lcv++){
            char cur = text.charAt(lcv);
            //charAt gets the charecter at the index
            if (cur == 'a' || cur=='e' || cur=='i' || cur=='o' || cur == 'u') vcount++;
        }
        int ccount = text.length() - vcount;
        System.out.printf("# Vowels: %d \t\t #constienets: %d\n",vcount, ccount);
                //5d = integer
    }
}

//# Vowels: 4 		 #constienets: 4
//idk how yo spell beutiful