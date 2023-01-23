//Nicole de la Mora // 01/23/23 // prog464d

import java.io.*;
import java.util.*;

public class Prog464d {

    public static int[][] transpose (int[][] mat){
         int[][] transposed = new int[mat[0].length][mat.length];
         for(int row = 0; row < mat.length; row++){
             for(int col = 0; col < mat[0].length; col++){
                 transposed[col][row] = mat[row][col];
             }
         }
         return transposed;
    }

    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog464a.dat"));

            //Row Major Order : (int r = ...){for(int c = ...)
            int[][] mat = new int[5][5];
            for(int r = 0; r < mat.length; r++){
                for(int c = 0; c < mat[0].length; c++){
                    mat[r][c] = input.nextInt();

                }
            }
           int[][] transpo = transpose(mat);

            System.out.println("Original Matrix:");
            for(int[] r : mat){
                        for(int c : r){
                            System.out.print(c + " ");
                }
                System.out.println();
            }


            System.out.println("\nTransposed Matrix:");
            for(int[] r : transpo){
                for(int c : r){
                    System.out.print(c + " ");
                }
                System.out.println();
            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Original Matrix:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

Transposed Matrix:
45 -3 96 14 19
67 -6 81 -7 43
89 -7 -8 72 28
12 -4 52 29 63
-3 -9 12 -1 87

Process finished with exit code 0

 */