import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Nicole de la Mora // 11/10/22 // Prog 435G
public class prog435g {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog435g.dat"));

            int[] scores = new int[100];
            int count = 0;

            while (input.hasNext()){
                int score = input.nextInt();
                scores[count] = score;
                count++;
            }


            //sort the scores (bubble sort)
            for (int lcv = 0; lcv<count; lcv++){
                for(int lcv2 = 0; lcv2<count-1; lcv2++){
                    if (scores[lcv2] > scores[lcv2 + 1]){
                        int temp = scores[lcv2];
                        scores[lcv2] = scores[lcv2+1];
                        scores[lcv+1] = temp;
                    }
                }
            }


            CL435g[] golfers = new CL435g[count];
            for(int lcv = 0; lcv<count; lcv++){
                CL435g myguy = new CL435g(scores[lcv]);
                golfers[lcv] = myguy;
            }

            int rank = 1;
            for (int lcv = 0; lcv < count; lcv++){
                golfers[lcv].setRank(rank);
                if (lcv < count - 1 && scores[lcv] != scores[lcv+1]){
                    rank++;
                }

            }
            System.out.println("Score\tRank");
            for(int lvc = 0; lvc < count; lvc++){
                System.out.println(golfers[lvc].toString());
            }

        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=49249:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" prog435g
Score	Rank
66		1
66		1
66		1
66		1
66		1
66		1
66		1
66		1
66		1
66		1
66		1
66		1
66		1
68		2
68		2
68		2
68		2
68		2
68		2
68		2
68		2
68		2
68		2
68		2
68		2
68		2
87		3
88		4
88		4
88		4
88		4

Process finished with exit code 0

 */