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
                    if(input.nextInt() == 1){
                        if(input.nextInt() == 1)
                            list[0][0]++;
                        if(input.nextInt() == 2)
                            list[1][0]++;
                        if(input.nextInt() == 3)
                            list[2][0]++;
                        if(input.nextInt() == 4)
                            list[3][0]++;
                        if(input.nextInt() == 5)
                            list[4][0]++;
                    else
                        if(input.nextInt() == 1)
                            list[0][1]++;
                        if(input.nextInt() == 2)
                            list[1][1]++;
                        if(input.nextInt() == 3)
                            list[2][1]++;
                        if(input.nextInt() == 4)
                            list[3][1]++;
                        if(input.nextInt() == 5)
                            list[4][1]++;
                    }
                }
            }




//int row = grade
            //int col = gender (?)
            //list[row][col] ++
            //list[row][2] == list[row][0] + list[row][1];







        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
