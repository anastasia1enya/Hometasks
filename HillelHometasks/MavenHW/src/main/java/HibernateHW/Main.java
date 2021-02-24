package HibernateHW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

Creation d = new Creation();

//d.recordsFindName("Sam Wintchester");

        System.out.println("Hello! I'm smart system!What you would like to do?");
        System.out.println("1-create\n"+"2-find by name\n"+"3-find by id\n");

        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Pls enter the student's name&surname");

                String a = scanner.next();


                System.out.println("Pls enter the group");
                int b = scanner.nextInt();

                System.out.println("Pls enter year");

                int c = scanner.nextInt();
                d.recordsAdd(a,b,c);
            break;

            case 2:
                System.out.println("Pls enter the student's name&surname");
                String e = scanner.next();
                e += " " + scanner.next();

                d.recordsFindName(e);
                break;
            case 3:
                System.out.println("Pls enter the student's id");
                int f = scanner.nextInt();
                d.recordsFindId(f);
                break;

            default:
                System.out.println("Incorrect");
                break;
        }

    }
}
