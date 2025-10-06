import java.util.Scanner;

public class missingnumberinarr {
    public static int missnumber(int[] nums)
    {
        int n=nums.length+1;
        int arrsum=0;
        int nsum=n*(n+1)/2;
        for(int i=0;i<nums.length;i++)
        {
            arrsum+=nums[i];
        }
        return nsum-arrsum;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans=missnumber(nums);
        System.out.println("Answer:"+ans);
    }
}
