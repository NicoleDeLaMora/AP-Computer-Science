//Nicole de la Mora // 9/20/22 // Program 122D(eez nuts)
public class Prog122deez {
    public static void main(String[] args) {
        System.out.println("x               y");
        int lcv = 0;
        int x = -12;
        while ( lcv < 28 ){

            double y = Math.pow(x, 6) - (3*Math.pow(x,5)) - (93 * Math.pow(x,4)) + (87 * Math.pow(x, 3)) + (1596 * Math.pow(x,2)) - (1380 * x) - 2800;

            System.out.println(x + "       " + y);
            x+=1;
            lcv+=1;
        }
    }
}
/*
x               y
-12       1897280.0
-11       982800.0
-10       453600.0
-9       173888.0
-8       45360.0
-7       0.0
-6       -6400.0
-5       0.0
-4       6048.0
-3       7280.0
-2       4320.0
-1       0.0
0       -2800.0
1       -2592.0
2       0.0
3       2240.0
4       0.0
5       -10800.0
6       -32032.0
7       -60480.0
8       -84240.0
9       -78400.0
10       0.0
11       217728.0
12       671840.0
13       1496880.0
14       2872800.0
15       5033600.0

Process finished with exit code 0

 */
