import java.util.*;
public class posornegmaxcountinarr {
        public static int maximumCount(int[] nums) {
            int nc=0;
            int pc=0;
            for(int i=0;i<nums.length;i++)
            {    int n=nums[i];
                if(n>0)
                {
                    pc++;
                }
                else if(n<0)
                {
                    nc++;
                }
            }
            if(pc>nc)
            {
                return pc;
            }
            else
            {
                return nc;
            }



        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int[] nums=new int[10];
            for(int i=0;i<nums.length;i++)
            {
                nums[i]=sc.nextInt();
            }
            int ans=maximumCount(nums);
            System.out.println("Answer:"+ans);
        }
    }

