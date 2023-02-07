package Prog875s;

import java.io.*;
import java.util.*;

public class Prog875s {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner in1 = new Scanner(new File("data/h1-0homosapiens.fna"));
            Scanner in2 = new Scanner(new File("data/h1-0pantroglodytes.fna"));
            Scanner in3 = new Scanner(new File("data/h1-0musmusculus.fna"));

            //primary assembly
            String humangene1 = in1.nextLine();
            String dna1 = "";
            String line = in1.nextLine();

            while(line.charAt(0) != '>'){
                dna1 += line;
                line = in1.nextLine();
            }

            //alternate assembly
            String humangene2 = line;
            String dna2 = "";
            line = in1.nextLine();

            while(in1.hasNext()){
                dna2 += line;
                line = in1.nextLine();
            }

            //chimp assembly
            String chimpgene = in2.nextLine();
            String dnaChip = "";
            line = in2.nextLine();

            while(in2.hasNext()){
                dnaChip = line;
                line = in2.nextLine();
            }

            //mouse assembly
            String mousegene = in3.nextLine();
            String dnaMouse = "";
            line = in3.nextLine();

            while(in3.hasNext()){
                dnaMouse = line;
                line = in3.nextLine();
            }


            Gene hprimary = new Gene(humangene1, dna1);
            Gene halternate = new Gene(humangene2, dna2);
            Gene cprimary = new Gene(chimpgene, dnaChip);
            Gene mprimary = new Gene(mousegene, dnaMouse);

            int mismatchPenalty = 3;
            int gapPenalty = 2;

            //Align human genes
            System.out.println("Human primary/human alternate");
            int hhp = hprimary.align(halternate, mismatchPenalty, gapPenalty);

            //align human genes with chimps's
            System.out.println("\n Human Primary/Chimp");
            int hcp = hprimary.align(cprimary, mismatchPenalty, gapPenalty);
            System.out.println("Human alternate/Chimp");
            int hca = halternate.align(cprimary, mismatchPenalty, gapPenalty);

            //align human genes with house's
            System.out.println("\n Human Primary/Mouse");
            int mcp = hprimary.align(mprimary, mismatchPenalty, gapPenalty);
            System.out.println("Human alternate/Mouse");
            int hma = halternate.align(mprimary, mismatchPenalty, gapPenalty);

            //report closest match
            String[] pairings = {"Human Primary/Chimp", "Human alternate/Chimp","Human Primary/Mouse","Human alternate/Mouse" };
            int[] scores = {hcp, hca, mcp, hma};

            int min = 0;
            for(int lcv = 0; lcv < scores.length; lcv++){
                if(scores[lcv] < scores[min]) min = lcv;
            }
            System.out.println("The best pairing is: " + pairings[min] + " with a scores of " + scores[min]);


        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
