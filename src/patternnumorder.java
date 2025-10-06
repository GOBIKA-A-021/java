public class patternnumorder {
    public static void main(String[] args) {
        int a=1;
        for (int i = 1; i <= 4; i++) {
            System.out.println();
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                a++;
            }
        }
    }
}
