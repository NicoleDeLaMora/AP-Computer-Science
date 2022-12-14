//Nicole de la Mora // 12/5/22 // Prog213v
import java.io.*;
import java.util.*;
public class Prog213v {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog213v.dat"));
            ArrayList<Transaction> list = new ArrayList<Transaction>();

            double balance = input.nextDouble();
            Bank wow = new Bank(balance);

            String code = input.next();
            while (!(code.equals("E"))){
                double amount = input.nextDouble();
                Transaction fred = new Transaction(code, amount);
                list.add(fred);
                code = input.next();
            }

            for(int lcv = 0; lcv<list.size(); lcv++)
                wow.calc(list.get(lcv));

            System.out.println("The final balance is: $" + wow.getAmount());

        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
//The final balance is: $219.15
//kjdshkjgf