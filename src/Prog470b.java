import java.io.*;
import java.util.*;

public class Prog470b {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog464a.dat"));
            int[][] list = new int[5][5];
                for(int row = 0; row < list.length; row++){
                    for(int col = 0; col < list[0].length; col++){
                        list[row][col] = input.nextInt();
                    }
                }
            System.out.println("The Original Matrix: ");
            for(int[] r : list){
                for(int c : r){
                    System.out.print(c + " ");
                }
                System.out.println();
            }
            int first = 0;
            int second = 0;
            for(int row =0; row < list.length; row ++){
                for(int col =0; col < list[0].length; col ++){
                    if (row == col)
                        first += list[row][col];

                    if ((row + col) == ( list.length-1))
                        second += list[row][col];
                }
            }
            System.out.println("Main Diagonal sum: " + first);
            System.out.println("Other Diagonal sum: " + second);


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
The Original Matrix:
45 67 89 12 -3
-3 -6 -7 -4 -9
96 81 -8 52 12
14 -7 72 29 -1
19 43 28 63 87
Main Diagonal sum: 147
Other Diagonal sum: -3


 */