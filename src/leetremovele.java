import java.util.*;
public class leetremovele {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int i = 0;

        while (i < n) {
            if (nums[i] == val) {

                nums[i] = nums[n - 1];
                n--;
            } else {
                i++;
            }
        }

        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] nums=new int[10];
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=sc.nextInt();
        }
        int val=sc.nextInt();
        int ans=removeElement(nums,val);
        System.out.println("Answer:"+ans);
    }
}
