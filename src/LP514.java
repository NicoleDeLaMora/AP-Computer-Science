public class LP514 {
    public static void main(String[] args){


        System.out.printf("Dice 1 \t Dice 2 \t Total");
        System.out.println();
        int lcv = 0;

        while ( lcv < 6){
            int a =(int) ( Math.random() * (6 - 1)) +1;
            int b = (int) (Math.random() * (6-1)) + 1;
            System.out.printf("\t%d\t\t%d\t\t\t%d", a, b, a+b);
            System.out.println();
            lcv++;
        }
    }
}
//int ran =(int)( Math.random() *(20-1)) + 1;
/*
Dice 1 	 Dice 2 	 Total
	4		1			5
	4		4			8
	5		3			8
	1		5			6
	5		1			6
	2		2			4

 */