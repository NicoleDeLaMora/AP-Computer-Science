//Nicole de la Mora // 02/10/23 // Prog460a
import java.util.*;
import java.io.*;
public class Prog460a {
    public static void main(String[] args){
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/sort.dat"));
                int[] list = new int[60];
                int count = 0;
                while(input.hasNext()){
                    list[count] = input.nextInt();
                    count++;
                }
            Arrays.sort(list);

            Scanner scan = new Scanner(System.in);
                int num = 0;
                while(num != -1){
                    System.out.print("Enter a number to search for: ");
                    num = scan.nextInt();

                    //int index = SearchAlgs.LinearSeach(list, num);

                    //int index = SearchAlgs.BinarySearch(list, num);

                    int index = SearchAlgs.BinarySearchRec(list, num, 0, list.length-1);

                    if(index == -1){
                        System.out.println("Your number does not exist in this list");
                    }else System.out.println("Your number occurs at " + (index+1));
                }




        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }
}
/*
Enter a number to search for: 110
Your number does not exist in this list
Enter a number to search for: 52
Your number occurs at 75
Enter a number to search for: 62
Your number occurs at 83
Enter a number to search for: 100
Your number occurs at 100
Enter a number to search for: 1
Your number occurs at 41
Enter a number to search for: 68
Your number does not exist in this list
Enter a number to search for: 92
Your number occurs at 93
Enter a number to search for: 101
Your number does not exist in this list
Enter a number to search for: 110
Your number does not exist in this list
Enter a number to search for: 6
Your number does not exist in this list
Enter a number to search for:
 */