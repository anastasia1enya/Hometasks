package HW14;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
//    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
//    private static final Logger loggerWarn = LoggerFactory.getLogger("logger.warn");
    private static final Logger loggerInfo = LoggerFactory.getLogger("logger.info");
    private static final Logger loggerError = LoggerFactory.getLogger("logger.error");

    public static void main(String[] args) throws IOException {

        List<Locale> localeList = List.of(new Locale("de"), new Locale("ru"), new Locale("en"));
        Locale.setDefault(Locale.ENGLISH);

        ResourceBundle
                resourceBundle = ResourceBundle.getBundle("Fight");



        Scanner sc = new Scanner(System.in);

        System.out.println("Pls set your name");
        System.out.println(resourceBundle.getString("setName"));
        String name = sc.nextLine();
        loggerInfo.info("The player "+name + " entered the game");
        System.out.println(resourceBundle.getString("pEnter"));
        System.out.println("Select the number of games");
        System.out.println(resourceBundle.getString("setNummber"));
        int n = sc.nextInt();
        loggerInfo.info("The player chose amount of games : "+n );
        System.out.println(resourceBundle.getString("pChoice"));
        Player player = new Player(name);
        Robot robot = new Robot();
//        System.out.println("Game is start!");
        loggerInfo.info("Game is start!");
        System.out.println(resourceBundle.getString("start"));
        Fight fight = new Fight();

        fight.setGames(1);
        fight.setRobotWins(0);
        fight.setPlayerWins(0);

        fight.fight(player,robot,n);


    }

}
