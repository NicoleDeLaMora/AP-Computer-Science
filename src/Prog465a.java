import java.io.*;
import java.util.*;

public class Prog465a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));

            int[][] a = new int[4][4];
            int[][] b = new int[4][4];
            int[][] c = new int[4][4];
            //make 1st array
            for(int row = 0; row < a.length; row++){
                for(int col = 0; col < a[0].length - 1; col++){
                    a[row][col] = input.nextInt();
                }
            }
            //make 2nd array
            for(int r = 0; r < b.length -1; r++){
                for(int co = 0; co < a[0].length - 1; co++){
                    b[r][co] = input.nextInt();
                }
            }
            System.out.println("First Array: ");
            for(int row = 0; row < a.length-1; row++){
                for(int col = 0; col <= a[0].length-1; col++){
                    System.out.print(a[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Second Array: ");

            for(int r = 0; r<b.length-1; r++){
                for (int co = 0; co <= b[0].length-1; co++){
                    System.out.print(b[r][co] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for(int r = 0; r < a.length-1; r++){
                for(int co = 0; co < a[0].length-1; co++){
                    if(a[r][co] > b[r][co]){
                        c[r][co] = a[r][co];
                    }else c[r][co] = b[r][co];
                }
            }
            System.out.println("Final Array: ");
            for(int[] row : c){
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
