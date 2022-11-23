//Nicole de la Mora // 11/22/22 // LP3-9
public class LP310 {
    private int fry;
    private int burger;
    private int soda;

    private double cost;
    private double costTAX;

    private double tend;
    private double change;

    public LP310(int burg, int fly, int pop){
        fry = fly;
        burger = burg;
        soda = pop;

        cost = 0;
        costTAX = 0;
        tend = 0;
        change = 0;
    }
   public void calc(){
        cost = (fry * 1.09) + (burger * 1.69) + (soda * 0.99);
        costTAX = cost * 0.065;
    }

    public double getCost(){return cost;}
    public double getTAX(){return costTAX;}
    public double getCostTAX(){return cost + costTAX;}

    public double tenders(double amo){
        tend = amo;
        change = tend - getCostTAX();
        return change;
    }


}
