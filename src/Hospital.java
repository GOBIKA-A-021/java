import java.util.Scanner;

class Patient {
    String name;
    int age;
    String disease;
    int roomNumber;

    Patient(String name, int age, String disease, int roomNumber) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.roomNumber = roomNumber;
    }

    void display() {
        System.out.println("Name: " + name + " | Age: " + age +
                " | Disease: " + disease + " | Room: " + roomNumber);
    }
}

public class Hospital{
    static Patient[] patients = new Patient[100]; // max 100 patients
    static int count = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("\n--- Hospital Menu ---");
            System.out.println("1. Add Patient");
            System.out.println("2. View All Patients");
            System.out.println("3. Search by Room");
            System.out.println("4. Search by Disease");
            System.out.println("5. Count Patients in Room");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1 -> addPatient();
                case 2 -> viewPatients();
                case 3 -> searchByRoom();
                case 4 -> searchByDisease();
                case 5 -> countInRoom();
                case 6 -> System.out.println("Goodbye!");
                default -> System.out.println("Invalid choice.");
            }
        } while (choice != 6);
    }

    static void addPatient() {
        if (count >= patients.length) {
            System.out.println("Hospital is full! Cannot add more patients.");
            return;
        }

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Disease: ");
        String disease = sc.nextLine();
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();

        patients[count] = new Patient(name, age, disease, room);
        count++;
        System.out.println("Patient added!");
    }

    static void viewPatients() {
        if (count == 0) {
            System.out.println("No patients yet.");
        } else {
            for (int i = 0; i < count; i++) {
                patients[i].display();
            }
        }
    }

    static void searchByRoom() {
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patients[i].roomNumber == room) {
                patients[i].display();
                found = true;
            }
        }
        if (!found) System.out.println("No patients in room " + room);
    }

    static void searchByDisease() {
        System.out.print("Enter Disease: ");
        String dis = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (patients[i].disease.equalsIgnoreCase(dis)) {
                patients[i].display();
                found = true;
            }
        }
        if (!found) System.out.println("No patients with " + dis);
    }

    static void countInRoom() {
        System.out.print("Enter Room Number: ");
        int room = sc.nextInt();
        int c = 0;
        for (int i = 0; i < count; i++) {
            if (patients[i].roomNumber == room) c++;
        }
        System.out.println("Patients in room " + room + ": " + c);
    }
}
