import java.util.*;
public class leetplusonelastinarr {
        public static void plusOne(int[] digits) {
            int n = digits.length;


            for (int i = n - 1; i >= 0; i--) {
                if (digits[i] < 9) {
                    digits[i]++;
                    System.out.print(Arrays.toString(digits));
                }
                digits[i] = 0;
            }


            int[] result = new int[n + 1];
            result[0] = 1;
            System.out.print(Arrays.toString(result));
        }

        public static void main(String[] args)
        {
            int[] digits=new int[5];
            Scanner sc=new Scanner(System.in);
            for(int i=0;i<digits.length;i++)
            {
                digits[i]=sc.nextInt();
            }
            plusOne(digits);


        }
    }

