    public class LP48CL {
        private final int myA;
        private final int myC;
        private final int myM;
        private int myX; // seed
    public LP48CL(int a, int c, int m, int x0){
        myA = a;
         myC = c;
         myM = m;
         myX = x0;

}
    public int nextInt(){
        myX = (myA * myX + myC)% myM;
        return myX;
}
    public String toString(){
        return "(" + myA + " " + myX + " + " + myC + ") % " + myM + " = " + this.nextInt();
    }

}
