package ABSTCLlab;

public class Circle implements Shape{
        private double radius;

        public Circle(double rad){
            radius = rad;
        }

        public void setRad(double rad){radius = rad;}
        public double getRadius(){return radius;}

    public void calculateArea(){
            double area = Math.PI * radius * radius;
            System.out.printf("Areas: %.2f\n", area);
    }

    public void calculateCircumference(){
            double circum = 2 * Math.PI * radius;
            System.out.printf("Circumference: %.2f\n", circum);
    }



    public void printClass(){
        System.out.println(this.getClass().getSimpleName());
    }
}
