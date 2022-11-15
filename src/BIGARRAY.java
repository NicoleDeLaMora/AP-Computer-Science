//Nicole de la Mora // 11/15/22 // BIG ARRAY
public class BIGARRAY {
    public static void main(String[] args){

        int[] array = new int[19];
        for(int lcv = 0; lcv<array.length; lcv++){
            array[lcv] = (int)(Math.random()*(91-20)+20); //populating an array
        }
        //1.
        for (int lcv = 0; lcv < array.length; lcv++){
            System.out.print(array[lcv] + " ");
        }
        System.out.println();
        //2.
        for (int temp : array){
            System.out.print(temp + " ");
        }
        System.out.println();
        //3.
        System.out.println("The middle number is: " + array[array.length/2]);
        //4.
        double averge = array[0] + array[array.length-1] + array[array.length/2];
        System.out.println("Average of the first, middle and last numbers is: " + averge/3);
        //5.
        int small = array[0];
        int large = array[0];
        for(int num : array){
            if(small>num ){
                small = num;
            }
            if(large<num) {
                large = num;
            }
        }
        System.out.println("The smallest number is: " + small);
        System.out.println("The largest number is: " + large);
        //6.
        for(int lcv = 0; lcv<array.length; lcv++){
            if(array[lcv] == small){
                array[lcv] = large;
            }else if(array[lcv] == large){
                array[lcv] = small;
            }
        }
        for(int x : array){
            System.out.print(x + " ");
        }
       System.out.println();
        //7.
        int randNum = (int)(Math.random()*10+1);
        array[array.length/2] = randNum;
        for(int x : array){
            System.out.print( x + " ");
        }
        System.out.println();
        //8.
        for(int lcv = 0; lcv<array.length; lcv++){
            array[lcv] +=10;
        }
        for(int x : array) System.out.print( x + " ");
        System.out.println();
        //9.
        int myThird = array[2];
        array[2] = 5;
        System.out.println("The number that was outset is: " + myThird);
        //10.
        for(int num : array){
            if(num >= 50 && num < 60){
                System.out.print(num + " ");
            }
        }
        System.out.println();
        //11.
        for(int lcv = 0; lcv<array.length; lcv++){
            if(array[lcv]%4 == 0){
                System.out.print(array[lcv] + " ");
            }
        }
        System.out.println();
    }

}
/*QUESTION
Print the Array from the beginning to the end     |
Print the Array from the beginning to the end using a for-each loop     |
What number is in the middle of the Array?     |
What is the average of the first, last and middle numbers?     |
Find the smallest and the largest number in the Array     |
Switch the largest with smallest number. Print the list     |
Create a new random from 1 to 10 and insert it in the middle slot. Print the numbers.     |
Add 10 to every number in the List. Print all.     |
|     Replace the 3rd element in the array with 5 and print the number that was ousted (only use one method to complete this.)
What numbers are in the 50s?     |
What numbers are multiples of 4?
*/
/*ANSWER
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=54252:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" BIGARRAY
76 40 72 89 52 29 33 76 86 53 20 24 22 71 36 51 23 78 89
76 40 72 89 52 29 33 76 86 53 20 24 22 71 36 51 23 78 89
The middle number is: 53
Average of the first, middle and last numbers is: 72.66666666666667
The smallest number is: 20
The largest number is: 89
76 40 72 20 52 29 33 76 86 53 89 24 22 71 36 51 23 78 20
76 40 72 20 52 29 33 76 86 5 89 24 22 71 36 51 23 78 20
86 50 82 30 62 39 43 86 96 15 99 34 32 81 46 61 33 88 30
The number that was outset is: 82
50
96 32 88

Process finished with exit code 0

 */