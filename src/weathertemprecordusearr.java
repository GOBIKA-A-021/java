import java.util.Arrays;
import java.util.Scanner;
public class weathertemprecordusearr {

        public static void main(String[] args)
        {
            int[] temp = {30, 32, 28, 31, 29, 33, 34};
            int highest = temp[0];
            int lowest = temp[0];
            int sum = 0;
            for (int i = 0; i < temp.length; i++)
            {
                if (temp[i] > highest)
                {
                    highest = temp[i];
                }
                if (temp[i] < lowest)
                {
                    lowest = temp[i];
                }
                sum += temp[i];
            }
            double average = sum / (double) temp.length;
            int countAbove = 0;
            for (int i = 0; i < temp.length; i++)
            {
                if (temp[i] > average)
                {
                    countAbove++;
                }
            }
            System.out.println("Highest temperature: " + highest);
            System.out.println("Lowest temperature: " + lowest);
            System.out.println("Average temperature: " + average);
            System.out.println("Days above average: " + countAbove);
            System.out.print("Temperatures in reverse order: ");
            for (int i = temp.length - 1; i >= 0; i--)
            {
                System.out.print(temp[i] + " ");
            }
        }
    }

