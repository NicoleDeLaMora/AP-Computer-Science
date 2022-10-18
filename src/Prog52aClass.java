//Nicole de la Mora // 10/17/
import java.util.*;
import static java.lang.System.out; //makes it so you dont have to do the System |||| DO NOT USE ON AP THINGY
public class Prog52aClass {
    //driver program
    public static void main(String[] args){
        //public : anyone can acsess this
        //void: returns nothing
        //has a string named args
        Scanner scan = new Scanner(System.in);//scan is a SCANNER OBJECT
        System.out.print("Please enter a length: ");
        int len = scan.nextInt();
        System.out.print("Please enter a width: ");
        int wid = scan.nextInt();
        out.println();  //used
        cl52a wow = new cl52a(wid, len);
        //acsesses width and length, delivers it to the cl52a

        //calls the modifier
        wow.setStuff();
        //public METHOD: CALL WITH KEYWORD

         int area = wow.getArea();
         int perim = wow.getPerim();
       //  System.out.println("Area: " + area);
        // System.out.println("Perimeter: " + perim);

        //make a new object (instance) of cl52a (Instatiate the class)




    }
}
/*
Please enter a length: 12
Please enter a width: 12

Area: 144
Perimeter: 48
 */