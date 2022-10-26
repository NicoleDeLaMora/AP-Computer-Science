public class test3 {
    public static void main(String[] args){
        String text = "BeauTiful beach".toLowerCase();
        for (int lcv = text.length(); lcv--> 0;){
            //start at length, lcv -1, then check if bigger than 0

            String chr = text.substring(lcv, lcv+1);

            if (chr.equals("a") ||chr.equals("e")||chr.equals("i")||chr.equals("o")||chr.equals("u")){
                System.out.print(chr);
            }else System.out.print(" ");
            System.out.println();
        }
    }
}
//int x = 5;
// string ret = " " + x;