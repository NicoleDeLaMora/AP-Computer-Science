//Nicole de la Mora // 9/23/22 // String Interveiw 1
public class StrInterveiw1 {
    public static void main(String[] args){
        String str = "Beautiful Beach";
        System.out.println("The string is " + str);
        System.out.print("The duplicate charecters are: ");

        for (int lcv = 0; lcv < str.length(); lcv++){
            for (int lcv2 = lcv+1; lcv2 < str.length(); lcv2++){
                //char gets you certain letters   char f = 'f'
                char latter1 = str.charAt(lcv);
                char letter2 = str.charAt(lcv2);
                if (latter1 == letter2){
                    System.out.print(letter2 + ", ");
                    break; //breaks you out of current loop
                }
            }
        }

    }
}
/*
The string is Beautiful Beach
The duplicate charecters are: B, e, a, u,
 */
