package Farm;

public class Horse extends Animal{
    private double myRides;
    private  double myRidesCost;

    public Horse(String name, int wight, double rides, int corn, int hay, double cost){
        super(name, wight, corn, hay);
        myRides = rides;
        myRidesCost = cost;
    }

    public double value(double cornCost, double hayCost){
        return myRides * myRidesCost - getFeedCost(cornCost, hayCost);
    }

    @Override
    public String getName(){return super.getName() + super.getName();}

    public double getmyRides(){return myRides; }
    public double getMyRidesCost(){return myRidesCost; }
}
