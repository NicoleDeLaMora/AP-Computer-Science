//Nicole de la Mora // 10/26/22 // Prog 76a Class
public class Prog76aaCL {
    private int myNum;
    private int myTot;

    public Prog76aaCL(int theirNUM){
        myNum = theirNUM;
        myTot = 0;
    }
    public void CALC(){
        myTot = (myNum * 9) * 12345679;
    }
    public int getTOT(){return myTot;}
}
