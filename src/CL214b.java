public class CL214b {

    //calc:
    private double Gross;
    private double withTAX;
    private double ssTAX;
    private double netPAY;

    //given:
    private double empNUM;
    private double ytd;
    private double bpRATE;
    private double hrWork;
    private double shift;

    public CL214b(double eNum, double ytdPAY, double bpR, double hrW, double shit){
        empNUM = eNum;
        ytd = ytdPAY;
        bpRATE = bpR;
        hrWork = hrW;
        shift = shit;
        Gross = 0;
        withTAX = 0;
        ssTAX = 0;
        netPAY = 0;
    }
    public void calc(){
        Gross =  hrWork * (bpRATE * shift);

        if (Gross < 100.00){
            withTAX = Gross;
        }else if (Gross > 100.00 && Gross < 149.99){
            withTAX = Gross * 0.08;
        }else if (Gross > 150.00 && Gross < 199.99){
            withTAX = Gross * 0.12;
        }else if (Gross > 200.00 && Gross < 299.99){
            withTAX = Gross * 0.15;
        }else withTAX = 0.175;

        if(ytd > 17300){
            ssTAX = 0;
        }else if (ytd + Gross <= 17300){
            ssTAX = Gross * 0.0605;
        }else if (ytd + Gross > 17300){
            ssTAX = 0.0605 * (17300 - ytd + Gross);
        }


    }

    public double getGross(){return Gross;}
    public double getTax(){return withTAX;}
    public double getSsTAX(){return ssTAX;}
    public double getPay(){return netPAY;}
}

