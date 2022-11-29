//Nicole de la Mora // 11/29/22 // Learning ArrayList
import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(); //Note the capital I
        //Arraylist<WrapperType> name = new ArrayList<WrapperType>();

        for(int lcv = 0; lcv<100;lcv++){//if using list.size() - make sure there is actually something in the list
            int rand = (int)(Math.random() * 100) + 1;
            list.add(rand);
        }
        for(int lcv = 0; lcv<list.size(); lcv+=2){ //print even numbers
            System.out.print(list.get(lcv) + " ");
        }
        System.out.println();

        if(list.contains(50)) System.out.println("Does List contain 50? " + list.contains(50)); //is there 50?
        System.out.println("Index of 50: " + list.indexOf(50)); //find index of 50

        //print out list
        for(int cur : list)
        System.out.print(cur + " ");


    }
}
