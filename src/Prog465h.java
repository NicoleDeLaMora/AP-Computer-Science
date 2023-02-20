import java.io.*;
import java.util.*;

public class Prog465h {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog465h.dat"));
            //get data size
            int row = input.nextInt();
            int col = input.nextInt();
            //make && fill array
            int[][] list = new int[row][col];
            for(int Rlcv = 0; Rlcv < list.length; Rlcv++){
                for(int Clcv = 0; Clcv < list[0].length; Clcv++){
                    list[Rlcv][Clcv] = input.nextInt();
                }
            }
//find out how many zeros there are
            int numbers = 0;
            int zeros = 0;
            for(int r = 0; r < list.length; r++){
                for(int c = 0; c < list[0].length; c++){
                    if(list[r][c] == 0){
                        zeros++;
                    }else numbers++;
                }
            }
            //output + label if sparse ++ fill new array
            if(numbers > zeros){
                //print array and label it
                System.out.println("Original Matrix: ");
                for(int r = 0; r < list.length; r++){ //regular
                    for(int c = 0; c < list.length; c++){
                        System.out.print(list[r][c]);
                    }
                }
                System.out.println("The Original Matrix is Abundant");
            }else if (numbers == zeros){ //bpofa
                int[][] sparse = new int[numbers][3];
                for(int ro = 0; ro < sparse.length; ro++){
                    for(int co = 0; co < sparse.length; co++){
                        for(int r = 0; r < list.length; r++){
                            for(int c = 0; c < list.length; c++){
                                int num = list[r][c];
                                if(num != 0){
                                    sparse[ro][co] = r;
                                    sparse[ro+1][co+1] = c;
                                    sparse[ro][co] = num;
                                }
                            }
                        }
                    }
                }
                System.out.println("Original Matrix: ");
                for(int r = 0; r < list.length; r++){ //regular
                    for(int c = 0; c < list.length; c++){
                        System.out.print(list[r][c]);
                    }
                }
                for(int ro = 0; ro < list.length; ro++){
                    for(int co = 0; co < list.length; co++){
                        System.out.print(sparse[ro][co]);
                    }
                }
                System.out.println("The Original Matrix and the Sparse Matrix are Equally Efficient");



            }else { //sparse
                int[][] sparse = new int[numbers][3];
                for(int ro = 0; ro < sparse.length; ro++){
                    for(int co = 0; co < sparse.length; co++){
                        for(int r = 0; r < list.length; r++){
                            for(int c = 0; c < list.length; c++){
                                int num = list[r][c];
                                if(num != 0){
                                    sparse[ro][co] = r;
                                    sparse[ro+1][co+1] = c;
                                    sparse[ro][co] = num;
                                }
                            }
                        }
                    }
                }
                System.out.println("Original Matrix: ");
                for(int r = 0; r < list.length; r++){ //regular
                    for(int c = 0; c < list.length; c++){
                        System.out.print(list[r][c]);
                    }
                }
                for(int ro = 0; ro < list.length; ro++){
                    for(int co = 0; co < list.length; co++){
                        System.out.print(sparse[ro][co]);
                    }
                }
                System.out.println("The Original Matrix is Sparse");

            }

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
