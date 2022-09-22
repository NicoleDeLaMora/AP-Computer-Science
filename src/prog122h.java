public class prog122h {
    public static void main(String[] args){
     double num = 1;
     System.out.println("Number\tSquare\tSquareRoot\tCubed\tCubeRoot");
     while (num <= 20){
         double square = Math.pow(num, 2);
         double sqrt = Math.sqrt(num);
         double cube = Math.pow(num, 3);
         double root = Math.cbrt(num);
         System.out.printf("%d\t\t%d\t\t%.5f\t\t%d\t\t%.5f\n",(int)num,(int)square,sqrt,(int)cube,root);
         num++;
     }
    }
    }
/*
Number	Square	SquareRoot	Cubed	CubeRoot
1		1		1.00000		1		1.00000
2		4		1.41421		8		1.25992
3		9		1.73205		27		1.44225
4		16		2.00000		64		1.58740
5		25		2.23607		125		1.70998
6		36		2.44949		216		1.81712
7		49		2.64575		343		1.91293
8		64		2.82843		512		2.00000
9		81		3.00000		729		2.08008
10		100		3.16228		1000		2.15443
11		121		3.31662		1331		2.22398
12		144		3.46410		1728		2.28943
13		169		3.60555		2197		2.35133
14		196		3.74166		2744		2.41014
15		225		3.87298		3375		2.46621
16		256		4.00000		4096		2.51984
17		289		4.12311		4913		2.57128
18		324		4.24264		5832		2.62074
19		361		4.35890		6859		2.66840
20		400		4.47214		8000		2.71442

Process finished with exit code 0

 */