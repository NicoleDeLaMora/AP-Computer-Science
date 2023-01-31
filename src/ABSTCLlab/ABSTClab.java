package ABSTCLlab;
import java.util.*;
public class ABSTClab {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //circle
        System.out.print("Enter circle radius: ");
        double radius = input.nextDouble();
        Shape sh1 = new Circle(radius);  //call the interface og
        //rectnagle
        System.out.print("Enter Height: ");
        double rHeight = input.nextDouble();
        System.out.print("Enter Width: ");
        double rWidth = input.nextDouble();
        Shape sh2 = new Rectangle(rHeight, rWidth);
        //Triangle
        System.out.print("Enter Triangle Base: ");
        double tbase = input.nextDouble();
        System.out.print("Enter Triangle Height: ");
        double tHeight = input.nextDouble();
        Shape sh3 = new Triangle(tHeight, tbase);

        ((Circle)sh1).printClass();
        sh1.calculateArea();
        sh1.calculateCircumference();

        ((Rectangle)sh2).printClass();
        sh2.calculateArea();
        sh2.calculateCircumference();

        ((Triangle)sh3).printClass();
        sh3.calculateArea();
        sh3.calculateCircumference();
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61735:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" ABSTCLlab.ABSTClab
Enter circle radius: 3.5
Enter Height: 5
Enter Width: 10
Enter Triangle Base: 30
Enter Triangle Height: 50
Circle
Areas: 38.48
Circumference: 21.99
Rectangle
Area: 50.0
Perimeter: 30.0
Triangle
Area: 750.0
Perimeter: 138.309518948453

Process finished with exit code 0

 */