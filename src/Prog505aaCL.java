//Nicole de la Mora // 01/03/23 // Prog 505a ArrayListReveiw

/**
 * The Book class for Prog505a
 */
public class Prog505aaCL {
    private String myName;
    private int myBooks;
    private int myPoints;

    public Prog505aaCL(String name, int books){
        myName = name;
        myBooks = books;
        myPoints = 0;
    }

    public void calc(){
        if(myBooks >=3 ){
            myPoints = myBooks*10;
        }else if(myBooks <= 6){ //30 points
            myPoints = (myBooks - 3) * 15 + 30; //45 points
        }else myPoints = (myBooks - 6) * 20 + 30 + 45;
    }

    public String getName(){return myName;}
    public int getBooks(){return myBooks;}
    public int getPoints(){return myPoints;}

    public String toString(){return myName + "\t" + myBooks + "\t" + myPoints;}

}
