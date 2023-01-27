package Prog702p;

public class Hicca extends Animal{
    private double myFur;


    public Hicca(String name, String word, double cost){
        super(name, word);
        myFur = cost;
    }

    public double getFurCost(){return myFur;}
}
