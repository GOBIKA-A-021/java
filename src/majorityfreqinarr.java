import java.util.Scanner;

public class majorityfreqinarr {
    public static void frequency(int[] arr)
    {   int max=0;
        boolean[] visited=new boolean[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            int count=1;
            if(visited[i]==true)
                continue;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    count++;
                    visited[j]=true;
                }
            }

            if(count>0)
            {

            }
            System.out.println("Frequency of "+arr[i] +" "+"is"+" " +count);
        }


    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        frequency(arr);

    }
}
