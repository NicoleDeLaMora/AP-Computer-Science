package Prog701g;
//admin is a child of the parent class "Person"

public class Admin extends Person{
    private String myFav;
    //inherited myFirst and myLast from Person

    public Admin(String f, String l, String fav){
        super(f,l); // call constructor of super/parent class
        myFav = fav;
    }

    public String getFavString(){return myFav;}
}
