package Prog703s;
import java.util.*;
import java.io.*;

public class Prog703s{
  public static void main(String[] args){
    try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog703s.txt"));
            ArrayList<Computer> list = new ArrayList<Computer>();
            while(input.hasNext()){
              int type = input.nextInt();
              
              if(type==1){
                //apple
                String name = input.next();
                int num = input.nextInt();
                double value = input.nextDouble();
                String color = input.next();
                Computer a = new Apple(name, num, value, color);
                list.add(a);
              }else if(type == 2){
                //window
                String name = input.next();
                int num = input.nextInt();
                double value = input.nextDouble();
                double version = input.nextDouble();
                Computer w = new Window(name, num, value, version);
                list.add(w);
              }else{
                //linux
                String name = input.next();
                int num = input.nextInt();
                double value = input.nextDouble();
                int code = input.nextInt();
                Computer l = new Linux(name, num, value, code);
                list.add(l);
              }
            }
            
            //find out how many gold/greeen (capitol g)
            int GorG = 0;
            int SevenSevenSeven = 0;
            int Fivers = 0;
            for(Computer c : list){
              if(c instanceof Apple){
                if(((Apple)c).getColor().equals("Gold") || ((Apple)c).getColor().equals("Green"))
                  GorG++;
              }
              if(c instanceof Window){
                if(((Window)c).getVersion() == 7.0){
                  SevenSevenSeven++;
                }
              }
              if(c instanceof Linux){
                if(((Linux)c).getCode() % 5 == 0 && ((Linux)c).getCode() % 10 != 0){
                  Fivers++;
                }
              }
              
              
              
            }

            
            System.out.println("There are " + GorG + " Apple computers colored Green or Gold.");
            System.out.println("There are " + SevenSevenSeven + " Window computers with version 7.0.");
            System.out.println("There are " + Fivers + " Linux computers with codes ending with 5.");
            
    } catch (IOException e) {
            System.out.println("Can't find data file!");
       }
  }
}
/*
There are 1 Apple computers colored Green or Gold.
There are 2 Window computers with version 7.0.
There are 4 Linux computers with codes ending with 5.
 */