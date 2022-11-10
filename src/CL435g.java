//Nicole de la Mora // 11/10/22 // Prog 435G
public class CL435g {
    private int myScore;
    private int myRank;
    public CL435g(int score){
        myRank = 0;
        myScore = score;
    }

    public int getSCore(){return myScore;}
    public int getRank(){return myRank;}
    public void setRank(int rank){myRank = rank;}
    public String toString() {return myScore + "\t" + myRank;}
}
