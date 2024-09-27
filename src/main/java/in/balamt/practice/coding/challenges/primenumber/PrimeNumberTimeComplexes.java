package in.balamt.practice.coding.challenges.primenumber;

public class PrimeNumberTimeComplexes {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        } else if (n <= 3) {
            return true;
        } else if (n % 2 == 0 || n % 3 == 0) {
            return false;
        } else {
            int sqrtN = (int) Math.sqrt(n);
            for (int i = 5; i <= sqrtN / 2; i += 6) {
                if (n % i == 0 || n % (i + 2) == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int num = 17;
        System.out.println("Is " + num + " prime? " + isPrime(num)); // Output: true

        num = 20;
        System.out.println("Is " + num + " prime? " + isPrime(num)); // Output: false
    }

}
