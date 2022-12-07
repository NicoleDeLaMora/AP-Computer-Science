public class LP39Class {

    private int by;
    private int bm;
    private int bd;

    private int ty;
    private int tm;
    private int td;

    private double totSlept;
    private int totAlive;

    public LP39Class(int bity, int bitm, int bitd, int tdy, int tdm, int tdd){
         by = bity;
         bm = bitm;
         bd = bitd;

         ty = tdy;
         tm = tdm;
         td = tdd;
    }
    public void calc(){
        int difYear = ( ty-by ) * 365;
        int difMonth = (tm-bm) * 30;
        int difDay = td - bd;

        totAlive = difYear + difMonth + difDay;
        totSlept = totAlive * 8;
/*
difYear = (myCurYear- myYear) * 365;
        difMonth = (myCurMonth - myMonth) * 30;
        difDay = myCurDay - myDay ;
        myTotDay = difDay+ difMonth + difYear ;
        myTotHours = myTotDay *8;
 */
    }

    public int areyouALIVE(){return totAlive;}
    public double areyouSLEEPING(){return totSlept;}
}
