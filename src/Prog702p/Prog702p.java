package Prog702p;

import Prog701g.Person;
import Prog701g.Student;

import java.io.*;
import java.util.*;

public class Prog702p {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<Animal> list = new ArrayList<Animal>();

            int num = input.nextInt();

            int length = 0;
            double furSum = 0;
            int totStep = 0;

            int totH = 0;
            int totW = 0;
            int totB = 0;

            while(num!=99){
                String name = input.next();
                String word = input.next();
                if(num == 1){
                    double fur = input.nextDouble();
                    Animal p = new Hicca(name, word, fur);
                    System.out.println("Hicca's name is: " + name + " " + word);
                    System.out.println("Its fur is worth: $" + fur);
                    furSum += fur;
                    totH++;

                }else if(num == 2){
                    int step = input.nextInt();
                    Animal p = new Walleye(name, word, step);
                    System.out.println("Wallie's name is: " + name + " " + word);
                    System.out.println("Wallie has taken: " + step + " steps");
                    totStep += step;
                    totW++;

                }else if(num == 3){
                    String exw = input.nextLine();
                    Animal p = new Beeper(name, word, exw);
                    System.out.println("Beeper's name is: " + name + " " + word);
                    System.out.println("Beepers word is: " + exw);
                    length += exw.length();
                    totB++;
                }

                num = input.nextInt();
            }

            double wordSize = (double)length / totB;
            double StepAve = (double)totStep / totW;
            double Furave = (double)furSum / totH;

            System.out.println("The average value of the Hicca fur is: " + Furave);
            System.out.println("The average number of steps taken by the Wallies is:  " + StepAve);
            System.out.println("The average size of the Beepers words is:  " + wordSize);

          




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
