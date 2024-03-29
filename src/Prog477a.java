//Nicole de la Mora // 02/15/23
import java.util.*;
import java.io.*;

public class Prog477a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog477a.dat"));
            int[][] list = new int[5][3];

            while(input.hasNext()){
                if(input.nextInt() == 1) {
                    int num = input.nextInt();
                    if (num == 1)
                        list[0][0]++;
                    else if (num == 2)
                        list[1][0]++;
                    else if (num == 3)
                        list[2][0]++;
                    else if (num == 4)
                        list[3][0]++;
                    else if (num == 5)
                        list[4][0]++;
                }
                else {
                    int num = input.nextInt();
                    if (num == 1)
                        list[0][1]++;
                    else if (num == 2)
                        list[1][1]++;
                    else if (num == 3)
                        list[2][1]++;
                    else if (num == 4)
                        list[3][1]++;
                    else if (num == 5)
                        list[4][1]++;

                }

            }


            for(int row = 0; row < list.length; row++){
                for(int col = 0; col < list[0].length; col++){
                    if(col == 2)
                        list[row][2] = list[row][1] + list[row][0];

                }
            }
                int maleTOTAL = 0;
                int femaleTOTAL = 0;
                int totalTOTAL = 0;
                for(int r = 0; r < list.length; r++){
                    for(int c = 0; c < list[0].length; c++){
                        if(c==0){
                            maleTOTAL+= list[r][c];
                        }else if(c==1){
                            femaleTOTAL+= list[r][c];
                        }else totalTOTAL+= list[r][c];
                    }
                }
            System.out.print("Grade\tMale\tFemale\tTotal\n");
            System.out.println("A\t\t" + list[0][0] + "\t\t" + list[0][1] + "\t\t" + list[0][2]);
            System.out.println("B\t\t" + list[1][0] + "\t\t" + list[1][1] + "\t\t" + list[1][2]);
            System.out.println("C\t\t" + list[2][0] + "\t\t" + list[2][1] + "\t\t" + list[2][2]);
            System.out.println("D\t\t" + list[3][0] + "\t\t" + list[3][1] + "\t\t" + list[3][2]);
            System.out.println("F\t\t" + list[4][0] + "\t\t" + list[4][1] + "\t\t" + list[4][2]);
            System.out.println("--------------------------------------------------------------------");
            System.out.println("Totals:\t" + maleTOTAL + "\t\t" + femaleTOTAL + "\t\t" + totalTOTAL);
//int row = grade
            //int col = gender (?)
            //list[row][col] ++
            //list[row][2] == list[row][0] + list[row][1];







        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=61098:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" Prog477a
Grade	Male	Female	Total
A		2		4		6
B		4		4		8
C		4		7		11
D		2		3		5
F		3		0		3
--------------------------------------------------------------------
Totals:	15		18		33

Process finished with exit code 0

 */