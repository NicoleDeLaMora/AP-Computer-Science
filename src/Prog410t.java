//nicole de la Mora // 12/5/22 // Prog410t
import java.io.File;
import java.io.IOException;
import java.util.*;
public class Prog410t {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/survey.dat"));
            ArrayList<Integer> id = new ArrayList<Integer>();
            ArrayList<Integer> sal = new ArrayList<Integer>();
            ArrayList<Integer> members = new ArrayList<Integer>();


               for(int lcv = 0; lcv < 26; lcv++){
                   while (input.hasNext()){
                   id.add(input.nextInt());
                   sal.add(input.nextInt());
                   members.add(input.nextInt());
               }
            }
               System.out.println("id\t\tincome\t\tmembers");
            for(int lcv = 0; lcv<id.size(); lcv++){
                System.out.printf("\n%d\t\t\t%d\t%d", id.get(lcv), sal.get(lcv), members.get(lcv));
            }
            double income = 0;
            for(int x : sal){
                income += x;
            }
            income /= sal.size();
            System.out.println("Households with income exceeding the income of " + income + ": ");
            /*for(int lcv = 0; lcv<sal.size(); lcv++){
                if(sal.get(lcv) > income){

                }
            }
*/
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
