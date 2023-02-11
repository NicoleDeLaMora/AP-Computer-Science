//Nicole de la Mora // 02/10/23 // Prog460a helper class
public class SearchAlgs {
    public static int LinearSeach(int[] array, int x){
        for(int lcv = 0; lcv < array.length; lcv++){
            if(array[lcv] == x)
                return lcv;
        }
    return -1;
    }

    public static int BinarySearch(int [] array, int x){
        int low = 0;
        int high = array.length-1;

        while(low <= high){
            int mid = low + (high-low) / 2;
            if(array[mid] == x) return mid;
            if(array[mid] < x) low = mid + 1;
            else high = mid - 1;
        }

        return -1;
    }

    //call with binarysearchrec(arry, x, 0, array.length-1);
    public static int BinarySearchRec(int[] array, int x, int low, int high){
        if(low > high)   //base case
            return -1;

        int mid = (low + high) / 2;
        if(array[mid] == x)  //
            return mid;
        if(array[mid] > x) return BinarySearchRec(array, x, low, mid-1);
        else return BinarySearchRec(array, x, mid+1, high);
    }
}
