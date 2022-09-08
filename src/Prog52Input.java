import java.util.*;

public class Prog52Input {
    public static void main(String[] args) {
        //always use user input.. not hard numbers
        // three sections to programs: input, calculation, output
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the length: ");
        int length = input.nextInt();
        System.out.println();
        System.out.print("Please enter the width: ");
        int Width = input.nextInt();
        System.out.println();

        int area = length * Width;
        int perim = length*2 + Width*2;

        System.out.println("The area is: " + area);
        System.out.println("The perimeter is: " + perim);
    }


}
/*
Please enter the length: 5

Please enter the width: 10

The area is: 50
The perimeter is: 30
 */