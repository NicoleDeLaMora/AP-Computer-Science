//Nicole de la Mora // 11/30/22 // prog 602b Array List
import java.io.*;
import java.util.*;
public class Prog602bAL {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog602b.dat"));
            ArrayList<internetCustomer> list = new ArrayList<internetCustomer>();

            while(input.hasNext()){
                int id = input.nextInt();
                double hours = input.nextDouble();
                int code = input.nextInt();

                internetCustomer fred = new internetCustomer(id, hours, code);
                list.add(fred);
            }
            for(int lcv = 0; lcv<list.size(); lcv++){
                //.size = arraylist  .length = array  .length() = string
                internetCustomer current = list.get(lcv);
                current.setCharge();
            }
            System.out.println("Account Number \t Hours \t Code \t Amount Due \t");
            for(internetCustomer me : list){
                System.out.println(me.getACCT() + "\t\t" + me.getHOUR() + "\t\t" + me.getCODE() + "\t\t" + me.getCHAR());
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=65280:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog602bAL
Account Number 	 Hours 	 Code 	 Amount Due
1825		3.25		0		200.0
14063		17.06		1		661.8
17185		7.93		1		396.5
19111		12.0		2		700.0
20045		5.0		1		250.0
21352		5.84		0		242.0
22841		27.9		2		1087.0
23051		1.55		2		350.0
29118		15.02		0		550.6

Process finished with exit code 0

 */