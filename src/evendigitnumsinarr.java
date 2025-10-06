import java .util.*;
public class evendigitnumsinarr {
    public static int findNumbers(int[] nums) {
        int ec = 0;
        for (int i = 0; i < nums.length; i++) {
            int count=0;
            while (nums[i] != 0) {
                nums[i] /= 10;
                count++;

            }

            if (count % 2 == 0)
                ec++;
        }


        return ec;

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        int ans=findNumbers(nums);
        System.out.println("Answer:"+ans);
    }
}
