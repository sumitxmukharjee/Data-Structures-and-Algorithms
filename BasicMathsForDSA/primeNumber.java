package BasicMathsForDSA;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

//        if(n == 1 && n == n){
//            System.out.println("Prime Number");
//        }

        for(int i=2;i<n;i++){
            if(n%i == 0){
                System.out.println("Prime Number");
            }
            System.out.println("Not Prime Number");
        }

    }
}
