package HW14;

import java.util.Scanner;

public class Fight {
    private int games;
    private int playerWins;
    private int robotWins;

    public int getPlayerWins() {
        return playerWins;
    }

    public void setPlayerWins(int playerWins) {
        this.playerWins = playerWins;
    }

    public int getRobotWins() {
        return robotWins;
    }

    public void setRobotWins(int robotWins) {
        this.robotWins = robotWins;
    }

    public int getGames() {
        return games;
    }

    public void setGames(int games) {
        this.games = games;
    }
    Scanner scanner = new Scanner(System.in);

    int playerPass;
    int robotPass;

    public void fight (Player player,Robot robot, int n){


        while (games!=n) {

            System.out.println("Choose your item: ");
            System.out.println("1.ROCK ");
            System.out.println("2.SCISSORS");
            System.out.println("3.PAPER ");
            System.out.println("4.STOP ");

            playerPass = scanner.nextInt();

            if (playerPass<4||playerPass>0) {

                robotPass = (int) (Math.random() * 3 + 1);
                System.out.print("Robo pass is ");
                print(robotPass);

                if (playerPass == 1 && robotPass == 2 || playerPass == 2 && robotPass == 3 || playerPass == 3 && robotPass == 1) {
                    playerWins++;
                    System.out.println("Player won ");
                    games++;
                } else if (playerPass == 2 && robotPass == 1 || playerPass == 3 && robotPass == 2 || playerPass == 1 && robotPass == 3) {
                    robotWins++;
                    System.out.println("Robot won ");
                    games++;

                } else if (playerPass == 1 && robotPass == 1 || playerPass == 2 && robotPass == 2 || playerPass == 3 && robotPass == 3) {
                    System.out.println("No wins");
                    games++;

            }
            } else if (playerPass == 4) {
                System.out.println("Game is stop");
                break;
            } else {
                System.out.println("Wrong number, Game is stop");
                break;
            }
        }
        result();
        }


    public void result (){
        if (getRobotWins()>getPlayerWins()){
            System.out.println("Robot is winner of the game with count = " +getRobotWins());
            System.out.println("Player's count = " +getPlayerWins());

        } else if (getRobotWins()<getPlayerWins()){
            System.out.println("Player is winner of the game with count = " +getPlayerWins());
            System.out.println("Robot's count = " +getRobotWins());
        } else {
            System.out.println("No winners...");
            System.out.println("Robo count = "+getRobotWins());
            System.out.println("Players count = "+getPlayerWins());
        }


    }

    public void print ( int pass) {

        if (pass == 1) {
            System.out.println("ROCK");
        } else if (pass == 2) {
            System.out.println("SCISSORS");
        } else if (pass == 3) {
            System.out.println("PAPER");
        }
    }

}
