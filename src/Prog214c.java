import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog214c {
    public static void main(String[] args) {

        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog214c.dat"));

            ArrayList<String> type = new ArrayList<String>();
            ArrayList<String> wash = new ArrayList<String>();
            ArrayList<Double> gal = new ArrayList<Double>();
            ArrayList<Integer> count = new ArrayList<Integer>();

            int lcv = 0;
            while (input.hasNext()) {
                    type.add(input.next());
                    gal.add(input.nextDouble());
                    wash.add(input.next());
                    count.add(lcv);

                Prog214cCL wlw = new Prog214cCL(type.get(lcv), wash.get(lcv), gal.get(lcv)); //wrong
                wlw.ticket();
                lcv++;

            }


            } catch(IOException e){
                System.out.println("Can't find data file!");
            }

        }
    }