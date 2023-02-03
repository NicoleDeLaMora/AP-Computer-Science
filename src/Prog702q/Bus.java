package Prog702q;

public class Bus extends Vehicle{
    private String myCitry;

    public Bus(String n, String t, String cit){
        super(n, t, 50000);
        cit = myCitry;
    }

    public String getMyCity(){return myCitry;}

}
