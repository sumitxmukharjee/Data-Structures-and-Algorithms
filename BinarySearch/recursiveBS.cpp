package BinarySearch;

public class recursiveBS {
    public static int bs(int[] arr, int start, int end, int target){
        if(start>end){
            return -1;
        }
        int mid = start + (end -start)/2;
        if(target == arr[mid]){
            return mid;
        }else if(target>arr[mid]){
            return bs(arr, mid + 1, end, target);
        }

        return bs(arr, start, end -1, target);
    }
    public static int search(int[] arr, int target) {
        return bs(arr, 0, arr.length-1, target);
    }

    public static void main(String[] args) {
        int[] arr = {3,4,6,7,9,12,16,17};

        System.out.println(search(arr, 12));
    }
}
