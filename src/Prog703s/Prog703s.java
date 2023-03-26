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
                int version = input.nextInt();
                Computer w = new Apple(name, num, value, version);
                list.add(w);
              }else{
                //linux
                String name = input.next();
                int num = input.nextInt();
                double value = input.nextDouble();
                double code = input.nextDouble();
                Computer l = new Apple(name, num, value, code);
                list.add(l);
              }
            }



      
            
    } catch (IOException e) {
            System.out.println("Can't find data file!");
       }
  }
}