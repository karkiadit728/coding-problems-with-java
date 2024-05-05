import java.util.Scanner;

public class ButterflyPattern {
    public static void constructPattern(int leftBound, int rightBound, int jEnd) {
        for (int j = 0; j < jEnd; j++) {
            // Wings of butterfly
            if (j <= leftBound || j >= rightBound) {
                System.out.print("*");
                // Empty spaces
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void main(String args[]) {
        // Given an n, print butterfly pattern
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < 2 * n; i++) {
            // Upper part of butterfly
            if (i <= n) {
                constructPattern(i, 2 * n - i - 1, 2 * n);
                // Lower part of butterfly
            } else {
                constructPattern(2 * n - i - 1, i, 2 * n);
            }
            // Go to new line
            System.out.println("");
        }
    }
}
