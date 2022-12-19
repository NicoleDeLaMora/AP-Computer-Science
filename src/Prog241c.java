import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog241c {
    public static void main(String[] args) {

        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog214c.dat"));

            ArrayList<String> type = new ArrayList<String>();
            ArrayList<String> wash = new ArrayList<String>();
            ArrayList<Double> gal = new ArrayList<Double>();
            ArrayList<Integer> count = new ArrayList<Integer>();


            while (input.hasNext()) {
                for (int lcv = 0; ) { //FIX THIS
                    type.add(input.nextLine());
                    gal.add(input.nextDouble());
                    wash.add(input.nextLine());
                    count.add(lcv);


                    int x = 1;
                    for (x : count)
                        Prog214cCL wow = new Prog214cCL(type.get(x), wash.get(x), gal.get(x));
                }
            }


            } catch(IOException e){
                System.out.println("Can't find data file!");
            }

        }
    }


