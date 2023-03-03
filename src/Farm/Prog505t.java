package Farm;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prog505t {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog505w.dat"));
            List<Horse> Horses = new ArrayList<Horse>();
            List<Cow> Cows = new ArrayList<Cow>();


            int hay = input.nextInt();
            double hayCOst = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();
            int cowPens = input.nextInt();

            for (int r = 0; r < cowRows; r++) {
                for (int p = 0; p < cowPens; p++) {
                    String name = input.next();
                    int wight = input.nextInt();
                    int milk = input.nextInt();
                    int hayMunch = input.nextInt();
                    int cornMunch = input.nextInt();
                    Cow wow = new Cow(name, wight, milk, hayMunch, cornMunch);
                    Cows.add(wow);
                    hay -= hayMunch;
                    corn -= cornMunch;
                }
            }

            int horseRows = input.nextInt();
            int horsePens = input.nextInt();

            for (int r = 0; r < horseRows; r++) {
                for (int p = 0; p < horsePens; p++) {
                    String name = input.next();
                    int wight = input.nextInt();
                    int hayMunch = input.nextInt();
                    int cornMunch = input.nextInt();
                    int rides = input.nextInt();
                    double ridesCost = input.nextDouble();
                    Horse fred = new Horse(name, wight, rides, hayMunch, cornMunch, ridesCost);
                    Horses.add(fred);
                    hay -= hayMunch;
                    corn -= cornMunch;
                }
            }








        } catch (
    IOException e) {
        System.out.println("Can't find data file!");
    }
    }
}
