package ABSTCLlab;

public class Triangle extends NotCircle{
    private double base;


    public Triangle(double h, double v){
        height = h;
        base = v;
    }

    public void setHeight(double h){height = h;}
    public void setBase(double b){base = b;}

    public double getHeight(){return height;}
    public double getBase(){return base;}

    public void calculateArea(){
        System.out.println("Area: " + (0.5*base*height));
    }
    public void calculateCircumference(){
       double csquare = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
       double circum = csquare + base + height;
        System.out.println("Perimeter: " + circum);
    }

    public void calculatePerimeter(){
        this.calculateCircumference();
    }

}
