package Prog701g;

public class Teacher extends Person{
    private int myNum;

    public Teacher(String f, String L, int student){
        super(f, L);
        myNum = student;
    }

    public int getNumStuds(){return myNum;}
}
