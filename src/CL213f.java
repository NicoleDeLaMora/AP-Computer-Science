//Nicole de la Mora // 11/8/22 // 213f
public class CL213f {
    private double myKWH;
    private double myCost;

    public CL213f(double kwh){
        myKWH = kwh;
        myCost = 0;
    }
    public void calc(){
        if (myKWH <=2000 ){
            myCost = myKWH * 0.7;
        }else if (myKWH <= 9999){
            myCost = myKWH * 0.05;
        }else myCost = myKWH * 0.04;
    }
    public String toString(){
        return "The cost of " + myKWH + " is $" + myCost;
    }

}
