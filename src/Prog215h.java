//Nicole de la Mora // 01/13/23
import java.util.*;
import java.io.*;
public class Prog215h {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog215h.txt"));
            ArrayList <Double> all = new ArrayList<>();
            ArrayList<Double> c1 = new ArrayList<Double>();
            ArrayList<Double> c2 = new ArrayList<Double>();
            ArrayList<Double> c3 = new ArrayList<Double>();

            while(input.hasNext()){
                all.add(input.nextDouble());
            }
            for(int lcv = 0; lcv < all.size(); lcv++){
                if(lcv <= 7){
                    c1.add(all.get(lcv));
                }else if (lcv > 7 && lcv < 16){
                    c2.add(all.get(lcv));
                }else if (lcv > 15 && lcv < 24){
                    c3.add(all.get(lcv));
                }
            }

            CL215h qow = new CL215h(c1);
            CL215h wow = new CL215h(c2);
            CL215h eow = new CL215h(c3);

            qow.findAve();
            qow.WriteIt();
            wow.findAve();
            wow.WriteIt();
            eow.findAve();
            eow.WriteIt();

        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
ITWORKS...just need to round yayyy
 */

















