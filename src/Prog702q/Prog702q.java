package Prog702q;

import Prog701g.Student;

import java.io.*;
import java.util.*;

public class Prog702q {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog702q.txt"));
                List<Vehicle> list = new ArrayList<Vehicle>() ;


                int num = input.nextInt();
            while (num != 99) {
                String name = input.next();
                String tires = input.next();
                if (num == 1) {
                    double CarWorth = input.nextDouble();
                    Vehicle c = new Car(name, tires, CarWorth);
                    list.add(c);
                } else if (num == 2) {
                    double miles = input.nextDouble();
                    Vehicle t = new Truck(name, tires, miles);
                    list.add(t);
                } else if (num == 3) {
                    String City = input.next();
                    Vehicle b = new Busses(name, tires, City);
                    list.add(b);
                }
                num = input.nextInt();
            }


            int totVehicles = list.size();

            double totWorth = 0;
            String longName = "";
            double leastValue = 100000;
            int CTires = 0;
            int TTires = 0;
            int BTires = 0;

            for(Vehicle x : list){
                if(x instanceof Car){
                    totWorth += ((Car) x).carWorth();
                    CTires += Integer.parseInt(((Car)x).getTire());
                }else if(x instanceof Truck){
                    double tValue = 50000 - (0.25 * ((Truck)x).myMiles());
                    totWorth+= tValue;
                    if(tValue < leastValue){
                        leastValue = tValue;
                    }
                }
            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
