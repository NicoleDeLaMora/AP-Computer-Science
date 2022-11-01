//nicole de la Mora // 11/1/22 // Prog 209a
import java.util.*;
import java.io.*;
public class prog209aFILE {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            int lcv = 0;

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
