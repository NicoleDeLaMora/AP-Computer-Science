import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Prog241c {
    public static  void main(String[] args){
    /*
    A service station with a car wash sells three grades of gasoline:
    regular unleaded at $1.359 per gallon,
    premium at $1.479 per gallon,
    and high octane at $1.429 per gallon

    A car wash normally costs $2.00, but the station offers a 10% reduction on the price of a
    wash for every full gallon of gasoline purchased in the excess of the first 10 gallons.
    When 20 or more gallons are purchased, the car wash is free


      The program should print the cost of the gasoline and the price of a wash,
      read another character indicates whether or not the customer wants a car wash,
      and then print the total charges in the form of an invoice

     */
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog214c.dat"));

            ArrayList<String> type = new ArrayList<String>();
            ArrayList<String> wash = new ArrayList<String>();
            ArrayList<Double> gal = new ArrayList<Double>();
            ArrayList<Integer> count = new ArrayList<Integer>();


            while(input.hasNext()) {
                for(int lcv = 0;){ //FIX THIS
                    type.add(input.nextLine());
                    gal.add(input.nextDouble());
                    wash.add(input.nextLine());
                    count.add(lcv);

                }
            }
            while(input.hasNext()) {
                for(int x : count)
                Prog214cCL wow = new Prog214cCL(type.get(x), wash.get(x), gal.get(x));





            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }

    }
}
