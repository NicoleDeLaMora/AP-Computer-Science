//Nicole de la Mora // 11/8/22 // Prog213f
import java.util.*;
public class Prog213fClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the amount used?");
        double kwh = scan.nextDouble();
        CL213f wow = new CL213f(kwh);

        wow.calc();

    }
}
