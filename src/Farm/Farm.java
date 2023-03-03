package Farm;
import java.util.*;
public class Farm implements IFarm{
    private ArrayList<Horse> myHorses;
    private ArrayList<Cow> myCows;
    private int myNumHayBales;
    private int myNumCorn;
    private double myHayCost;
    private double myCornCost;
    private int myCornEaten;
    private int myHayEaten;

    public Farm(ArrayList<Horse> horsies, ArrayList<Cow> cowwows, int numHay, int numCown, double hayCost, double cornCost, int hayMunch, int cornMunch){
        myHorses = horsies;
        myCows = cowwows;
        myNumHayBales = numHay;
        myNumCorn = numCown;
        myHayCost = hayCost;
        myCornCost = cornCost;

    }
    /** Feeds all cows where farm has enough food */   //completed :)
    private boolean feedCows() {
        int eatHay = 0;
        int eatCOrn = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++) {
            eatHay += myCows.get(lcv).getNumHay();
            eatCOrn += myCows.get(lcv).getNumCorn();
        }
        if(myNumHayBales > eatHay && myNumCorn > eatCOrn)
            return true;
        return false;
    }

    /** Feeds all horses where farm has enough food */   //completed :)
    private boolean feedHorses()  {
        int eatHay = 0;
        int eatCOrn = 0;
        for(int lcv = 0; lcv < myHorses.size(); lcv++) {
            eatHay += myHorses.get(lcv).getNumHay();
            eatCOrn += myHorses.get(lcv).getNumCorn();
        }
        if(myNumHayBales > eatHay && myNumCorn > eatCOrn)
            return true;
        return false; }

    /** Feeds all cows and horses where farm has enough food */   //completed :)
    public boolean feedAllAnimals(){
        int eatHay = 0;
        int eatCOrn = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++) {
            eatHay += myCows.get(lcv).getNumHay();
            eatCOrn += myCows.get(lcv).getNumCorn();
        }
        for(int lcv = 0; lcv < myHorses.size(); lcv++) {
            eatHay += myHorses.get(lcv).getNumHay();
            eatCOrn += myHorses.get(lcv).getNumCorn();
        }
        if(myNumHayBales > eatHay && myNumCorn > eatCOrn)
            return true;
        return false;
    }

    /** Calculates the value of the milk produced by the
     *  cows price for each cow's milk is the same per pound */
    private double cowIncome(double perPound)  {
        int cowValue = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++){
            cowValue += (myCows.get(lcv).getMilk() * perPound);
        }
        return cowValue;
    }

    /** Calculates the value of the rides given by the horses
     *  ride value of each horse changes based on the horse */
    private double horseIncome() {
        int horseValue = 0;
        for(int lcv = 0; lcv < myHorses.size(); lcv++){
            horseValue += myHorses.get(lcv).getmyRides() * myHorses.get(lcv).getMyRidesCost();
        }
        return horseValue;
    }

    /** Calculates the daily income of the farm */
    public double farmIncome(){
        int farmValue = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++){
            farmValue += (myCows.get(lcv).getMilk() * myCows.get(lcv).getMilkPrice());
        }
        for(int lcv = 0; lcv < myHorses.size(); lcv++){
            farmValue += myHorses.get(lcv).getmyRides() * myHorses.get(lcv).getMyRidesCost();
        }
        return farmValue;
    }

    /** Calculates the total weight of all the farm animals */
    public int getWeight(){
        int farmWight = 0;
        for(int lcv = 0; lcv< myCows.size(); lcv++){
            farmWight += myCows.get(lcv).getWeight();
        }
        for(int lcv = 0; lcv< myHorses.size(); lcv++){
            farmWight += myHorses.get(lcv).getWeight();
        }
        return farmWight;
    }

    /** Calculates the amount of money it will
     *  take to feed the animals for the day */
    public double getCost(){
        double aminalCost = 0;
        for(int lcv = 0; lcv < myCows.size(); lcv++){
            aminalCost+= myCows.get(lcv).getFeedCost(myHayCost, myCornCost);
        }
    }

    /** Returns the cows in an ArrayList */
    public ArrayList<Cow> getCows();

    /** Returns the horses in an ArrayList */
    public ArrayList<Horse> getHorses();
}
