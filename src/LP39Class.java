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
        int birth = (by * 365) + (bm * 30) + bd;
        int today = (ty * 365) + (tm * 30) + td;

        totAlive = today - birth;
        totSlept = ((double)totAlive * 24) - (totAlive);

    }

    public int areyouALIVE(){return totAlive;}
    public double areyouSLEEPING(){return totSlept;}
}
