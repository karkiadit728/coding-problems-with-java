import java.util.Scanner;

public class DiamondPattern {
    public static void printSpace(int n) {
        for (int k = 0; k < n; k++) {
            System.out.print(" ");
        }
    }

    public static void main(String args[]) {
        // Given the lenght of each side of diamond, construct a diamond pattern
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int spaces;
        for (int i = 0; i < 2 * length; i++) {
            // Choose spaces based on the diamond's upper and lower part
            if (i < length) {
                spaces = length - i - 1;
                // construct spaces
                printSpace(spaces);
                // print stars
                for (int l = 0; l <= 2 * i; l++) {
                    System.out.print("*");
                }
            } else {
                spaces = i - length;
                // construct spaces
                printSpace(spaces);
                // print stars
                for (int l = 2 * length - 1; l > 2 * spaces; l--) {
                    System.out.print("*");
                }
            }
            // Go to newline
            System.out.println("");
        }
    }
}
