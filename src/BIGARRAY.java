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
        //end of day 1
        //12.
        boolean sixty = false;
        for(int temp : array){
            if(temp == 60)
                sixty = true;
        }
        System.out.println("Is 60 in the list? " + sixty);
        //13. [is it a palendrom]
        boolean same = true;
        for(int lcv = 0; lcv<array.length; lcv++){
            if(array[lcv] != array[array.length-1-lcv]){
                same = false;
            }
        }
        System.out.println("Is the array palendromic? " + same);
        //14.
        double ave = 0;
        for(int x : array) ave += x;
        ave /= array.length;
        int count = 0;
        for(int x : array)
            if(x > ave) count++;

        System.out.printf("There are %d numbers greater than the average\n", count);
        //15.
        int even = 0;
        for(int num : array)
            if(num%2 == 0){
                even++;
            }
        System.out.printf("There are %d even numbers", even);
        //16.
        int[] array2 = new int[array.length];
        for(int lcv = 0; lcv<array.length; lcv++){
            array2[lcv] = array[array.length - 1 - lcv];
        }
        for(int n : array2) System.out.print(n + " ");
        System.out.println();
        //17.
        int[] shift = circulardShiftRight(array);
        for(int num : shift)
            System.out.print(num + " ");
        System.out.println();
        //18.
        int sum = 0;
        for(int num : array){
            int digitsSUm = 0;
            int temp = num;
            while(temp>0){
                int n = temp%10;
                temp /= 10;
                digitsSUm+=n;
            }
            sum += digitsSUm;
        }
        System.out.print("The sum of all digits of all elecments equals " + sum);
    }
    public static int[] circulardShiftRight(int[] arr){
    int temp = arr[arr.length - 1];
    int[] shifted = new int[arr.length];//deep copy
    for(int lcv = 0; lcv<arr.length; lcv++){
        shifted[lcv] = arr[lcv];
    }
    for(int lcv = 0; lcv < shifted.length - 1; lcv++){
        shifted[lcv+1] = arr[lcv];
    }
    shifted[0] = temp;
    return shifted;
    }
//if you said shifted = arr, it was a shell it was more of a point at array,
    //deep copy actually copies entire array
}

/*
C:\Users\delamora.n\.jdks\openjdk-18.0.2.1\bin\java.exe "-javaagent:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\lib\idea_rt.jar=62844:C:\Program Files (x86)\JetBrains\IntelliJ IDEA Community Edition 2021.3.1\bin" -Dfile.encoding=UTF-8 -classpath "C:\Users\delamora.n\Desktop\AP Computer Science\out\production\AP Computer Science" BIGARRAY
79 56 36 64 62 57 48 53 37 43 31 32 70 58 75 85 72 25 29
79 56 36 64 62 57 48 53 37 43 31 32 70 58 75 85 72 25 29
The middle number is: 43
Average of the first, middle and last numbers is: 50.333333333333336
The smallest number is: 25
The largest number is: 85
79 56 36 64 62 57 48 53 37 43 31 32 70 58 75 25 72 85 29
79 56 36 64 62 57 48 53 37 10 31 32 70 58 75 25 72 85 29
89 66 46 74 72 67 58 63 47 20 41 42 80 68 85 35 82 95 39
The number that was outset is: 46
58
72 20 80 68
Is 60 in the list? false
Is the array palendromic? false
There are 11 numbers greater than the average
There are 9 even numbers39 95 82 35 85 68 80 42 41 20 47 63 58 67 72 74 5 66 89
39 89 66 5 74 72 67 58 63 47 20 41 42 80 68 85 35 82 95
The sum of all digits of all elecments equals192
Process finished with exit code 0
 */











/*
Is there a 60 in the list?   |
Check to see if all of the elements from front to back are in the same order from back to front   |
How many numbers are greater than the average?   |
How many of the numbers are even?   |
Copy all of the elements of the array into a new array but in reverse order   |
Write a program to shift every element of an array circularly right. E.g.-INPUT : 1 2 3 4 5 OUTPUT : 5 1 2 3 4
Find the sum of all of the digits of all of the elements

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