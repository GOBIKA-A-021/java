import java.util.*;
public class alphabetnumdigitsymbol {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char c=sc.nextLine().charAt(0);
        if(Character.isLetter(c))
             System.out.println("ALPHABET");
        else if(Character.isDigit(c))
             System.out.println("NUMBER");
        else if(Character.isSpace(c))
             System.out.println("NON-PRINTABLE CHARACTER");
        else
             System.out.println("SYMBOL");


   }

}
