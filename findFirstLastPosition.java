public class findFirstLastPosition {

    public static int[] searchRange(int[] nums, int target) {
        int first = findBound(nums, target, true);
        int last = findBound(nums, target, false);
        return new int[]{first, last};
    }

    // Helper to find either first or last occurrence
    private static int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1;
        int bound = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                bound = mid;
                // Search left for first, right for last
                if (isFirst) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return bound;
    }

    // Test the code
    public static void main(String[] args) {
        int[] nums1 = {5, 7, 7, 8, 8, 10};
        int[] result1 = searchRange(nums1, 8);
        System.out.println("[" + result1[0] + ", " + result1[1] + "]"); // Output: [3, 4]

        int[] nums2 = {5, 7, 7, 8, 8, 10};
        int[] result2 = searchRange(nums2, 6);
        System.out.println("[" + result2[0] + ", " + result2[1] + "]"); // Output: [-1, -1]

        int[] nums3 = {};
        int[] result3 = searchRange(nums3, 0);
        System.out.println("[" + result3[0] + ", " + result3[1] + "]"); // Output: [-1, -1]
    }
}
