package HW14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
//    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
//    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    public static void main(String[] args) throws IOException {

        ResourceBundle
                resourceBundle = ResourceBundle.getBundle("com.hillel.lesson_26.i18n.messagesBundle.Day", new Locale("ua"));
        System.out.println(resourceBundle.getString("day1"));
        System.out.println(resourceBundle.getString("day2"));


        Scanner sc = new Scanner(System.in);

        System.out.println("Pls set your name");
        String name = sc.nextLine();
        loggerInfo.info("The player "+name + " entered the game");
        System.out.println("Select the number of games");
        int n = sc.nextInt();
        loggerInfo.info("The player chose amount of games : "+n );
        Player player = new Player(name);
        Robot robot = new Robot();
//        System.out.println("Game is start!");
        loggerInfo.info("Game is start!");
        Fight fight = new Fight();

        fight.setGames(1);
        fight.setRobotWins(0);
        fight.setPlayerWins(0);

        fight.fight(player,robot,n);


    }

}
