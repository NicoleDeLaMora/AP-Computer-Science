//Nicole de la Mora // 9/26/22 // LP 4-1
import java.io.File;
import java.io.IOException;
import java.util.*;

public class LP41 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the amount of copies?");
        int copy = scan.nextInt();
        double pcopy = 0;
        double tot = 0;
        if (copy <100 ){
            pcopy = 0.30;
            tot = pcopy * copy;
        }else if (100 <= copy && copy<= 499){
            pcopy = 0.28;
            tot = pcopy * copy;

        }else if (500 <= copy && copy <= 749) {
            pcopy = 0.27;
            tot = pcopy * copy;
        }else if (750<= copy && copy <= 1000) {
            pcopy = 0.26;
            tot = pcopy * copy;
        }else
            pcopy = 0.25;
            tot = pcopy * copy;

        System.out.println("Price per copy: " + pcopy);
        System.out.print("Total cost: " + tot);
    }
}
/*
What is the amount of copies?
1001
Price per copy: 0.25
Total cost: 250.25
Process finished with exit code 0

*/