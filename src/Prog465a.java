import java.io.*;
import java.util.*;

public class Prog465a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog465a.dat"));

            int[][] a = new int[4][4];
            int[][] b = new int[4][4];
            int[][] c = new int[4][4];
            //make 1st array
            for(int row = 0; row < a.length; row++){
                for(int col = 0; col < a[0].length; col++){
                    a[row][col] = input.nextInt();
                }
            }
            //make 2nd array
            for(int r = 0; r < b.length; r++){
                for(int co = 0; co < a[0].length; co++){
                    b[r][co] = input.nextInt();
                }
            }
            System.out.println("First Array: ");
            for(int row = 0; row < a.length; row++){
                for(int col = 0; col <= a[0].length-1; col++){
                    System.out.print(a[row][col] + " ");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Second Array: ");

            for(int r = 0; r<b.length; r++){
                for (int co = 0; co <= b[0].length-1; co++){
                    System.out.print(b[r][co] + " ");
                }
                System.out.println();
            }
            System.out.println();

            for(int r = 0; r < a.length; r++){
                for(int co = 0; co < a[0].length; co++){
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
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=63216:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog465a
First Array:
2 7 6 4
6 1 2 4
9 7 2 6
8 3 2 1

Second Array:
4 1 3 7
6 2 3 8
7 2 2 4
4 2 3 1

Final Array:
4 7 6 7
6 2 3 8
9 7 2 6
8 3 3 1

Process finished with exit code 0

 */