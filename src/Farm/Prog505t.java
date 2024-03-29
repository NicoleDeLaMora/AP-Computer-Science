package Farm;

import java.io.*;
import java.util.*;

public class Prog505t {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog505t.dat"));
            ArrayList<Horse> Horses = new ArrayList<Horse>();
            ArrayList<Cow> Cows = new ArrayList<Cow>();


            int hay = input.nextInt();
            double hayCOst = input.nextDouble();
            int corn = input.nextInt();
            double cornCost = input.nextDouble();

            int cowRows = input.nextInt();

            for (int r = 0; r < cowRows; r++) {

                    int wight = input.nextInt();
                    int milk = input.nextInt();
                    int hayMunch = input.nextInt();
                    int cornMunch = input.nextInt();
                    Cow wow = new Cow(null, wight, milk, hayMunch, cornMunch);
                    Cows.add(wow);
                    hay -= hayMunch;
                    corn -= cornMunch;
            }

            int horseRows = input.nextInt();

            for (int r = 0; r < horseRows; r++) {

                    int wight = input.nextInt();
                    int hayMunch = input.nextInt();
                    int cornMunch = input.nextInt();
                    int rides = input.nextInt();
                    double ridesCost = input.nextDouble();
                    Horse fred = new Horse( null, wight, rides, hayMunch, cornMunch, ridesCost);
                    Horses.add(fred);
                    hay -= hayMunch;
                    corn -= cornMunch;
            }
            Farm farm = new Farm(Horses, Cows, hay, corn, hayCOst, cornCost);

          /*
The program should report the income of the day,    check
Report  the cost of feeding the animals for a day   check
report the cumulative weight of all animals.        check
It should determine if there is enough food to feed all the animals, if so, feed all the animals and report how many bales of hay and cobs of corn are left in the barn.  If there is not enough food for ALL the animals, none of the animals get fed ☹ - report that there is insufficient food to feed the animals and request an immediate shipment of hay and corn for the amount of needed of each.                                                  check
o   Sell off the 3 cows that generate the lowest amount of milk.           check
o   Sell off the 2 horses that generate the lowest amount of ride income.  check

o   Change the first cow.   The cow has a weight of 1250, followed by 80 pounds of milk produced per day, followed by the number of 3 hay bales eaten each day, followed by 4 corncobs eaten each day.
o   Report the total number of cows and horses on the farm.

            */
          
          //report income
          System.out.println("Income of the day: $" + farm.farmIncome());
          
          //report cost of feeding all animals
          System.out.println("Cost of feeding animals: $" + farm.getCost());
          
          //Wight of all animals
          System.out.println("Weight of all animals: " + farm.getWeight());



          
          //enough food? 
          int eatHay = 0;
            int eatCOrn = 0;
           for(int lcv = 0; lcv < Cows.size(); lcv++) {
              eatHay += Cows.get(lcv).getNumHay();
              eatCOrn += Cows.get(lcv).getNumCorn();
            }
            for(int lcv = 0; lcv < Horses.size(); lcv++) {
              eatHay += Horses.get(lcv).getNumHay();
              eatCOrn += Horses.get(lcv).getNumCorn();
            }
          if(farm.feedAllAnimals()){
            System.out.println("Number of hay bales left over: " + (hay - eatHay));   
            System.out.println("Number of corn cobs left over: " + (corn - eatCOrn));

          }else{
            System.out.println("There is insufficient food to feed all animals and we are request a shipment of: \n" 
                               + (hay-eatHay) + "hay bales \n" + (corn-eatCOrn) + "cobs of corn");
          }
          
          
          //least earning cow
          for(int three = 0; three < 3; three++){
            int leastIndex = 0;
            for(int lcv = 1; lcv < Cows.size(); lcv++){
              if(Cows.get(lcv).value(cornCost, hayCOst) < Cows.get(leastIndex).value(cornCost, hayCOst)){
                leastIndex = lcv;
              }
            } 
            Cows.remove(leastIndex);
          }
          //least earning horse
            for(int two = 0; two < 4; two++){
              int leastIndex = 0;
              for(int lcv = 1; lcv < Horses.size(); lcv++){
                if(Horses.get(lcv).value(cornCost, hayCOst) < Horses.get(leastIndex).value(cornCost, hayCOst)){
                  leastIndex = lcv;
                }
              } 
              Horses.remove(leastIndex);
            }
        /*
          o   Change the first cow.   The cow has a weight of 1250, followed by 80 pounds of milk produced per day,                       followed by the number of 3 hay bales eaten each day, followed by 4 corncobs eaten each day.
          o   Report the total number of cows and horses on the farm.
        */

          //first cow sitch
          Cows.set(0, new Cow ("patricia", 1250, 80, 3, 4));
          //Total number horses + cows
          System.out.println("Total number of cows: " + Cows.size());
          System.out.println("Total number of horses: " + Horses.size());
          



        } catch (
    IOException e) {
        System.out.println("Can't find data file!");
    }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=57635:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Farm.Prog505t
Income of the day: $251.0
Cost of feeding animals: $180.5
Weight of all animals: 42835
Number of hay bales left over: 859
Number of corn cobs left over: 2359
Total number of cows: 12
Total number of horses: 6

Process finished with exit code 0

 */