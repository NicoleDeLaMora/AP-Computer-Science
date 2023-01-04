import java.io.*;
import java.util.*;

public class Prog464a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));

            //creating the arrays
            int[][] mat = new int[5][6];  //5 arrays of 6
            for(int row = 0; row < mat.length; row++){
                for(int col = 0; col<mat[0].length-1; col++){
                    mat[row][col] = input.nextInt();
                }
            }

            //find the biggest number in each row -- set the last collum to the number  (in every row)
            for(int r = 0; r < mat.length; r++){
                int rowBig = Integer.MIN_VALUE;
                for(int c = 0; c < mat[0].length-1; c++){
                    if(mat[r][c] > rowBig){
                        rowBig = mat[r][c];
                    }
                }
                mat[r][5] = rowBig;
            }

            //print it
            for(int[] row : mat){
                for(int num : row){
                    System.out.print(num + "  ");
                }
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
