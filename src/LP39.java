//Nicole de la Mora // 11/22/22 // LP 3-9
import java.util.*;
public class LP39 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your Birthdate: ");

        System.out.print("\nYear: ");
        int birthy = scan.nextInt();
        System.out.print("Month: ");
        int birthm = scan.nextInt();
        System.out.print("Day: ");
        int birthd = scan.nextInt();

        System.out.println("Enter todays date: ");

        System.out.print("Year: ");
        int tdayy = scan.nextInt();
        System.out.print("Month: ");
        int tdaym = scan.nextInt();
        System.out.print("Day: ");
        int tdayd = scan.nextInt();

        LP39Class wow = new LP39Class(birthy, birthm, birthd, tdayy, tdaym, tdayd);
        wow.calc();

        System.out.println("You have been alive for: " + wow.areyouALIVE() + " days");
        System.out.println("You have been asleep for: " + wow.areyouSLEEPING() + " hours");




    }
}
