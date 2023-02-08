package Prog702q;

public class Busses extends Vehicle{
    private String myCity;
    public Busses(String n, String t, String cit){
        super(n, t, 50000);
        myCity = cit;
    }
    public String getMyCity(){return myCity;}
}
