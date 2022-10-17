//Nicole de la Mora // prog 52a CL // 10/17/22

public class cl52a {

        //Private
    //DO NOT INITIALIZE HERE
    //public allows user to change these, private doesn't
    private int length;
    private int width;
    private int area;
    private int perim;

    //constructor : special method that sets up private data
    public cl52a(int l, int w){
        length = l;
        width = w;
        perim = 0;
        area = 0;
    }
    //modifier // mutators : modifies private data
    //public = you have acsess to anywhere
    //void: you don't return anything   the "empty return" is implicit

    public void setStuff(){
        area = width * length;
        perim = 2 * width + 2 * length;
    }
    //accsessors: returns private data
    public int getArea(){return area;}
    public int getPerim(){return perim;}

}

/*
class :

 - always has privte data
 - constructors
 - medifiers (mutators)
 - accsesors
 */