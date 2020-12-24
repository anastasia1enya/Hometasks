import GameCreator.Hero;
import GameCreator.HeroCreate;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {

        System.out.println("_________START GAME_________");
        System.out.println("Select rasa");
        System.out.println("1. WARRIOR");
        System.out.println("2. WIZARD");
        System.out.println("3. ARCHER");

        Scanner sc = new Scanner(System.in);

        //select name
        System.out.println("Name: ");;
        String name = sc.nextLine();
        //select rasa
        Integer rasa = sc.nextInt();
        System.out.println(rasa);
        System.out.println("Name: " + name);
      // Hero hero = new HeroCreate.createHero();




    }
}
