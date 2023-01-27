package Prog702p;

public class Beeper extends Animal{
    private String extraWord;

    public Beeper(String name, String word, String xWord){
        super(name, word);
        extraWord = xWord;
    }

    public String getExtraWord(){return extraWord;}
}
