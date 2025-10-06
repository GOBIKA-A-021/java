import java.util.*;
public class leetconsecutivenumcount {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        int maxLength = 1;
        int length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    length++;
                } else {
                    length = 1;
                }
                if (length > maxLength) {
                    maxLength = length;
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        int[] nums3 = {1, 0, 1, 2};

        System.out.println(longestConsecutive(nums1)); // 4
        //System.out.println(longestConsecutive(nums2)); // 9
        //System.out.println(longestConsecutive(nums3)); // 3
    }

}
