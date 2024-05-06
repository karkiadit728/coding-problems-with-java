public class ReverseArray {
    public static void arrayReverse(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int temp;
        while (start < end) {
            temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArray(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String args[]) {
        int[] nums = { -91, 0, 45, 72, 89, 100, 110, 111, 151 };
        arrayReverse(nums);
        printArray(nums);
    }

}
