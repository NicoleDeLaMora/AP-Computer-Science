//Nicole de la Mora // 02/15/23
import java.util.*;
import java.io.*;

public class Prog477a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] list = new int[5][3];


            for(int row = 0; row < list.length; row++){
                for(int col = 0; col < list.length; col++){
                    if(row == 0 && col == 0){
                        list[0][0] ++;
                    }
                }
            }

//int row = grade
            //int col = gender (?)
            //list[row][col] ++
            //list[row][2] == list[row][0] + list[row][1];





          /*  int male = 0;
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int f = 0;

            int female = 0;
            int aF = 0;
            int bF = 0;
            int cF = 0;
            int dF = 0;
            int fF = 0;

            for(int lcv = 0; lcv < list.length; lcv++){
                if(input.nextInt() == 1){
                    male++;
                    if(input.nextInt() == 1){
                        a++;
                    }else if(input.nextInt() == 2) {
                        b++;
                    }else if(input.nextInt() == 3) {
                        c++;
                    }else if(input.nextInt() == 4) {
                        d++;
                    }else f++;
                }else {
                    female++;
                    if(input.nextInt() == 1){
                        aF++;
                    }else if(input.nextInt() == 2) {
                        bF++;
                    }else if(input.nextInt() == 3) {
                        cF++;
                    }else if(input.nextInt() == 4) {
                        dF++;
                    }else fF++;
                }
*/



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
