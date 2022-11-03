public class Prog82aCL{
  private int speed;
  private int limit;
  private double fine;

  public Prog82aCL(int s, int l){
  speed = s;
  limit = l;
  fine = 0;  
  }
  public void calcIT(){
    fine = 20.00 + ((speed - limit) * 5.00);
    
  }
  public double getFIne(){return fine;}
}