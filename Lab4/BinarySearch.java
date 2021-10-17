package Lab4;

public class BinarySearch {
    public static void main(String[] args)
    {
        int[] list = {4, 6, 7, 10, 12, 13};

        int index = binarySearch(list, 13);
        System.out.println("13 was found at position " + index);
    }

    // Binary search
    /*
    public static int binarySearch( int array[], int key )
    {
        int low = 0;                  // low subscript
        int high = array.length - 1;  // high subscript
        int middle;                   // middle subscript

        while ( low <= high ) {
            middle = ( low + high ) / 2;

            if ( key == array[ middle ] )  // match
                return middle;
            else if ( key < array[ middle ] )
                high = middle - 1;  // search low end of array
            else
                low = middle + 1;   // search high end of array
        }

        return -1;   // searchKey not found
    }
    */
    //recursive binary search
    public static int binarySearch( int array[], int key ){
        return binarySearch(array,key,0,array.length -1);
    }
    private static int binarySearch(int[] array,int key, int min,int max){
        if(min > max){
            return -1;
        }else{
            int mid = (min + max) /2;
            if(array[mid]< key){//too small go right
                return binarySearch(array,key,mid +1,max);
            }else if(array[mid] > key){//too large go left
                return binarySearch(array,key,mid,mid-1);
            }else{
                return mid; //key found ; array[mid] == key
            }
        }
    }

}
