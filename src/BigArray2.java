//Nicole de la Mora // 11/16/22 // BIG ARRAY2
import java.io.*;
import java.util.*;
public class BigArray2 {
    public static void main(String[] args) {
        try {  // On Replit, may need to put "../data/prog285b.dat"
            Scanner input = new Scanner(new File("data/bigarraylist.dat"));
                int numCats = input.nextInt();
                input.nextLine();
                Cat[] cats = new Cat[50];

                for(int lcv = 0; lcv<numCats; lcv++){
                    String name = input.nextLine();
                    double weight = input.nextDouble();
                    int age = input.nextInt();
                    double cost = input.nextDouble();
                    input.nextLine();
                    cats[lcv] = new Cat(name, weight, age, cost);
                }
                //1
            System.out.println("All the cats: ");
                System.out.println("Name\tWeight\tAge\tCost");
                for(int lcv = 0; lcv<numCats; lcv++){
                    System.out.println(cats[lcv].getName() + "\t" + cats[lcv].getWeight() + "\t" + cats[lcv].getAge() + "\t" + cats[lcv].getCost());
                }
                //2
            System.out.println("The cat is named: " + cats[2].getName());
                //3
            cats[numCats-1].setWeight(cats[numCats-1].getWeight()+10);
                //4
            int rascalIN=0;
            for(int lcv = 0; lcv < numCats; lcv++){
                if(cats[lcv].getName().equals("Rascal"))
                rascalIN = lcv;
            }
            for(int lcv = rascalIN; lcv < numCats - 1; lcv++)
                cats[lcv] = cats[lcv+1];
            numCats--;
                //5
            for(int lcv = numCats+1; lcv--<0;) {
                //for(int lcv = numCats; lcv<1; lcv--)
                cats[lcv] = cats[lcv-1];
            }
            cats[1] = new Cat("Angel", 3.6, 1, 25.99);
                //6
            cats[numCats] = new Cat("Gimpy", 14.3, 10, 29.99);
                //7
            System.out.println("The updated list is: ");
            System.out.println("Name\tWeight\tAge\tCost");

            for( Cat cat : cats ) //cat array holds cats objects ,, int[] holds int objects
                 if(cat != null){
                     System.out.println(cat.getName() + " " + cat.getWeight() + " " + cat.getAge() + " " + cat.getCost() + " ");
                }
                //8
            Cat temp = cats[2];
            cats[2] = new Cat("Sugar", 23.6, 7, 33.25);
            cats[numCats] = temp;
            numCats++;
                //9
            Cat temparyay = cats[1];
            cats[1] = cats[3];
            cats[3] = temparyay;
                //10
            System.out.println("The current cat names are: ");
           for(Cat cat : cats){
               if(cat != null){ System.out.print(cat.getName() + "\t");}
           }
                //12
            System.out.println("The cats being put on a diet are: ");
           for(int lcv = 0; lcv<numCats; lcv++){
               Cat cat = cats[lcv];
               if(cat.getWeight() > 15){
                   System.out.print(cat.getName() + " ");
               }
           }
           System.out.println();
                //11
            int i = 0;
            while(i < numCats){
                if(cats[i].getCost() < 26){
                    for(int j = i; j<numCats - 1; j++){
                        cats[j] = cats[j+1];
                    }
                    numCats--;
                }else i++;
            }
            System.out.println("The cats costing $26 or more actually cost: ");
            for(int lcv = 0; lcv<numCats; lcv++){
                System.out.print(cats[lcv].getCost() + " ");
            }
        System.out.println();



        } catch (IOException e) {
            System.out.println("Can't find data file!");
        }
    }

}
/*
All the cats:
Name	Weight	Age	Cost
Inky	15.69	2	35.79
Panda	14.3	6	15.03
Rascal	21.1	21	0.0
Blacky	13.99	3	26.89
Taffy	24.5	10	56.89
Toby	17.2	10	37.57
The cat is named: Rascal
The updated list is:
Name	Weight	Age	Cost
Inky 15.69 2 35.79
Angel 3.6 1 25.99
Blacky 13.99 3 26.89
Taffy 24.5 10 56.89
Toby 27.2 10 37.57
Gimpy 14.3 10 29.99
The current cat names are:
Inky	Taffy	Sugar	Angel	Toby	Blacky	The cats being put on a diet are:
Inky Taffy Sugar Toby
The cats costing $26 or more actually cost:
35.79 56.89 33.25 37.57 26.89

 */