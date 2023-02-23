import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog408a {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prg408a.dat"));
            CL408a[] list = new CL408a[21];
            int cnt = 0;
            while(input.hasNext()){
                int id = input.nextInt();
                int Score = input.nextInt();
                list[cnt] = new CL408a(id, Score);
                cnt++;
            }
            list = SortingAlgs.insertionSort(list);

            System.out.println("id\tScore");
            for(int lcv = 0; lcv < list.length; lcv++){
                System.out.println(list[lcv].getID() + "\t" + list[lcv].getScore());
            }


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=50168:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog408a
id	Score
365	265
306	262
115	257
311	256
123	253
325	246
116	246
323	245
321	245
113	243
218	243
208	242
302	242
104	239
112	239
110	238
223	230
213	229
207	228
203	224
222	223

Process finished with exit code 0

 */