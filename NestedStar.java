public class NestedStar {
    public static void main(String args[]) {
        /*
         * Intended output pattern:
         * *******
         * *****
         * ***
         * *
         */
        String leftGap = "";
        for (int i = 7; i > 0; i -= 2) {
            // Add left gap first
            System.out.print(leftGap);
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            // Widen the gap from left
            leftGap += " ";
            // Take to next line
            System.out.println("\n");
        }
    }
}
