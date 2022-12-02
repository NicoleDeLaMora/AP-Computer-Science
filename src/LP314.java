//Nicole de la Mora // 12/2/22 // LP3-14
import java.util.*;
public class LP314 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Election Results for New York: ");
        System.out.print("Awbrey: ");
        int ANY = scan.nextInt();
        System.out.print("Martinez: ");
        int MNY = scan.nextInt();

        System.out.println("\nElection Results for New Jersey: ");
        System.out.print("Awbrey: ");
        int ANJ = scan.nextInt();
        System.out.print("Martinez: ");
        int MNJ = scan.nextInt();

        System.out.println("\nElection Results for Conneticut: ");
        System.out.print("Awbrey: ");
        int AC = scan.nextInt();
        System.out.print("Martinez: ");
        int MC = scan.nextInt();

        int aTOT = ANY + ANJ + AC;
        int mTOT = MNY + MNJ + MC;
        int totVOTE = ANY + MNY + ANJ + MNJ + AC + MC;
        double mPERCEN = ((double)aTOT / totVOTE) * 100;
        double aPERCEN = ((double)mTOT / totVOTE) * 100;

        System.out.println("Canidate\t\tVotes  Percentage");
        System.out.printf("Awbery\t\t\t%d\t%.2f",aTOT, mPERCEN);
        System.out.printf("\nMartinez\t\t%d\t%.2f",mTOT, aPERCEN);
        System.out.println("\nTOTAL VOTES: " + totVOTE);
    }
}
