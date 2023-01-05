//Nicole de la Mora // 01/03/23 // Prog 505a
import java.io.*;
import java.util.*;
public class Prog505aa {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("data/prog505a.dat"));
            List<Cl505a> list = new ArrayList<Cl505a>();
            while (input.hasNext()) {
                String fname = input.next();
                String lname = input.next();
                int books = input.nextInt();
                Cl505a wowser = new Cl505a(fname + " " + lname, books);
                list.add(wowser);
            }

            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl505a cur = list.get(lcv);
                cur.calc();
            }

            for (Cl505a x : list)
                System.out.println(x);

            double tot = 0;
            for (Cl505a b : list) tot += b.getPoints();
            double avg = tot / list.size();

            int bigPoints = list.get(0).getPoints();
            String bigName = list.get(0).getName();
            for (int lcv = 0; lcv < list.size(); lcv++) {
                Cl505a book = list.get(lcv);
                if (book.getPoints() > bigPoints) {
                    bigPoints = book.getPoints();
                    bigName = book.getName();
                }
            }
            System.out.println("\nAverage points: " + avg);
            System.out.println("The winner is: " + bigName);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=58138:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog505aa
Sam Summer	4	45
Linda Lazy	2	20
Paul Prodder	5	60
K.C. Master	8	115
Richie Reader	6	75

Average points: 63.0
The winner is: K.C. Master

Process finished with exit code 0

 */