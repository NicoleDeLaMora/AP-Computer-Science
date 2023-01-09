//Nicole de la Mora // 01/09/22 // Prog 465c
import java.io.*;
import java.util.*;

public class Prog465c {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            int c = input.nextInt();
            int r = input.nextInt();
            int[][] list = new int[r][c];
            for(int row = 0; row < list.length; row++){
                for(int col = 0; col < list.length; col++){
                    list[row][col] = input.nextInt();
                }
            }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
