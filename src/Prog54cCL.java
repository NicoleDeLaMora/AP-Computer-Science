public class Prog54cCL {
    private double r;
    private double c;
    private double a;
    private double pi;

    public Prog54cCL(int rad){
        r = rad;
        c = 0;
        a = 0;
        pi = 3.15159;
    }
    public void calc(){
        c  = 2 * pi * r;
        a = 2 * Math.pow(r,2);
    }
    public double getC(){return c;}
    public double getA(){return a;}
}
