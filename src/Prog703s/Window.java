package Prog703s;

public class Window extends Computer{
  private double myVersion;

  public Window(String name, int num, double val, double vers){
    super(name, num, val);
    myVersion = vers;
  }

  public double getVersion(){return myVersion;}
}