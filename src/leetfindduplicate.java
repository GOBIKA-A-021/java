import java.util.*;
public class leetfindduplicate {
    public static int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] digits = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < digits.length; i++) {
            digits[i] = sc.nextInt();
        }
        int  ans = findDuplicate(digits);
        System.out.println(ans);

    }
}


