

/*
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog285b {

    public class Prog285b {
        public static void main(String[] args){
            try {
                Scanner input = new Scanner (new File( ".../.data/prog285b.dat"));

                while(input.hasNext()) {
                    int id = input.nextInt();
                    int c = input.nextInt();
                    double s = input.nextDouble();
                    double com = 0;

                    if (c == 5 || c == 8) {
                        if (s <= 5000) {
                            com = s * 0.075;
                        else com = 5000 * 0.075 + (s - 5000) * 0.085;
                        }
                    } else if (c == 17) {
                        if (s <= 3500)
                            com = s * 0.095;
                        else
                            com = 3500 * 0.095 + (s - 35000) * 0.12;

                    }
                    System.out.printf("%d\t\t%d\t\t%.2f\t\t%.2nf\n", id, c, s, com);

                }
            }catch (IOException e) {
                System.out.println("Can't fine the data file!");
            }
        }


    }

 */