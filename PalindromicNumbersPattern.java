public class PalindromicNumbersPattern {
    public static String createSpaces(int size) {
        String spaces = "";
        for (int i = 0; i <= size; i++) {
            spaces += " ";
        }
        return spaces;
    }

    public static void main(String args[]) {
        for (int i = 1; i <= 5; i++) {
            // Add leftspace
            System.out.print(createSpaces(5 - i));
            // Leftside numbers
            for (int j = i; j > 1; j--) {
                System.out.print(j);
            }
            // Rightside numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            // Go to new line
            System.out.println("");
        }
    }

}
