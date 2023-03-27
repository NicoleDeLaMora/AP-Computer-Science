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
                    list.add(p);
                    System.out.println("Hicca's name is: " + name + " " + word);
                    System.out.println("Its fur is worth: $" + fur);
                    furSum += fur;
                    totH++;

                }else if(num == 2){
                    int step = input.nextInt();
                    Animal p = new Walleye(name, word, step);
                    list.add(p);
                    System.out.println("Wallie's name is: " + name + " " + word);
                    System.out.println("Wallie has taken: " + step + " steps");
                    totStep += step;
                    totW++;

                }else if(num == 3){
                    String exw = input.nextLine();
                    Animal p = new Beeper(name, word, exw);
                    list.add(p);
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

            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            int f = 0;
            int g = 0;
            int h = 0;
            int i = 0;
            int j = 0;
            int k = 0;
            int l = 0;
            int m = 0;
            int n = 0;
            int o = 0;
            int p = 0;
            int q = 0;
            int r = 0;
            int s = 0;
            int t = 0;
            int u = 0;
            int v = 0;
            int w = 0;
            int x = 0;
            int y = 0;
            int z = 0;

            for(Animal ah : list){
                if(ah instanceof Beeper){
                    for(int si = 0; si < ((Beeper)ah).getExtraWord().length(); si++){
                        if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("a"))
                            a++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("b"))
                            b++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("c"))
                            c++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("d"))
                            d++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("e"))
                            e++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("f"))
                            f++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("g"))
                            g++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("h"))
                            h++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("i"))
                            i++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("j"))
                            j++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("k"))
                            k++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("l"))
                            l++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("m"))
                            m++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("n"))
                            n++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("o"))
                            o++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("p"))
                            p++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("q"))
                            q++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("r"))
                            r++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("s"))
                            s++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("t"))
                            t++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("u"))
                            u++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("v"))
                            v++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("w"))
                            w++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("x"))
                            x++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("y"))
                            y++;
                        else if(((Beeper)ah).getExtraWord().substring(s, s+1).equals("z"))
                            z++;
                    }
                    int max = 0;
                    for(int ab = 0; ab < 26; ab++){

                    }
                }
            }



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
