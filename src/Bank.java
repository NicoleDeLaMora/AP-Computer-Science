//Nicole de la Mora // 12/5/22 // Prog213v
public class Bank {
    private double myAmount;

    public Bank(double amt){
        myAmount = amt;
    }

    public double getAmount(){return myAmount;}

    public void calc(Transaction thing){
        if(thing.getCODE().equals("C")){

            if(thing.getAMOUNT() > this.getAmount())
                myAmount = this.getAmount() - 10;
            else
                myAmount -= thing.getAMOUNT();

        }else if(thing.getCODE().equals("S")){
            myAmount -= thing.getAMOUNT();
        }else if(thing.getCODE().equals("D")){
            myAmount += thing.getAMOUNT();
        }
    }
}
