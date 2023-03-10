//Nicole de la Mora // 02/15/23
import java.util.*;
import java.io.*;

public class Prog477a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] list = new int[5][3];

            while(input.hasNext()){
                if(input.nextInt() == 1) {
                    int num = input.nextInt();
                    if (num == 1)
                        list[0][0]++;
                    else if (num == 2)
                        list[1][0]++;
                    else if (num == 3)
                        list[2][0]++;
                    else if (num == 4)
                        list[3][0]++;
                    else if (num == 5)
                        list[4][0]++;
                }
                else {
                    int num = input.nextInt();
                    if (num == 1)
                        list[0][1]++;
                    else if (num == 2)
                        list[1][1]++;
                    else if (num == 3)
                        list[2][1]++;
                    else if (input.nextInt() == 4)
                        list[3][1]++;
                    else if (input.nextInt() == 5)
                        list[4][1]++;

                }

            }
            }

            for(int row = 0; row < list.length; row++){
                for(int col = 0; col < list[0].length; col++){
                    if(col == 2)
                        list[row][2] = list[row][1] + list[row][0];

                }
            }

            System.out.print("Grade\tMale\tFemale\tTotal\n");
            System.out.println("A\t" + list[0][0] + "\t" + list[0][1] + "\t" + list[0][2]);
            System.out.println("B\t" + list[1][0] + "\t" + list[1][1] + "\t" + list[1][2]);
            System.out.println("C\t" + list[2][0] + "\t" + list[2][1] + "\t" + list[2][2]);
            System.out.println("D\t" + list[3][0] + "\t" + list[3][1] + "\t" + list[3][2]);
            System.out.println("F\t" + list[4][0] + "\t" + list[4][1] + "\t" + list[4][2]);
//int row = grade
            //int col = gender (?)
            //list[row][col] ++
            //list[row][2] == list[row][0] + list[row][1];







        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
