import java.util.*;
public class Prog214cCL {
    private String type;
    private String Wash;
    private double galCost;
    private double Cost;
    private double gal;

    //rivate ArrayList<String> ALtype;
    //private ArrayList<String> ALWash;
    //private ArrayList<Double> ALGal;

public class Prog213cCL(String typers, String washers, double gallons){

        type = typers;
        Wash = washers;
        gal = gallons;

}
public static double CalcGas(){
    return type * gal;
}
public static double CalcWash(){
    if(Wash.equals("Y")){

        if(gal >= 20){
            return 0.0;
        }else if()


    }else return 0.0;
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
