public class Prog54cCL {
    private double r;
    private double c;
    private double a;
    private double pi;

    public Prog54cCL(double rad){
        r = rad;
        c = 0;
        a = 0;
        pi = 3.14159;
    }
    public void calc(){
        c  = 2 * pi * r;
        a = pi * Math.pow(r,2);
    }
    public double getA(){return a;}
    public double getC(){return c;}
}
