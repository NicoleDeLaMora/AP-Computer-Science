import java.util.*;



public class Prog214cCL {
    private String type;
    private String wash;
    private double galCost;
    private double Cost;
    private double gal;
    private double total;

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

public double calcTOT(){

    total = CalcGas() + CalcWash();
    return total;
}


public String ticket() {
    System.out.print("COMPSCI PETROLEUM COMPANY\n");
    System.out.print("----------------------------\n");
    if (type.equals("P")) {
        System.out.print("Premium \t\t" + gal + "gallons @ 1.479\n");
    } else if (type.equals("R")) {
        System.out.print("Regular \t\t " + gal + "gallons @ 1.359\n");
    } else System.out.print("High Octane \t\t " + gal + "gallons @ 1.429\n");
    System.out.print("----------------------------\n");
    System.out.print("Gasoline\t\t\t" + this.galCost + "\n");
    System.out.print("Wash" + wash + "\t\t\t" + this.CalcWash() + "\n");
    System.out.print("\t\t\t\t___");
    System.out.println("Total Due: \t\t\t" + this.calcTOT());
    System.out.print("----------------------------\n");

return "0";
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


