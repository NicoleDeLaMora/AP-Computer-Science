package Prog701g;
import java.io.*;
import java.util.*;



public class Prog701g {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/prog701g.dat"));
            List<Person> list = new ArrayList<Person>();

            int num = input.nextInt();
            while(num != 99){
                String f = input.next();
                String l = input.next();
                if(num == 1){
                    double g = input.nextDouble();
                    Person p = new Student(f, l, g);
                    list.add(p);
                }else if(num == 2){
                   int n = input.nextInt();
                   Person p = new Teacher(f, l, n);
                   list.add(p);
                }else if(num==3){
                    String fav = input.next();
                    Person p = new Admin(f, l, fav);
                    list.add(p);
                }
                num = input.nextInt();
            }

            double tot = 0;
            int cnt = 0;
            int totstu = 0;
            String large = "";
            String small = "askjhdflkjhsagdohagrheoihgsgrowiehwebothhavedreamstomaketrue.ourfuturesallplaned.itstimetogetserious.timetogetseriouswith-seriousldskflksjdftakeoutjourney.serious-yourtzalkingtoafuruteatouney";

            for(Person x : list){
                if(x instanceof Student){
                    tot+= ((Student)x).getGPA();
                    cnt++;
                }
                if(x instanceof  Teacher){
                    totstu+= ((Teacher)x).getNumStuds();
                }
                if(x instanceof Admin){
                    String xstring = ((Admin)x).getFavString();

                    if(xstring.length() < small.length()){
                        small = xstring;
                    }
                    if(xstring.length() > large.length())
                        large = xstring;
                }
            }

            System.out.println("Average Student GPA: " + String.format("%.2f",(tot/cnt)));
            System.out.println("Total number of students taught by teachers: " + totstu);
            System.out.println("Smallest Favorite Admin Word: " + small);
            System.out.println("Largest Favorite Admin Word: " + large);

        } catch (
                IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
/*
Average Student GPA: 3.06
Total number of students taught by teachers: 316
Smallest Favorite Admin Word: done
Largest Favorite Admin Word: coolbeans

Process finished with exit code 0
 */