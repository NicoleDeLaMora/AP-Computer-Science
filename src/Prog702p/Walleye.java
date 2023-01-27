package Prog702p;

public class Walleye extends Animal{
    private int mySteps;

    public Walleye(String name, String word, int s){
        super(name, word);
        mySteps = s;
    }

    public int getSteps(){return mySteps;}
}
