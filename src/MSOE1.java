//Nicole de la Mora // 11/23/22 // MSOE-2008-1
import java.util.*;
public class MSOE1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the string? ");
        String str = scan.nextLine();
        if(str.substring(0,1).equals(str.substring(str.length()-1,str.length()))){

        }
        for(int i = 0; i < str.length(); i++){
            for(int l = str.length(); l > 0;l--){
                if(str.substring(i,i+1).equals(str.substring(l-1, l))){

                }
            }
        }
    }
}
