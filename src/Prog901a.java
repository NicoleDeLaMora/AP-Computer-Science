import java.io.*;
import java.util.*;

public class Prog901a {
    public static void printFile(Scanner input){
        String str = input.next();
        System.out.println(str);
        String back = reverseString(str);
        System.out.println("Backwards:");
        System.out.print(back);

    }

    public static String reverseString(String s){

    }

    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            printFile(input);
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
