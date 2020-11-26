package home.com.Lesson5;

import java.util.Scanner;

public class ListOfAnimals   {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose you animal");

        String a = scanner.nextLine();

        System.out.println("Info:");

         //создаем экземпляры для каждого гласса животных, в связи с тем какое животное выбрали
        switch (a) {
            case "fish":

                Fish fish = new Fish("0056935-F",1,0.02,"Gold","Robert",false);

                fish.printInfo();
                System.out.println(fish.voice());
                System.out.println(fish.move());
                System.out.println(fish.love());

                break;
            case "cat":

                Cat cat = new Cat("5890*96-C",5,4,"White","Murka",true );

                cat.printInfo();
                System.out.println(cat.voice());
                System.out.println(cat.move());
                System.out.println(cat.love());
                break;
            case "hamster":

                Hamster hamster = new Hamster("012/2020/56 - H",1.5,0.015,"Ginger","Funtik",true);

                hamster.printInfo();
                System.out.println(hamster.voice());
                System.out.println(hamster.move());
                break;
            case "dog":
                Dog dog = new Dog("85963 - o -D",4,10, "Grey","Vasiliy",true);

                dog.printInfo();
                System.out.println(dog.voice());
                System.out.println(dog.move());
                System.out.println(dog.love());
                break;
            case "guideDog":

                GuideDog guideDog = new GuideDog("85963 - o -D",4,10,"Grey","Vasiliy",true,true);

                guideDog.printInfo();
                System.out.println(guideDog.voice());
                System.out.println(guideDog.move());
                System.out.println(guideDog.love());
                System.out.println(guideDog.goHome());
                break;

            case "crocodile":
                Crocodile crocodile = new Crocodile("8569/4556- C",88,200,"Green",true);

                crocodile.printInfo();
                System.out.println(crocodile.voice());
                System.out.println(crocodile.move());
                System.out.println(crocodile.hunt());
                break;
            case "lion":
                Lion lion = new Lion("856925-L",20,150,"Yellow",true);

                lion.printInfo();
                System.out.println(lion.voice());
                System.out.println(lion.move());
                System.out.println(lion.hunt());
                break;
            case "wolf":
                Wolf wolf = new Wolf("8596-W",4,80,"Gray",true);

                wolf.printInfo();
                System.out.println(wolf.voice());
                System.out.println(wolf.move());
                System.out.println(wolf.hunt());
                break;
            case "giraffe":
                Giraffe giraffe = new Giraffe("115696-G",15,130,"Yellow with brown",false);

                giraffe.printInfo();
                System.out.println(giraffe.voice());
                System.out.println(giraffe.move());
                break;

            default:
                System.out.println("Wrong!Try again");
        }


    }
}
