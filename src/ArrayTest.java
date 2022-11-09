//Nicole de la Mora // 11/8/22 //
public class ArrayTest {
    public static void main(String[] args){
        int[] nums = new int[100];  //how you make new array
        for(int lcv = 0; lcv < 100; lcv++){
            nums[lcv] = lcv+1; // adding one bc it statrs at 0 yk, thats also why we dont do <=
        }
        for (int lcv = 0; lcv<100; lcv++){
            System.out.print(nums[lcv] + " ");

        }
        System.out.println();

        char[] hello = "Hello, World!".toCharArray();
        for (char x : hello){       //for evry charecter x in array
            System.out.print(x);    //for every charecter in array X, pull the charecter // called for each loop
        }                           //bacically grabs the char, and sends it as a string
        System.out.println();


        String[] words = {"Hello", "world", "cool", "coolbeans", "etc"};
        //for (String temp : words){do stuff}
        for (int lcv=0; lcv<words.length; lcv++){
            System.out.println(words[lcv]); //array.length is similar to str.length()
        }
    }
}
/*dfgdfg
an int is 32 bits, when making a new aray, you make the size of data type *
if 100 spaces, it uses 400 bits of ram
 */