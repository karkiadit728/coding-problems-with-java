import java.util.Scanner;

public class CheckPrime {
    public static boolean isFactor(int num, int divisor) {
        return num % divisor == 0;
    }

    public static boolean isPrime(int num) {
        // assuming 1 as prime
        if (num == 1) {
            return true;
        }
        // Check if, there are any factors other than the number itself
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (isFactor(num, i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String args[]) {
        // Take input from the user
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        // Assuming that all numbers are positive
        System.out.println("Your number is prime: " + isPrime(num));

    }
}
