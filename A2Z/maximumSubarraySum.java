package A2Z;

import java.util.Scanner;

public class maximumSubarraySum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//        int[] a = {-1,3,-2,5,3,-5,2,2};
        int[] a = {1,2,7,-4,3,2,-10,9,1};

        int max = Integer.MIN_VALUE;
//        Brute
//        for(int i=0;i<a.length;i++){
//            for(int j=i;j<a.length;j++){
//                int sum = 0;
//                for(int k=i;k<j;k++){
//                    sum += a[k];
//                }
//
//                max = Math.max(max, sum);
//            }
//        }

//      Better
//        for(int i=0;i<a.length;i++){
//            int sum = 0;
//            for(int j=0;j<a.length;j++){
//                sum += a[j];
//            }
//
//            max = Math.max(max, sum);
//        }
//
//        System.out.println(max);
        //optimal  - kadanes algorithm
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum += a[i];

            if(sum>max){
                max = sum;
            }
            if(sum<0){
                sum = 0;
            }
        }
        System.out.println(max);
    }
}
