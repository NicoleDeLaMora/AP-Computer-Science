package Farm;

public abstract class Animal {  //abstract == unfinished

    private String myName;
    private int myWight;
    private int myNumCorn;
    private int myNumHay;

    public Animal(String n, int w, int c, int h){
        myName = n;
        myWight = w;
        myNumCorn = c;
        myNumHay = h;
    }

    public abstract double value(double cornCost, double hayCost);

    public String getName(){return myName; }
    public int getWeight(){return myWight; }
    public int getNumCorn(){return myNumCorn; }
    public int getNumHay(){return myNumHay; }

    public double getFeedCost(double cornCost, double hayCost){
        return (myNumCorn * cornCost) + (myNumHay * hayCost);
    }
}
