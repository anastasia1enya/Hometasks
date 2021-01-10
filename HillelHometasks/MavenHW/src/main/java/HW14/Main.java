package HW14;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Pls set your name");
        String name = sc.nextLine();
        System.out.println("Select the number of games");
        int n = sc.nextInt();
        Player player = new Player(name);
        Robot robot = new Robot();
        System.out.println("Game is start!");

        Fight fight = new Fight();

        fight.setGames(0);
        fight.setRobotWins(0);
        fight.setPlayerWins(0);

        fight.fight(player,robot,n);


    }

}
