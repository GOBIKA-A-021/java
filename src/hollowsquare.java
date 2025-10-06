public class hollowsquare {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(" ");
            for (int j = 1; j <= 5; j++) {

                if (j == 1 || j == 5 || i==j || i+j==5+1 || i==1 || i==5)
                    System.out.print("*"+" ");
                else
                    System.out.print("  ");
            }

        }
    }
}
