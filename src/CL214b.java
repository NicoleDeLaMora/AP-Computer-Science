public class CL214b {

    //calc:
    private double Gross;
    private double withTAX;
    private double ssTAX;
    private double netPAY;

    //given:
    private int empNUM;
    private double ytd;
    private double bpRATE;
    private double hrWork;
    private double shift;

    public CL214b(int eNum, double ytdPAY, double bpR, double hrW, double shit){
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
}
/*
The social security tax (FICA tax) depends on the gross pay and the year-to-date pay.
If the year-to-date pay is greater than $17,300, then there is no social security tax.
If the year-to-date pay plus the gross pay is less than or equal to $17,300, then the
 social security tax is 6.05% of the gross pay.

  If the year-to-date pay is less then $17,300, but the sum of the year-to-date pay and
  gross pay is greater than $17,300,  then the tax is 6.05% of the difference between
  $17,300 and the year-to-date pay plus the gross pay.

 if (ytd > 17300){
 ss = 0;
 if (ytd + gross <= 17300){
 ss = gross * 0.0605
 if(ytd + gross > 17300){
 ss = 0.0605 * (17300 - ytd+gross);
 */
