//Nicole de la Mora // 12/6/22 // My ArrayList Lab

public class intArrayList {
    private int[] myArray;
    private int mySize;
    private int myCapacity;
    private final int DEFULT_SIZe = 16;

    public intArrayList(){
        myArray = new int[DEFULT_SIZe];
        mySize = 0;
        myCapacity = DEFULT_SIZe;
    }
    private void doubleCapacity(){
        myCapacity *= 2;
        int[] temp = new int[myCapacity];
        for(int lcv = 0; lcv<mySize; lcv++){
            temp[lcv] = myArray[lcv];
        }
        myArray = temp;
    }
    private void halfCapacity(){
        myCapacity /= 2;
        int[] temp = new int[myCapacity];
        for(int lcv = 0; lcv<mySize; lcv++){
            temp[lcv] = myArray[lcv];
        }
        myArray = temp;
    }
    public void add(int num){
        if(mySize + 1 == myCapacity)
            doubleCapacity();
        myArray[mySize] = num;
        mySize++;
    }
    public void remove(int index){
        for(int lcv = 1; lcv<mySize; lcv++){
            myArray[lcv-1] = myArray[lcv];
        }
        mySize--;
        if(mySize <= (myCapacity * 0.25))
            halfCapacity();
    }
    public int get(int index){return myArray[index];}

    public void set(int index, int num){myArray[index] = num;}

    public int size(){return mySize;}

    public int[] toArray(){return myArray;}

    public int indexOf(int num){
        for(int lcv = 0; lcv < mySize; lcv++){
            if(myArray[lcv] == num){
                return lcv;
            }
        }
        return -1;
    }
}
