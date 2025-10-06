
import java.util.Scanner;
public class leetremovdupliate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[10];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        int ans=removeDuplicates(a);
        System.out.println("Answer:"+ans);
    }
}
