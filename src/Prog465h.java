import java.io.*;
import java.util.*;

public class Prog465h {
  public static void main(String[] args) {
    try { // On Replit, may need to put "../data/prog285b.dat"
      Scanner input = new Scanner(new File("data/prog465h.txt"));
      while (input.hasNext()) {
        //Make [][]
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] OGlist = new int[row][col];
        int Ocount = 0; 
        int Rcount = 0;
        for(int r = 0; r < OGlist.length; r++){
          for(int c = 0; c < OGlist[0].length; c++){
              OGlist[r][c] = input.nextInt(); 
          }
        }
        //find out what it is ++ write it
        System.out.println("Original Matrix");
        for(int r = 0; r < OGlist.length; r++){
          for(int c = 0; c < OGlist[0].length; c++){
              if(OGlist[r][c] == 0) Ocount++;
              else Rcount++;
              System.out.print(OGlist[r][c] + "\t");
          }
          System.out.println();
        }
        
        //actually label it
        
        if(Ocount > Rcount){
          //code SPARSE
          //make array
          int[][] newArray = new int[Rcount][3];
          int numCounter = 0;
          for(int r = 0; r < OGlist.length; r++){
            for(int c = 0; c < OGlist[0].length; c++){
             if(OGlist[r][c] != 0){
               newArray[numCounter][0] = r;
               newArray[numCounter][1] = c;
               newArray[numCounter][2] = OGlist[r][c];
               numCounter++;
             } 
            }   
          }
          //print new array
          for(int[] r : newArray){
            for(int c : r)
              System.out.print(c + "\t");
            System.out.println();
          }
          

          System.out.println("The Original Matrix is Sparse\n");

          
        }else if (Ocount == Rcount){
          //code Both SPARSE and Abundent 
           int[][] newArray = new int[Rcount][3];
          int numCounter = 0;
          for(int r = 0; r < OGlist.length; r++){
            for(int c = 0; c < OGlist[0].length; c++){
             if(OGlist[r][c] != 0){
               newArray[numCounter][0] = r;
               newArray[numCounter][1] = c;
               newArray[numCounter][2] = OGlist[r][c];
               numCounter++;
             } 
            }   
          }
          //print new array
          for(int[] r : newArray){
            for(int c : r)
              System.out.print(c + "\t");
            System.out.println();
          }

          System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient\n");
        }else 
          //abundent (just print it)
          System.out.println("The Original Matrix is Abundent\n");
      }
      

    } catch (IOException e) {
      System.out.println("Can't find data file!");
    }
  }
}
/*
Original Matrix
0   0   7   0   0   0
0   0   0   0   -8  0
0   0   0   0   0   0
2   0   0   0   0   0
0   0   0   0   0   0
0   2   7
1   4   -8
3   0   2
The Original Matrix is Sparse

Original Matrix
0   2   0   3   0   1
8   0   4   0   1   0
0   3   0   1   0   -7
5   0   9   0   6   0
0   2   0   -1  0   7
0   1   2
0   3   3
0   5   1
1   0   8
1   2   4
1   4   1
2   1   3
2   3   1
2   5   -7
3   0   5
3   2   9
3   4   6
4   1   2
4   3   -1
4   5   7
The Original Matrix and the Sparse Matrix are Equally Efficient

Original Matrix
0   0   1   0   0   2
3   0   0   4   0   0
0   0   5   0   0   6
7   0   0   8   0   0
0   0   9   0   0   1
0   2   1
0   5   2
1   0   3
1   3   4
2   2   5
2   5   6
3   0   7
3   3   8
4   2   9
4   5   1
The Original Matrix is Sparse

*/