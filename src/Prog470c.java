import java.io.*;
import java.util.*;

public class Prog470c {
   public static void main(String[] args){
       try {  // On Replit, may need to put "../data/prog285b.dat"
           Scanner input = new Scanner(new File("data/prog464a.dat"));
            int[][] mat = new int[6][6];
            //filling the arrays
            for(int row = 0; row < mat.length-1; row++){
                for(int col = 0; col < mat[0].length - 1; col++){
                    mat[row][col] = input.nextInt();

                }
            }
            //print the 2d array
            for(int r = 0; r<mat.length-1; r++){
                for (int c = 0; c < mat[0].length-1; c++){  //these two for loops are called traversal row major order --means running a for loop - for ewach row, for each collum
                    System.out.print(mat[r][c] + " ");
                }
                System.out.println();
            }
            System.out.println();

            //summmmm
            for(int row = 0; row < mat.length-1; row++){
                for(int col = 0; col < mat[0].length-1; col++){
                    mat[row][5] += mat[row][col]; //sum up row
                    mat[5][col] += mat[row][col];//sum up col
                    mat[5][5] += mat[row][col]; //sum up diagonal
                }
            }
            //Print new array
            for(int[] row : mat){
                for(int n : row){
                    System.out.print(n + " ");
                }
                System.out.println();
            }


       } catch (IOException e) {
           System.out.println("Can't find data file!");
       }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57868:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog470c
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87

45 67 89 12 -3 210
-3 -6 -7 -4 -9 -29
96 81 -8 52 12 233
14 -7 72 29 -1 107
19 43 28 63 87 240
171 178 174 152 86 761

Process finished with exit code 0

 */