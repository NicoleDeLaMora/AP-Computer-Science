t//Nicole de la Mora // 11/3//22 // Prog 88a Class
public class Prog88aCl {
  private int sum;
  private int dif;
  private double prod;
  private double ave;
  private int dis;
  private int max;
  private int num1;
  private int num2;

  public Prog88aCl(int n1, int n2) {
    num1 = n1;
    num2 = n2;
    sum = 0;
    dif = 0;
    prod = 0;
    ave = 0;
    dis = 0;
    max = 0;

  }
  public void calcIT(){
    sum = (num1+num2);
    dif = Math.abs(num1-num2);
    prod = num1*num2;
    ave = (num1+num2)/2;
    dis = Math.abs(num1 - num2) + num1 + num2;
    if (num1>num2){
      max = num1;
    }else max = num2;
  }
  public int getSum(){return sum;}
  public int getDif(){return dif;}
  public double getProd(){return prod;}
  public double getAve(){return ave;}
  public int getDis(){return dis;}
  public int getMax(){return max;}
  
  }