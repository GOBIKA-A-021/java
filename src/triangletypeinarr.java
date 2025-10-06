import java.util.Scanner;
public class triangletypeinarr {
    public static void triangle(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if(nums[0]+nums[1]>nums[2] && nums[1]+nums[2]>nums[0] && nums[2]+nums[0]>nums[1]) {
                if (nums[0] == nums[1] && nums[1] == nums[2] && nums[2] == nums[0]) {
                    System.out.println("Equilateral");
                    break;
                } else if (nums[0] == nums[1] || nums[1] == nums[2] || nums[2] == nums[0]) {
                    System.out.println("Isosceles");
                    break;
                } else {
                    System.out.println("Scalene");
                    break;
                }
            }
            else
                System.out.println("Not a triangle");

        }
    }

  public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] nums = new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
         triangle(nums);


    }
}
