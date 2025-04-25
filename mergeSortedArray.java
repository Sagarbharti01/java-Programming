import java.util.Arrays;


class Solution {
    public void merge(int[] nums1,int m, int[] nums2,int n) {
            int p1 = m - 1;         // Last element in nums1's real data
    int p2 = n - 1;         // Last element in nums2
    int p = m + n - 1;      // Last position in nums1

    while (p2 >= 0) {
        if (p1 >= 0 && nums1[p1] > nums2[p2]) {
            nums1[p] = nums1[p1];
            p1--;
        } else {
            nums1[p] = nums2[p2];
            p2--;
        }
        p--;
    }
    }
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

        // Create an instance of Solution and call merge
        Solution sol = new Solution();
        sol.merge(nums1, m, nums2, n);

        // Output result
        System.out.println("Merged Array: " + Arrays.toString(nums1));
    }
}