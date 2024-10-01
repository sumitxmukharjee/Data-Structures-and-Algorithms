package BasicMathsForDSA;

public class extractingDigits {
    public static void main(String[] args) {
        int n = 7789;

        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit+" ");
            n = n/10;
            System.out.print(" "+n+" ");
        }
        System.out.println();
    }
}
