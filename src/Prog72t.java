import java.util.*;
public class Prog72t {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("What is the first time?");
        int time1 = scan.nextInt();
        System.out.println("What is the second time?");
        int time2 = scan.nextInt();

        if (time1 > time2){
            time2 += 2400;
        }

        int timeDIF = time1 - time2;

        if (time1 < time2){
            timeDIF = -timeDIF;
        }

        int hours =(int) timeDIF / 100;
        int number = hours * 100;
        int minutes = (int) timeDIF - number;
        System.out.println(hours + " hours and " + minutes + " minutes");
    }
}
/*
What is the first time?
900
What is the second time?
1730
8 hours and 30 minutes
 */
