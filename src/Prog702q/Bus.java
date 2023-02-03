package Prog702q;

public class Bus extends Vehicle{
    private String myCity;
    public Bus(String n, String t, String cit){
        super(n, t, 0);
        cit = myCity;
    }
    public String getMyCity(){return myCity;}
}
