package Prog703s;

public class Window extends Computer{
  private int myVersion;

  public Window(String name, int num, double val, int vers){
    super(name, num, val);
    myVersion = vers;
  }

  public int getVersion(){return myVersion;}
}