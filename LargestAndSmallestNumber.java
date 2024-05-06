public class LargestAndSmallestNumber {
    public static int[] findLargestAndSmallest(int nums[]) {
        // 0: Smallest, 1: Largest
        // 0: Initially assuming the largest integer, 1: Initially assumming the
        // smallest integer
        int[] returnValues = { Integer.MAX_VALUE, Integer.MIN_VALUE };
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < returnValues[0]) {
                returnValues[0] = nums[i];
            }
            if (nums[i] > returnValues[1]) {
                returnValues[1] = nums[i];
            }
        }
        return returnValues;
    }

    public static void main(String args[]) {
        // Given an array of numbers, find the largest element in the array
        int[] nums = { 1, 50, -80, 61, 51, 32, 10, 19, -100 };
        int[] answers = findLargestAndSmallest(nums);
        System.out.println("Smallest: " + answers[0] + " Largest: " + answers[1]);
    }
}
