public class BinarySearch {
    public static int searchBinary(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int middle;

        while (start <= end) {
            middle = (start + end) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
        }
        // if not found, return -1
        return -1;
    }

    public static void main(String args[]) {
        int[] nums = { -91, 0, 45, 72, 89, 100, 110, 111, 151 };
        System.out.println(searchBinary(nums, -91));
        System.out.println(searchBinary(nums, 0));
        System.out.println(searchBinary(nums, 45));
    }
}
