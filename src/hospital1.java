import java.util.Scanner;

    public class hospital1{
        String[] names;
        int[] ages;
        String[] diseases;
        int[] rooms;
        int n;

        public hospital1(int n) {
            this.n = n;
            names = new String[n];
            ages = new int[n];
            diseases = new String[n];
            rooms = new int[n];
        }


        public void inputData() {
            Scanner sc = new Scanner(System.in);
            for (int i = 0; i < n; i++) {
                System.out.println("\nEnter details for patient " + (i + 1));
                System.out.print("Name: ");
                names[i] = sc.next();
                System.out.print("Age: ");
                ages[i] = sc.nextInt();
                System.out.print("Disease: ");
                diseases[i] = sc.next();
                System.out.print("Room No: ");
                rooms[i] = sc.nextInt();
            }
        }


        public void displayAll() {
            System.out.println("\n--- All Patients ---");
            for (int i = 0; i < n; i++) {
                System.out.println("Name: " + names[i] + ", Age: " + ages[i] +
                        ", Disease: " + diseases[i] + ", Room: " + rooms[i]);
            }
        }


        public void searchByDisease(String dis) {
            boolean found = false;
            System.out.println("\nPatients with disease: " + dis);
            for (int i = 0; i < n; i++) {
                if (diseases[i].equalsIgnoreCase(dis)) {
                    System.out.println("Name: " + names[i] + ", Room: " + rooms[i]);
                    found = true;
                }
            }
            if (!found) System.out.println("No patient found with this disease.");
        }


        public void searchByName(String name) {
            boolean found = false;
            for (int i = 0; i < n; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    System.out.println("\nPatient Found: Name: " + names[i] + ", Age: " + ages[i] +
                            ", Disease: " + diseases[i] + ", Room: " + rooms[i]);
                    found = true;
                }
            }
            if (!found) System.out.println("Patient not found.");
        }


        public void searchByRoom(int room) {
            boolean found = false;
            System.out.println("\nPatients in Room " + room + ":");
            for (int i = 0; i < n; i++) {
                if (rooms[i] == room) {
                    System.out.println("Name: " + names[i] + ", Disease: " + diseases[i]);
                    found = true;
                }
            }
            if (!found) System.out.println("No patients found in this room.");
        }


        public void countByDisease(String dis) {
            int count = 0;
            for (int i = 0; i < n; i++) {
                if (diseases[i].equalsIgnoreCase(dis)) {
                    count++;
                }
            }
            System.out.println("\nNumber of patients with " + dis + ": " + count);
        }


        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of patients: ");
            int n = sc.nextInt();

            hospital1 hm = new hospital1(n);
            hm.inputData();

            int choice;
            do {
                System.out.println("\n===== Patient Management Menu =====");
                System.out.println("1. Display All Patients");
                System.out.println("2. Search Patient by Disease");
                System.out.println("3. Search Patient by Name");
                System.out.println("4. Search Patient by Room No");
                System.out.println("5. Count Patients by Disease");
                System.out.println("6. Exit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        hm.displayAll();
                        break;
                    case 2:
                        System.out.print("Enter disease: ");
                        String dis = sc.next();
                        hm.searchByDisease(dis);
                        break;
                    case 3:
                        System.out.print("Enter name: ");
                        String name = sc.next();
                        hm.searchByName(name);
                        break;
                    case 4:
                        System.out.print("Enter room number: ");
                        int room = sc.nextInt();
                        hm.searchByRoom(room);
                        break;
                    case 5:
                        System.out.print("Enter disease: ");
                        String d = sc.next();
                        hm.countByDisease(d);
                        break;
                    case 6:
                        System.out.println("Exiting... Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            } while (choice != 6);
        }
    }


