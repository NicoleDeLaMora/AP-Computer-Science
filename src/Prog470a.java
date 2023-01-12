//Nicole de la Mora // 01/11/23 // Prog470a
import java.util.*;
import java.io.*;
public class Prog470a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog464a.dat"));
            int[][] list = new int[6][5];
            for(int row = 0; row < list.length-1; row++){
                for(int col = 0; col < list[0].length; col++){
                    list[row][col] = input.nextInt();
                }
            }

            for(int c = 0; c < list.length-1; c++){
                int colCount = 0;
                for(int r = 0; r < list[0].length; r++){
                    colCount+= list[r][c];
                }
                list[4][c] = colCount;
            }

            for (int[] row : list) {
                for (int num : row) {
                    System.out.print(num + "\t");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
//error with input ughhhhhh