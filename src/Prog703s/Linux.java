package Prog703s;

public class Linux extends Computer{
  private double myCode;

  public Linux(String name, int num, double val, double code){
    super(name, num, val);
    myCode = code;
  }

  public double getCode(){return myCode;}
}