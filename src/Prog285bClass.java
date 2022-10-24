//Nicole de la Mora // 10/24/2022// Program 285b Classes
import java.util.*;
import java.io.*; //MAKE SURE YOU REMEBER THIS
//Driver class
public class Prog285bClass {
    public static void main(String[] args) {


        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            while (input.hasNext()) {
                int id = input.nextInt();
                int c = input.nextInt();
                double s = input.nextDouble();

                SalesPerson fred = new SalesPerson(id, c, s);
                fred.setComish();
                System.out.println(fred.toString());
            }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=51988:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog285bClass
101	17	2250.0	213.75
103	5	4000.0	300.0
117	3	7350.0	0.0
118	8	7350.0	574.75
125	5	6500.0	502.5
138	17	6375.0	677.5
192	8	8125.0	640.625
203	8	3250.0	243.75
218	5	5000.0	375.0
235	5	5250.0	396.25
264	17	4150.0	410.5
291	17	750.0	71.25

Process finished with exit code 0

 */