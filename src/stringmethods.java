import java.util.*;
public class stringmethods {
    public static void main(String[] args)
    {
        String s1=" welcome ";
        String s2="java";
        String s3="java";
        String s4="WELcome";

        int length=s1.length();
        System.out.println(length);
        char c=s1.charAt(3);
        System.out.println(c);
        boolean b=s1.isEmpty();
        System.out.println(b);
        System.out.println(Arrays.toString(s1.toCharArray()));;
        boolean f=s1.equals(s2);
        System.out.println(f);
        boolean bo=s2.equals(s3);
        System.out.println(bo);
        boolean boo=s2.equalsIgnoreCase(s3);
        System.out.println(boo);
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
        System.out.println(s1.contains("come"));
        System.out.println(s1.contains("come"));
        System.out.println(s1.startsWith("wel"));
        System.out.println(s1.startsWith("come"));
        System.out.println(s1.endsWith("wel"));
        System.out.println(s1.endsWith("come"));
        System.out.println(s2.indexOf('a'));
        System.out.println(s2.lastIndexOf('a'));
        System.out.println(s1.concat(s2));
        System.out.println(s1.substring(3));
        System.out.println(s1.substring(3,6));
        System.out.println(s1.substring(3,7));
        System.out.println(s2.replace("java","python"));
        System.out.println(s1.strip());
        System.out.println(s1.trim());
        System.out.println(s4.toLowerCase());
        System.out.println(s4.toUpperCase());
        System.out.println(Arrays.toString(s4.split("c")));
        System.out.println(String.join("/","21","11","2005"));












    }
}
