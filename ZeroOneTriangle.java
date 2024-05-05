public class ZeroOneTriangle {
    public static void main(String args[]) {
        /*
         * Pattern to make
         * 1
         * 0 1
         * 1 0 1
         * 0 1 0 1
         * 1 0 1 0 1
         */
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((i + j + 1) % 2);
            }
            System.out.println("");
        }
    }
}
