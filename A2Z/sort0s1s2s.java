package A2Z;

import java.util.Arrays;

public class sort0s1s2s {
    public static void main(String[] args) {
        int[] arr = {0,1,2,0,1,2,1,2,0,0,0,1};

        int n = arr.length;

//        Better Approach
//        Take three variables and keep count of 1s 2s and 0s respectively
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

//        Keep counts

        for(int i=0;i<n;i++){
            if(arr[i] == 0) count0++;
            if(arr[i] == 1) count1++;
            if(arr[i] == 2) count2++;
        }

//        System.out.println(count0);
//        System.out.println(count1);
//        System.out.println(count2);

        //fill the  arrays

        for(int i=0;i<count0;i++){
            arr[i] = 0;
        }
        for(int i=count0;i<count0+count1;i++){
            arr[i] = 1;
        }
        for(int i=count0+count1;i<n;i++){
            arr[i] = 2;
        }

        System.out.println(Arrays.toString(arr));
    }
}
