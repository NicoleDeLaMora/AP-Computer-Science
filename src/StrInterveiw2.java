import javax.swing.*;
import java.util.Locale;
//Nicole de la Mora // 9/23/22 // String Interveiw 2
public class StrInterveiw2 {
    public static void main(String[] args){
        String word = "Army";
        String anagram = "Mary";

        word = word.toLowerCase();
        anagram = anagram.toLowerCase();

        if (word.length() != anagram.length()){
            System.out.println("Not an anagram!");
        } else {
            for (int lcv = 0; lcv < word.length(); lcv++){
                char c = word.charAt(lcv);
                int index = anagram.indexOf(c);
                if (index != -1){
                    anagram = anagram.substring(0,index) + anagram.substring(index + 1, anagram.length());
                }else{
                    System.out.println("Not an anagram!");
                }
            }
        }
        System.out.println("Are these anagrams? " + anagram.isEmpty());
        //isEmpty is the same as .length == 0
    }
}
/*
Are these anagrams? true
 */