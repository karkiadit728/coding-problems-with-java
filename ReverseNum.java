import java.util.Scanner;

public class ReverseNum {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // Take input from user
        int num = sc.nextInt();
        // Store for reversed number
        int reverseNum = 0;
        while (num != 0) {
            reverseNum = reverseNum * 10 + num % 10;
            num %= 10;
        }
    }
}
