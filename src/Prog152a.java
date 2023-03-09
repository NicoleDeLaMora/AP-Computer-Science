//Nicole de la Mora // prog152a Recurrsion

import java.util.*;
public class Prog152a {

    public static int findMultiple(int m, int start, int end){
        int answer = 0;
        if(start > end)
            return answer;
        if(start % 3 == 0){
            answer+= start;
        }
        return answer + findMultiple(m, start+= 1, end);
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Multiple: ");
        int m = input.nextInt();
        System.out.print("Starting Number: ");
        int begin = input.nextInt();
        System.out.print("Ending Number: ");
        int end = input.nextInt();

        System.out.printf("The sum of the multiples of %d, from %d to %d is %d.", m, begin, end, findMultiple(m, begin, end));
    }
}
/*
Multiple: 3
Starting Number: 3
Ending Number: 9669
The sum of the multiples of 3, from 3 to 9669 is 15586428.
 */