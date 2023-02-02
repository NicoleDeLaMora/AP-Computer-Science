package Prog702q;
//2
public class Truck extends Vehicle{
    private double mymyMiles;

    public Truck(String name, String tires, Double miles){
        super(name, tires, miles);
        mymyMiles = miles;
    }

    public double myMiles(){return mymyMiles;}
}
