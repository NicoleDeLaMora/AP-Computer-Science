//Nicole de la Mora // 11/6/22 // Prog213b
public class CL213bARRAYS {
    private int myQuant;
    private double myPrice;
    private double myAmt;

    public CL213bARRAYS(int quantity){
        myQuant = quantity;
        myPrice = 0;
        myAmt = 0;
    }
    public void Calc(){
        if (myQuant > 0 && myQuant < 100) myPrice = 5.95;
        else if(myQuant > 99 && myQuant < 200) myPrice = 5.75;
        else if(myQuant > 199 && myQuant < 300) myPrice = 5.40;
        else if(myQuant >= 300 ) myPrice = 5.15;
        myAmt = myPrice * myQuant;
    }
     public String toString(){
        return "Price = $" + myPrice + "\tAmount Due = $" + String.format("%.2f", myAmt);
     }
}
