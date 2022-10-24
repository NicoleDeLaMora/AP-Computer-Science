//Nicole de la Mora // 10/24/2022// Program 285b Classes
public class SalesPerson {


    //set private
    private int myID;
    private int myCode;
    private double mySales;
    private double myComish;
    //public (final <- optional, makes it unchangable)static double PI = 3.14159 == CONSTANT

    public SalesPerson(int ID, int CODE, double SALES){
        myID = ID;
        myCode = CODE;
        mySales = SALES;
        myComish = 0;

    }

    //setter // mutator
    public void setComish(){
        if (myCode == 5 || myCode == 8){
            if ( mySales <= 5000 ){
                myComish = getSales() * 0.075; //YOU CAN USE PUBLIC METHODS IN?OUT OF METHOD
            }else{
                myComish = 5000 * 0.075 + ( mySales - 5000 ) * 0.085;
            }
        }else if(myCode == 17) {
            if ( mySales <= 3500 ){
                myComish = mySales * 0.095;
            }else{
                myComish = 3500 * .095 + ( mySales - 3500 ) * 0.12;
            }
        }
    }
    //getters // accsessors
        public int getID() {return myID; }
        public int getCode() {return myCode; }
        public double getSales(){return mySales; }
        public double getComish(){return myComish; }

    public String toString(){
        return myID + "\t" + myCode + "\t" + mySales + "\t" + getComish(); //works either way, variable or class
    }

        }
//DO NOT RETURN FROM A VOID METHOD