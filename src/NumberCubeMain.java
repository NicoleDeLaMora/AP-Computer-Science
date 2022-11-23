//Nicole de la Mora // 11/21/22 // Number Cube AP example
public class NumberCubeMain {
    public static int[] getCubeTosses(NumberCube cube, int numTosses){
        //Static means ready at compile time // *we dont have to make an object to use the method/variable
        //always available no matter what
        int[] tosses = new int[numTosses];
        for(int lcv = 0; lcv<numTosses; lcv++)
            tosses[lcv] = cube.toss();
        return tosses;
    }

    public static int getLongestRun(int[] values){
        int max = 0;
        int maxIndex = -1;
        int current = 0;
        for(int lcv = 0; lcv<values.length-1; lcv++){
            if(values[lcv] == values[lcv++]){
                current ++;
            }else{
                if(current > max){
                    max = current;
                    maxIndex = lcv - current;
                 }
                current = 0;
            }
        }
        if(current > max){
            max = current;
            maxIndex = values.length - current;
        }
        return maxIndex;
    }

    public static void main(String[] args){
        //see it anywhere
        //can be called w/o object
        //doesnt return
        //main = name
        //String[] args   dontr really matter - - dont stress ab it

        NumberCube x = new NumberCube();
        int[] y = getCubeTosses(x, 18);
        for(int temp : y){
            System.out.print(temp + " ");
        }
        System.out.println("\nLongest run: " + getLongestRun(y));
    }



}
//if using static, everything else needs to be staticunless an object for it