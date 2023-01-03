/*


 //Nicole de la Mora // 01/03/23 // Prog505a
import java.util.*;
import java.io.*;
public class Prog505aa {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog505a.dat"));

            List<Prog505aa> list = new ArrayList<Prog505aa>();

            while(input.hasNext()) {
                String fname = input.next();
                String lname = input.next();
                int books = input.nextInt();
                Prog505aaCL wowser = new Prog505aaCL(fname + " " + lname, books);
            }


            for(int lcv = 0; lcv < list.size(); lcv++){
                Prog505aaCL cur = list.get(lcv);
                cur.calc();
            }

            for(Prog505aaCL x : list)
                System.out.println(x);

            double total = 0;
            for(Prog505aaCL b : list){
                total += b.getpoints();
            }
            double average = total / list.size();

            int bigPoints = list.get(0).getPoints();
            String bigName = list.get(0).getName();
            for(int lcv = 0; lcv < list.size(); lcv++){
                Prog505aaCL book = list.get(lcv);
                if(book.getPoints() > bigPoints){
                    bigPoints = book.getPoints();
                    bigName = book.getName();
                }
            }
            System.out.println("\nAverage Points: " + average);
            System.out.println("The winner is: " + bigName);



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}

 */