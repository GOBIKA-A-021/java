public class dowhileoddeven {
    public static void main(String[] args) {
        int i = 1;
        int n=50;
        int even = 0;
        int odd=0;
        do {
            if (i % 2 == 0) {
                even=even+1;
            } else {
                odd=odd+1;
            }
            i++;

        } while(i<=n);
        {
            System.out.println("Evensum:" + even);
            System.out.println("Oddsum:" + odd);
        }

    }
}


