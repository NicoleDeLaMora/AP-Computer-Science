//Nicole de la Mora // 10/5/22 // Program LP 4-2
import java.util.*;
public class LP42 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter package weight in kilograms: ");
        double we = scan.nextDouble();
        System.out.println("Enter package length in centimeters");
        double l = scan.nextDouble();
        System.out.println("Enter package width in centimeters");
        double wi = scan.nextDouble();
        System.out.println("Enter package height in centimeters");
        double h = scan.nextDouble();
        double cc = l*wi*h;
        String a = "";
        String c = "";

        if (we > 27){
            a = "Too heavy";

        }else a = " ";

        if (cc > 100000){
            c = "Too large";

        }else c = " ";
        if (a == "Too large" && c == "Too heavy"){
            System.out.println(a + " and " + c);

        }else System.out.println(a + c);

    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=64228:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" LP42
Enter package weight in kilograms:
32
Enter package length in centimeters
10
Enter package width in centimeters
25
Enter package height in centimeters
38
Too heavy

Process finished with exit code 0

 */