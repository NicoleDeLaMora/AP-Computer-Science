package ABSTCLlab;

public class Rectangle extends NotCircle{
    private double width;

    public Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    public void setHeight(double g){height = g;}
    public void setWidth(double w){width = w;}

    public double getHeight(){return height;}
    public double getWidth(){return width;}

    public void calculateArea(){
        System.out.println("Area: " + (width * height));
    }
    public void calculateCircumference(){
        double circ = (2 * width) + ( 2 * height);
        System.out.println("Perimeter: " + circ);
    }

    public void calculatePerimeter(){ //mask for calculate circumference
        this.calculateCircumference();
    }
}
