package Prog702q;
//1
public class Car extends Vehicle{
    private double myWorth;

    public Car(String name, String tires, double worth){
        super(name, tires, worth);
        myWorth = worth;
    }

    public double carWorth(){return myWorth;}
}
