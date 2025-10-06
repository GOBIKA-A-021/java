import java.util.*;
public class hospitalmanagement {
    public static void patient(Scanner sc) {
        String name;
        int age;
        String dis;
        int room;
        for (int i = 1; i <3; i++) {
            System.out.println("Patient name");
             name = sc.next();
            System.out.println("Enter patient age");
             age = sc.nextInt();
            System.out.println("Enter Disease name");
             dis = sc.next();
            //search(dis,sc);
            System.out.println("Enter the room number");
             room = sc.nextInt();
             display(name, age, dis, room);
        }
    }
    public static void display(String name,int age,String dis,int room)
    {

            System.out.println("Patient name:"+name);
            System.out.println("Patient age:"+age);
            System.out.println("Patient disease:"+dis);
            System.out.println("Patient room number:"+room);



    }
    public static void display1(String dis,Scanner sc) {

        System.out.println("Enter disease name:");
        String disease=sc.next();
       // if(dis==disease)
            //display1(String dis);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("             -----Vijay Hospital-----             ");
        System.out.println("Patient details");
        patient(sc);
        System.out.println("Enter your choice to know the patient details");
        int c=sc.nextInt();
        System.out.println("1.Search by disease");
        System.out.println("2.Search by room number");
        switch(c)
        {
            case 1:
               // display1();
                break;
            case 2:
                //searchroom();
                break;
            default:
                System.out.println("Enter correct choice");
        }



    }
}