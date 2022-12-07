//nicole de la Mora // 12/5/22 // Prog410t
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog410t {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/survey2.dat"));
            ArrayList<Integer> id = new ArrayList<Integer>();
            ArrayList<Integer> sal = new ArrayList<Integer>();
            ArrayList<Integer> members = new ArrayList<Integer>();


               for(int lcv = 0; lcv < 26; lcv++){
                   while (input.hasNext()){
                   id.add(input.nextInt());
                   sal.add(input.nextInt());
                   members.add(input.nextInt());
               }
            }
               System.out.print("id\t\tincome\t\tmembers");
            for(int lcv = 0; lcv<id.size(); lcv++){
                System.out.printf("\n%d\t%d\t\t%d", id.get(lcv), sal.get(lcv), members.get(lcv));
            }
            double income = 0;
            for(int x : sal){
                income += x;
            }
            income /= sal.size();
            System.out.printf("\nHouseholds with income exceeding the income of %.2f: ", income);
            for(int lcv = 0; lcv<sal.size(); lcv++){
                if(sal.get(lcv) > income){
                    System.out.printf("\n%d\t%d\t\t%d",id.get(lcv), sal.get(lcv), members.get(lcv));
                }
            }
            int per = 0;
            for(int lcv = 0; lcv < id.size(); lcv++){
                if(3750.00 + 750.00 * (members.get(lcv)-2) > sal.get(lcv)){
                    per++;
                }
            }
            System.out.println("\nPercent of households below poverty level " + per/sal.size() + "%");

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

   /*
   C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=50299:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog410t
id		income		members
1041	12180		4
1062	13240		3
1327	19800		2
1483	22458		8
1900	17000		2
2112	18125		7
2345	15623		2
3210	3200		6
3600	6500		5
3601	11970		2
4725	8900		3
6217	10000		2
9280	6200		1
Households with income exceeding the income of 12707.38:
1062	13240		3
1327	19800		2
1483	22458		8
1900	17000		2
2112	18125		7
2345	15623		2
Percent of households below poverty level 0%

Process finished with exit code 0

    */

}
