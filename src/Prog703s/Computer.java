package Prog703s;

public class Computer implements comps{
  private String myName;
  private int myNumber;
  private double myValue;

  public Computer(String name, int num, double val){
    myName = name;
    myNumber = num;
    myValue = val;
  }

  public String getName(){return myName;}
  public int getNumber(){return myNumber;}
  public double getValue(){return myValue;}

}