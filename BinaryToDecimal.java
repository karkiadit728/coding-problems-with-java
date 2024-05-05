import java.util.Scanner;

public class BinaryToDecimal {
    public static int binToDec(int num) {
        int p = 0;
        int dec = 0;
        while (num != 0) {
            dec += (num % 10) * (int) (Math.pow(2, p));
            p += 1;
            num /= 10;
        }
        return dec;
    }

    public static void main(String args[]) {
        // Taking input from the user
        Scanner sc = new Scanner(System.in);
        int binNumber = sc.nextInt();
        System.out.println("Decimal Equivalent of " + binNumber + " is " + binToDec(binNumber));
    }
}
