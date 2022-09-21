public class LoopTest {
    public static void main(String[] args){
        int lcv = 1;
        while (lcv <= 10){
            System.out.print(lcv + "  ");
            lcv++;
        }
        System.out.println();

        //THESE ARE THE EXACT SAME CODE  up and down
        //if using counter(like lcv) use FOR Loop
        //Counter = for

        //for loop does all the lcv sh-- in one line
        for (int lcv2 = 1;lcv2 <= 10; lcv2++){
            System.out.print(lcv2 + "  ");
        }
        System.out.println();
    }
}
/*
1
2
3
4
5
6
7
8
9
10

1  2  3  4  5  6  7  8  9  10

Process finished with exit code 0

 */