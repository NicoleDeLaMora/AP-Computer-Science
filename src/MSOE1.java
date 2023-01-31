//Nicole de la Mora // 11/23/22 // MSOE-1
import java.util.*;
public class MSOE1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the string? ");
        String str = scan.nextLine();
        String ans = "";  
      for(int lcv = str.length(); lcv > 0; lcv--){
          ans += str.charAt(lcv-1);
        }
      if(ans.equals(str)){
        System.out.println(str + " is a palindrome");
      }else {
        System.out.println(str + " is not a palindrome");
      }
   }
}
/*
What is the string? 
abba
abba is a palindrome
  */