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
                golfers[lcv] = new CL435g(scores[lcv]);
            }

            int rank = 1;
            for (int lcv = 0; lcv < count; lcv++){
                golfers[lcv].setRank(rank);
                if (lcv < count - 1 && scores[lcv] != scores[lcv+1]){
                    rank++;
                }
                System.out.println("Score\t\tRank");
                for(int lvc = 0; lvc < count; lvc++){
                    System.out.println(golfers[lvc].toString());
                }
            }

        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
