import java.util.*;
public class validdatemonth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter day");
        int days=sc.nextInt();
        System.out.println("Enter month");
        int month=sc.nextInt();
        boolean valid=false;
        if(month>=1 && month<=12)
        {
            if(month==2){
                valid=days>=1 && days<=28;
            }
            else if(month==4 || month==6 || month ==9 || month==11){
                valid=days>=1 && days<=10;
            }
            else {
                valid=days>=1 && days <=31;
            }
        }
        if(valid){
            System.out.println("Valid");
        }
        else {
            System.out.println("Not valid");
        }

}
}
