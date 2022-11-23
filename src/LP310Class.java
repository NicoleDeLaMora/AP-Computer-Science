//Nicole de la Mora // 11/22/22 // LP3-9
import java.util.*;
public class LP310Class {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number of Burgers: ");
        int b = scan.nextInt();
        System.out.print("Enter the number of Fries: ");
        int f = scan.nextInt();
        System.out.print("Enter the number of Sodas: ");
        int s = scan.nextInt();

        LP310 wow = new LP310(b, f, s);
        wow.calc();
        System.out.printf("\nTotal before tax: $%.2f", wow.getCost());
        System.out.printf("\nTotal before tax: $%.2f", wow.getTAX());
        System.out.printf("\nTotal before tax: $%.2f", wow.getCostTAX());

        System.out.println();
        System.out.println();


        System.out.print("Amount tenderd: ");
        double am = scan.nextDouble();
        System.out.printf("Change: $%.2f",wow.tenders(am));

    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51853:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" LP310Class
Enter the number of Burgers: 2
Enter the number of Fries: 5
Enter the number of Sodas: 5

Total before tax: $13.78
Total before tax: $0.90
Total before tax: $14.68

Amount tenderd: 20.00
Change: $5.32
Process finished with exit code 0

 */