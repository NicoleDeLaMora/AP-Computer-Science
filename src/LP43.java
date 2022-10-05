//nicole de la Mora // 10/5/22 //LP4-3
import java.util.*;

public class LP43 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Number of eggs purchased: ");
        int e = scan.nextInt();
        double dozen = e/12;
        double b = 0;
        if (dozen > 0 && dozen < 4){
            b = dozen * 0.50;
        }else if(4<= dozen && dozen>6){
            b = dozen*0.45;
        }else if(6<= dozen && dozen>11){
            b = dozen*0.40;
        }else b = dozen*0.35;
        System.out.println("Bill amount: " + b);
    }
}
