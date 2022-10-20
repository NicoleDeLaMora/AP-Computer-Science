//Nicole de la Mora // 10//20//22 //54bClass(i miss named it)

public class prog54aClass {
     //private
     private int a;
     private int b;
     private int c;
     private int d;
     private int tot;
     private int ave;

     //constructor; set up private data
     public prog54aClass(int a1, int b1, int c1, int d1){
         a = a1;
         b = b1;
         c = c1;
         d = d1;
         tot = 0;
         ave = 0;
     }
     //mutator; modifies private data
     public void calculation(){
         tot = a+b+c+d;
         ave = tot/4;
     }
     //accsesors: return private data
    public int getTOT() {return tot;}
    public int getAve() {return ave;}
}


