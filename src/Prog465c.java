//Nicole de la Mora // 01/09/22 // Prog 465c
import java.io.*;
import java.util.*;

public class Prog465c {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog465c.txt"));

            int r = input.nextInt();
            int c = input.nextInt();
            int[][] list = new int[r][c];
            for(int row = 0; row < list.length; row++){
                for(int col = 0; col < list[0].length; col++){
                    list[row][col] = input.nextInt();
                }
            }
            for(int[] row : list){
                for(int n : row){
                    System.out.print(n + " ");
                }
                System.out.println();
            }
            int count = 0;
            for(int ro = 0; ro < list.length; ro++){
                for(int co = 0; co < list[0].length; co++){
                    if(ro == 0){

                        count += list[ro][co];
                    }else if(co == c - 1){
                        count += list[ro][co];

                    }else if(ro == r - 1){
                        count += list[ro][co];

                    }else if(co == 0){
                        count+= list[ro][co];

                    }
                }
            }
            System.out.println("The total of the edge is: " + count);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
100 195 182 225
83 125 235 67
129 42 100 750
The total of the edge is: 1873
 */