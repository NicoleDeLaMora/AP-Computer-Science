import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Prog214bArray {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog285b.dat"));
                    CL213f[] list = new CL213f[1000];
                    int cnt = 0;

                    while (input.hasNext()){

                        int badge = input.nextInt();
                        double ytd = input.nextDouble();
                        double bpay = input.nextDouble();
                        double shitCode = input.nextDouble();
                        double hrWorked = input.nextDouble();

                      // CL213f yikes = new CL213f(badge, ytd, bpay, shitCode, hrWorked);
                       // list[cnt] = yikes;
                    }
        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
