//Nicole de la Mora // 10/26/22 // Prog 76a Class
import java.util.*;
public class Prog76aaClass {
    public static void main(String[] args){
        //driver program
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you hate: ");
        int NUM = scan.nextInt();
      
        Prog76aaCL wow = new Prog76aaCL(NUM);
      
        wow.CALC();
        int tot = wow.getTOT();

        //print it
        System.out.printf("\t\t\t%d",NUM);
        System.out.println();
        System.out.println("x 12345679");
        System.out.println("__________");
        System.out.println(tot);
    }

}
