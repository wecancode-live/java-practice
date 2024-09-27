package in.balamt.practice.coding.challenges.primenumber;

import java.util.stream.IntStream;

public class PrimeNumberLoopApp {
    public static void main(String[] args) {
        int x = 10;

        for(int j = 1; j<=x;j++){
            if(isPrime(j)){
                System.out.println("Prime " + j);
            }else {
                System.out.println("Not Prime " + j);
            }
        }
    }

    private static boolean isPrime(int n){
        if(n == 0 || n == 1){
            return false;}

        for(int x = 2; x<n;x++) {
            if (n % x == 0) return false;
        }

        return true;
    }

}
