
    public class Prog214cCL {
     private String type;
     private String wash;
     private double galCost;
     private double gal;
     private double total;

    public Prog214cCL(String typers, String washers, Double gallons){
        type = typers;
        wash = washers;
        gal = gallons;
        total = 0;
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


    public void ticket() {
        System.out.print("COMPSCI PETROLEUM COMPANY\n");
        System.out.print("----------------------------\n");
        if (type.equals("P")) {
            System.out.print("Premium \t" + gal + " gallons @ 1.479\n");
        } else if (type.equals("R")) {
            System.out.print("Regular \t " + gal + " gallons @ 1.359\n");
        } else System.out.print("High Octane \t " + gal + " gallons @ 1.429\n");
        System.out.print("----------------------------\n");
        System.out.print("Gasoline\t\t\t" + this.CalcGas() + "\n");
        System.out.print("Wash " + wash + "\t\t\t" + this.CalcWash() + "\n");
        System.out.print("\t\t\t\t___");
        System.out.println("Total Due: \t\t\t" + this.calcTOT());
        System.out.print("----------------------------\n");
    }

}


