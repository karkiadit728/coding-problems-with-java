public class HollowRhombusPattern {
    public static String createDuplicateString(int size, char letter) {
        String duplicateString = "";
        for (int i = 0; i <= size; i++) {
            duplicateString += letter;
        }
        return duplicateString;
    }

    public static void main(String args[]) {
        String leftSpace;
        String middlePart;
        int rhombusLength = 5;

        for (int i = 0; i < rhombusLength; i++) {
            leftSpace = createDuplicateString(rhombusLength - i, ' ');
            if (i == 0 || i == rhombusLength - 1) {
                middlePart = createDuplicateString(rhombusLength - 2, '*');
            } else {
                middlePart = createDuplicateString(rhombusLength - 2, ' ');
            }
            System.out.println(leftSpace + '*' + middlePart + '*');
        }

    }

}
