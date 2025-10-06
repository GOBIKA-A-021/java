import java.util.Scanner;
public class passwordstrengthcheck {

        public static boolean hasUpperCase(String pwd)
        {
            for (int i = 0; i < pwd.length(); i++)
            {
                if (Character.isUpperCase(pwd.charAt(i)))
                {
                    return true;
                }
            }
            return false;
        }
        public static boolean hasLowerCase(String pwd)
        {
            for (int i = 0; i < pwd.length(); i++)
            {
                if (Character.isLowerCase(pwd.charAt(i)))
                {
                    return true;
                }
            }
            return false;
        }
        public static boolean hasDigit(String pwd)
        {
            for (int i = 0; i < pwd.length(); i++)
            {
                if (Character.isDigit(pwd.charAt(i)))
                {
                    return true;
                }
            }
            return false;
        }
        public static boolean hasSpecialChar(String pwd)
        {
            String specialChars = "!@#$%^&*()-_=+[]{}|;:'\",.<>?/`~";
            for (int i = 0; i < pwd.length(); i++)
            {
                if (specialChars.contains(String.valueOf(pwd.charAt(i))))
                {
                    return true;
                }
            }
            return false;
        }
        public static boolean isStrongPassword(String pwd)
        {
            return pwd.length() >= 8 && hasUpperCase(pwd) && hasLowerCase(pwd)
                    && hasDigit(pwd) && hasSpecialChar(pwd);
        }

        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter your password: ");
            String password = sc.nextLine();

            if (password.isEmpty())
            {
                System.out.println("Invalid password! Password cannot be empty.");
            }
            else if (isStrongPassword(password))
            {
                System.out.println("Your password is STRONG.");
            }
            else
            {
                System.out.println("Your password is WEAK.");
                System.out.println("Make sure it has at least 8 characters, uppercase, lowercase, digit, and special character.");
            }

        }
    }

