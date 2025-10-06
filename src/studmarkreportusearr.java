
import java.util.Arrays;
import java.util.Scanner;

public class studmarkreportusearr {

        public static int highest(int[] marks) {
            int max = marks[0];
            for (int m : marks) if (m > max) max = m;
            return max;
        }

        public static int lowest(int[] marks) {
            int min = marks[0];
            for (int m : marks) if (m < min) min = m;
            return min;
        }

        public static double average(int[] marks) {
            int sum = 0;
            for (int m : marks) sum += m;
            return (double) sum / marks.length;
        }

        public static int countAboveAverage(int[] marks, double avg) {
            int count = 0;
            for (int m : marks) if (m > avg) count++;
            return count;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of students: ");
            int n = sc.nextInt();
            int[] marks = new int[n];

            System.out.println("Enter marks:");
            for (int i = 0; i < n; i++) marks[i] = sc.nextInt();

            double avg = average(marks);

            System.out.println("Highest Marks: " + highest(marks));
            System.out.println("Lowest Marks: " + lowest(marks));
            System.out.println("Average Marks: " + avg);
            System.out.println("Students above Average: " + countAboveAverage(marks, avg));

            Arrays.sort(marks);
            System.out.println("Sorted Marks: " + Arrays.toString(marks));

        }
    }
