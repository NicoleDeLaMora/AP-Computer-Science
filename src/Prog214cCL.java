import java.util.*;



public class Prog214cCL {
    private String type;
    private String wash;
    private double galCost;
    private double Cost;
    private double gal;

    //rivate ArrayList<String> ALtype;
    //private ArrayList<String> ALWash;
    //private ArrayList<Double> ALGal;

public void Prog213cCL(String typers, String washers, double gallons){

        type = typers;
        wash = washers;
        gal = gallons;

}
public double CalcGas(){
    if(type.equals("P")){
        return (1.479 * gal);
    }else if(type.equals("R")){
        return (1.359 * gal);
    }else return (1.429 * gal);
}

public double CalcWash(){
    if(wash.equals("Y")){

        if(gal >= 20){
            return 0.0;
        }else if(gal >= 10){
            return ((200 * (10 * Math.floor(gal-10)) / 100));
        }else return 2.00;
    }else return 0.0;
}

public String ticket(){
    System.out.print("COMPSCI PETROLEUM COMPANY\n");
    System.out.print("----------------------------\n")
    if(type.equals("P")){
System.out.print("");
    }else if(type.equals("R")){
        System.out.print("");
    }else System.out.print("");


}

/*

    A service station with a car wash sells three grades of gasoline:
    regular unleaded at $1.359 per gallon,
    premium at $1.479 per gallon,
    and high octane at $1.429 per gallon

    A car wash normally costs $2.00, but the station offers a 10% reduction on the price of a
    wash for every full gallon of gasoline purchased in the excess of the first 10 gallons.
    When 20 or more gallons are purchased, the car wash is free


      The program should print the cost of the gasoline and the price of a wash,
      read another character indicates whether or not the customer wants a car wash,
      and then print the total charges in the form of an invoice

*/




}


