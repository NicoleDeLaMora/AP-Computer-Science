//Nicole de la Mora // 11/10/22 // Prog 435G
public class CL435g {
    private int myScore;
    private int myRank;

    public CL435g(int score){
        myScore = score;
        myRank = 0;
    }

    public int getSCore(){return myScore;}
    public int getRank(){return myRank;}
    public void setRank(int rank){myRank = rank;}
    public String toString() {return myScore + "\t\t" + myRank;}
}
