//Nicole de la Mora // 11/1/22 // Prog 213e
import java.util.*;
import java.io.*;
public class Prog213e {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));


        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
