import java.util.*;
public class maxmindigit {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int max=0;int min=9;
      int num=sc.nextInt();
      while(num!=0)
      {
          int digit=num%10;
          if(digit>max)
          {
              max=digit;
          }
          if(digit<min)
          {
              min=digit;
          }

          num/=10;
      }
      System.out.println("Largest;"+max);
      System.out.println("Smallest:"+min);


    }
}
