import java.util.Scanner;

public class HollowRhombusV2 {
    public static void constructParts(String insideString, int size) {
        // Left boundary edge
        System.out.print("*");
        // Middle part: Hollow or stars
        for (int k = 0; k < size - 2; k++) {
            System.out.print(insideString);
        }
        // Left boundary edge
        System.out.print("*");
    }

    public static void main(String args[]) {
        // Give size of a hollow rhombus, print the rhombus
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        for (int i = 0; i < size; i++) {
            // left space
            for (int j = 0; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Upper or lower sides
            if (i == 0 || i == size - 1) {
                constructParts("*", size);
            } else {
                constructParts(" ", size);
            }
            System.out.println("");
        }
    }
}
