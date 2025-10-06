import java.util.*;
public class add2numinarrreachtarget {
        public static int[] twoSum(int[] nums, int target,int[] arr) {
            for (int i = 0; i < nums.length; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[i] + nums[j] == target) {
                        arr[0] = i;
                        arr[1] = j;
                    }


                }

            }
            return arr;


        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[2];
            int[] nums = new int[5];
            for (int i = 0; i < nums.length; i++) {
                nums[i] = sc.nextInt();
            }
            int target = sc.nextInt();
            twoSum(nums, target,arr);
            System.out.print(Arrays.toString(arr));
        }
    }
