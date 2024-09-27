package in.balamt.practice.coding.challenges.primenumber;

import java.util.stream.IntStream;

public class PrimeNumberStreamsApp {
    public static void main(String[] args) {
        int x = 10;

        for(int j = 1; j<=x;j++){
            if(isPrimeStream(j)){
                System.out.println("Prime " + j);
            }else {
                System.out.println("Not Prime " + j);
            }
        }
    }
    private static boolean isPrimeStream(int x){
        if(x <= 1){
            return false;}

        if(x%2 == 0 || x%3 == 0){
            return false;}

        return IntStream.rangeClosed(2, (int) Math.sqrt(x))
                .noneMatch(i -> x%i==0);

    }
}
