//Nicole de la Mora // 12/5/22 // Prog213v
public class Transaction
{
    private String myType;
    private double myAmot;

    public Transaction (String type, double amount){
        myType = type;
        myAmot = amount;
    }

    public String getCODE(){return myType;}
    public double getAMOUNT(){return myAmot;}

}
