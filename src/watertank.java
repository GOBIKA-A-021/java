public class watertank {
        public static void main(String[] args) {
            int capacity = 100;
            int water = 7;
            int filled = 0;
            int minutes = 0;

            while (filled < capacity) {
                filled += water;
                minutes++;
            }

            System.out.println("Tank filled in " + minutes + " minutes.");
        }
    }


