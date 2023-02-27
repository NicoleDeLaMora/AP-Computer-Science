
//Nicole de la Mora // 901a
import java.io.*;
import java.util.*;
public class Prog901a {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog512h.dat"));
            String poem = input.next();
            System.out.println("Original Script: \n " + poem);

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
