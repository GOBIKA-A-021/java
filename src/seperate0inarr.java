import java.util.*;

public class seperate0inarr {
    public static void zero(int[] nums)
    {
        for(int i=0;i<nums.length;i++) {
            if (nums[i] != 0)
                System.out.print(nums[i]+" ");
        }
        for(int i=0;i<nums.length;i++) {
            if (nums[i] == 0)
                System.out.print(nums[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        zero(nums);
    }
}
