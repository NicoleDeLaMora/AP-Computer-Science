package Prog702p;

public class Animal {
    private String firstName;
    private String lastName;
    private String myWord;

    public Animal(String fname, String word){
        firstName = fname;
        myWord = word;
    }

    public String getName(){return firstName;}
    public String getWord(){return myWord;}
}
