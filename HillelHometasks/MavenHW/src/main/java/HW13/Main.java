package HW13;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        String b = scanner.nextLine();
        Figures a = new Figures();
        System.out.println("result");
        a.fig(b);
        a.print();

    }
}
