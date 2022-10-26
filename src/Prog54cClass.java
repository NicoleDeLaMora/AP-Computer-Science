//Nicole de la Mora // 10/20/22 // Prog 54c Class
import java.util.*;
public class Prog54cClass {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the radius? ");
        double RADIUS = scan.nextDouble();

        Prog54cCL wow = new Prog54cCL(RADIUS);
        wow.calc();

        double area = wow.getA();
        double circum = wow.getC();

        System.out.println("The Radius Is: " + RADIUS);
        System.out.println("The Area Is: " + area);
        System.out.println("The Circumfrence Is: " + circum);
    }

}
