public class Prog122c {
    public static void main(String[] args){
        int lcv = 0;
        int num = 0;
        int add = 0;
        int deez = 0;
        double sq = 0;

        while(lcv < 5) {
            lcv += 1;
            num = lcv * 2;
            add = num+1;
            deez = num * 2;
            sq = Math.pow(num, 2);
            System.out.println(num +"    " + add +"    "+deez + "    " +sq);
        }
    }
}
/*
2    3    4    4.0
4    5    8    16.0
6    7    12    36.0
8    9    16    64.0
10    11    20    100.0
 */