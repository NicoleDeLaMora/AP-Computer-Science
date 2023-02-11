//Nicole de la Mora // 2/8/23 // learning recursion
import java.util.*;
public class Prog162aRecursive {

    public static int Factorial(int n){
        if(n == 1)                             //Base Case (ALWAYS GOES FIRST)
            return n;
        else return n * Factorial(n-1);     //Recurssive Case
    }

public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = input.nextInt();

    while(num!= 0){
        int fact = Factorial(num);
        System.out.println(fact);
        System.out.print("Enter a number: ");
        num = input.nextInt();
    }
}
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57815:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog162aRecursive
Enter a number: 5
120
Enter a number: 4
24
Enter a number: 2
2
Enter a number: 1
1
Enter a number: 0

Process finished with exit code 0

 */