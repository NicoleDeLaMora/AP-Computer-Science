//Nicole de la Mora // 9/14/22 // program 93a
import java.util.*;
public class PROG93a {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        /*
        4.75 cents per
        surcharge of that is 10%

        utility tax = 3%

        late payment = 4%
         */
        System.out.println("What is the Kilowatts used?");
        int used = scan.nextInt();
        double cph = 0.0475;
        double surcharge = 0.1;
        double taxP = 0.03;
        double lateP = 0.04;

        double baserate = used * cph;
        //USE SANP CODE :)
    }
}
