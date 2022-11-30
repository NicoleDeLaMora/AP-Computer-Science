//Nicole de la Mora // 11/30/22 // Prog 602b Array List
public class internetCustomer {
    private int myAcc;
    private double myHR;
    private int myCode;
    private double myCharge;

public internetCustomer(int acc, double hr, int code){
    myAcc = acc;
    myHR = hr;
    myCode = code;
    myCharge = 0;
}
public void setCharge(){
    //get surcharge
    double sur = 0;
    if(myCode == 1)  sur = 50;
    else if(myCode == 2)  sur = 150;

    //get charge
    if(myHR >= 15.01)   myCharge = 550 + 30 * (myHR - 15);
    else if(myHR >= 5.01) myCharge = 200 + (50 * (myHR - 5));
    else  myCharge = 200;

    //add the two
    myCharge += sur;

}

public int getACCT(){return myAcc;}
public double getHOUR(){return myHR;}
public int getCODE(){return myCode;}
public double getCHAR(){return myCharge;}

}
