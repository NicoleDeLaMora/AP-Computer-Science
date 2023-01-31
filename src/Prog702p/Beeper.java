package Prog702p;
import java.io.*;
import java.util.*;
public class Beeper extends Animal{
    private String extraWord;
    private List<String> words = new ArrayList<String>();
  public Beeper(String name, String word, String xWord){
        super(name, word);
        extraWord = xWord;
    }

    public void CommonLetter(ArrayList<String> list){
      words = list;
      for(int lcv = 0; lcv < words.size(); lcv++){
        for(String x : words){
        if(x.substring(lcv, lcv+1).equals('a'))
              
       
        }
      }
          
    }


  
    public String getExtraWord(){return extraWord;}
}
