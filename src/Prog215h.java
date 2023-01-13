//Nicole de la Mora // 01/13/23
import java.util.*;
import java.io.*;
public class Prog215h {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));
            ArrayList <Double> all = new ArrayList<>();
            ArrayList<Double> c1 = new ArrayList<Double>();
            ArrayList<Double> c2 = new ArrayList<Double>();
            ArrayList<Double> c3 = new ArrayList<Double>();

            while(input.hasNext()){
                all.add(input.nextDouble());
            }
            for(int lcv = 0; lcv < all.size(); lcv++){
                if(lcv < 9){
                    c1.add(all.get(lcv));
                }else if(lcv > 8 && lcv < 17){
                    c2.add(all.get(lcv));
                }else c3.add(all.get(lcv));
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
101.0 17.0 2250.0 103.0 5.0 4000.0 117.0 3.0 7350.0  = 732.5555555555555
118.0 8.0 7350.0 125.0 5.0 6500.0 138.0 17.0  = 863.25
6375.0 192.0 8.0 8125.0 203.0 8.0 3250.0 218.0 5.0 5000.0 235.0 5.0 5250.0 264.0 17.0 4150.0 291.0 17.0 750.0  = 1380.6842105263158

Process finished with exit code 0
lol dont work
 */