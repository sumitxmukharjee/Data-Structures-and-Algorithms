package LinearSearch;

public class linearSearchAlgo {
    public static void main(String[] args) {
        int[] arr = {18,12,19,14,77,50};
        int target = 14;

        System.out.println(linearSearch(arr,target));
        // find weather 14 exist in the array or not
    }
    // search in the array : return the index if item found
    // otherwise if item not found return -1

    static int linearSearch(int[] arr, int target){
        if(arr.length == 0){
            return -1;
        }

        for(int i=0;i<arr.length;i++){
            // check for element at every index if it is equal to target
            int element = arr[i];
            if(element == target){
                return i;
            }
        }
        return -1;
    }
}
