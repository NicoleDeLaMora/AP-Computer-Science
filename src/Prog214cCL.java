
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
            System.out.printf("Premium \t %5.2f gallons @ 1.479\n", gal);
        } else if (type.equals("R")) {
            System.out.printf("Regular \t %5.2f gallons @ 1.359\n", gal);
        } else System.out.printf("High Octane \t %5.2f gallons @ 1.429\n", gal);
        System.out.print("----------------------------\n");
        System.out.printf("Gasoline\t\t\t %5.2f \n", this.CalcGas());
        System.out.print("Wash " + wash + "\t\t\t" + this.CalcWash() + "\n");
        System.out.println("\t\t\t\t___");
        System.out.printf("Total Due: \t\t\t %5.2f \n", this.calcTOT());
        System.out.print("----------------------------\n");
    }

}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61082:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog214c
COMPSCI PETROLEUM COMPANY
----------------------------
Premium 	 15.00 gallons @ 1.479
----------------------------
Gasoline			 22.19
Wash N			0.0
				___
Total Due: 			 22.19
----------------------------
COMPSCI PETROLEUM COMPANY
----------------------------
Regular 	 21.40 gallons @ 1.359
----------------------------
Gasoline			 29.08
Wash Y			0.0
				___
Total Due: 			 29.08
----------------------------
COMPSCI PETROLEUM COMPANY
----------------------------
High Octane 	  7.50 gallons @ 1.429
----------------------------
Gasoline			 10.72
Wash Y			2.0
				___
Total Due: 			 12.72
----------------------------
COMPSCI PETROLEUM COMPANY
----------------------------
Regular 	 17.90 gallons @ 1.359
----------------------------
Gasoline			 24.33
Wash Y			140.0
				___
Total Due: 			 164.33
----------------------------

Process finished with exit code 0

 */


