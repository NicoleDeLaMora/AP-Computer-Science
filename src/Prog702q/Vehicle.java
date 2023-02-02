package Prog702q;

public class Vehicle implements Name{
    private String name;
    private String tire;
    private double value;

    public Vehicle(String n, String t, double v){
        name = n;
        tire = t;
        value = v;
    }

    public String getName(){return name;}

    public String getTire(){return tire;}

    public double getValue(){return value;}
}
