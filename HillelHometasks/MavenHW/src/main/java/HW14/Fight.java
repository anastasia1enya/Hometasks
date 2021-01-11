package HW14;

import javax.xml.crypto.Data;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

public class Fight {
    private int games;
    private int playerWins;
    private int robotWins;

    FileWriter file = new FileWriter("C:\\Users\\admin\\Desktop\\Java 2\\Hometasks\\HillelHometasks\\MavenHW\\src\\main\\java\\HW14\\results.txt", true);

    public Fight() throws IOException {
    }

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

    public void fight (Player player,Robot robot, int n) throws IOException {


        while (games!=n+1) {

            System.out.println("Choose your item: ");
            System.out.println("1.ROCK ");
            System.out.println("2.SCISSORS");
            System.out.println("3.PAPER ");
            System.out.println("4.STOP ");

            playerPass = scanner.nextInt();

            if (playerPass==1||playerPass==2||playerPass==3) {

                robotPass = (int) (Math.random() * 3 + 1);
                System.out.print("Robo pass is ");
                print(robotPass);


                if (playerPass == 1 && robotPass == 2 || playerPass == 2 && robotPass == 3 || playerPass == 3 && robotPass == 1) {
                    playerWins++;
                    System.out.println("------------------");
                    System.out.println("Player "+ player.getName() + " won in round " + games );
                    System.out.println("------------------");
                   file.write("------------------\n");
                   file.write("Player "+ player.getName() + " won in round " + games+ "\n");
                   file.write("------------------\n");
                    games++;
                } else if (playerPass == 2 && robotPass == 1 || playerPass == 3 && robotPass == 2 || playerPass == 1 && robotPass == 3) {
                    robotWins++;
                    System.out.println("------------------");
                    System.out.println("Robot won in round " + games);
                    System.out.println("------------------");
                   file.write("------------------\n");
                    file.write("Robot won in round " + games+ "\n");
                    file.write("------------------\n");

                    games++;

                } else //if (playerPass == 1 && robotPass == 1 || playerPass == 2 && robotPass == 2 || playerPass == 3 && robotPass == 3) {
                {System.out.println("------------------");
                    System.out.println("No wins in round "+ games);
                    System.out.println("------------------");
                   file.write("------------------\n");
                    file.write("No wins in round "+ games+ "\n");
                   file.write("------------------\n");

                    games++;

            }
            } else if (playerPass == 4) {
                System.out.println("------------------");
                System.out.println("Game is stop");
                System.out.println("------------------");
                file.write("------------------\n");
                file.write("Game is stop\n");
                file.write("------------------\n");

                break;
            } else {
                System.out.println("------------------");
                System.out.println("Wrong number, Game is stop");
                System.out.println("------------------");
                file.write("------------------\n");
                file.write("Wrong number, Game is stop\n");
               file.write("------------------\n");

                break;
            }
        }
        result(player);
        }


    public void result (Player player) throws IOException {
        if (getRobotWins()>getPlayerWins()){
            System.out.println("------------------");
            System.out.println("Robot is winner of the game with count = " +getRobotWins());
            System.out.println("Player's " +player.getName()+ " count = " +getPlayerWins());
            System.out.println("------------------");
            file.write("------------------\n");
            file.write("Robot is winner of the game with count = " +getRobotWins()+ "\n");
            file.write("Player's " +player.getName()+ " count = " +getPlayerWins()+ "\n");
            file.write("------------------\n");
            file.close();

        } else if (getRobotWins()<getPlayerWins()){
            System.out.println("------------------");
            System.out.println("Player's " +player.getName()+ " count = " +getPlayerWins());
            System.out.println("Robot's count = " +getRobotWins());
            System.out.println("------------------");
            file.write("------------------\n");
            file.write("Player's " +player.getName()+ " count = " +getPlayerWins()+ "\n");
            file.write("Robot's count = " +getRobotWins()+ "\n");
            file.write("------------------\n");
            file.close();
        } else {
            System.out.println("------------------");
            System.out.println("No winners...");
            System.out.println("Robo count = "+getRobotWins());
            System.out.println("Player's "+player.getName()+ " count = "+getPlayerWins());
            System.out.println("------------------");
            file.write("------------------\n");
            file.write("No winners...\n");
            file.write("Robo count = "+getRobotWins()+ "\n");
            file.write("Player's "+player.getName()+ " count = "+getPlayerWins()+ "\n");
            file.write("------------------\n");
            file.close();
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
