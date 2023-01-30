package ABSTCLlab;

//abstract == unfinished
public abstract class NotCircle implements Shape {
    protected double height;

    public abstract double getHeight();
    public abstract void setHeight(double g);

    public void printClass(){
        System.out.println(this.getClass().getSimpleName());
    }
}
