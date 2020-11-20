package home.com.Lesson5;

import java.util.Scanner;

public class ListOfAnimals {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose you animal");

        String a = scanner.nextLine();

        System.out.println("Info:");

         //создаем экземпляры для каждого гласса животных, в связи с тем какое животное выбрали
        switch (a) {
            case "fish":

                Fish fish = new Fish();
                fish.setId("0056935-F");
                fish.setAge(1);
                fish.setColor("Gold");
                fish.setWeight(0.02);
                fish.setName("Robert");
                fish.setVaccinated(false);

                fish.printInfo();
                System.out.println(fish.voice());
                System.out.println(fish.move());
                System.out.println(fish.love());

                break;
            case "cat":

                Cat cat = new Cat();
                cat.setId("5890*96-C");
                cat.setAge(5);
                cat.setColor("White");
                cat.setWeight(4);
                cat.setName("Murka");
                cat.setVaccinated(true);

                cat.printInfo();
                System.out.println(cat.voice());
                System.out.println(cat.move());
                System.out.println(cat.love());
                break;
            case "hamster":

                Hamster hamster = new Hamster();
                hamster.setId("012/2020/56 - H");
                hamster.setAge(1.5);
                hamster.setColor("Ginger");
                hamster.setWeight(0.015);
                hamster.setName("Funtik");
                hamster.setVaccinated(true);

                hamster.printInfo();
                System.out.println(hamster.voice());
                System.out.println(hamster.move());
                break;
            case "dog":
                Dog dog = new Dog();
                dog.setId("85963 - o -D");
                dog.setAge(4);
                dog.setColor("Grey");
                dog.setWeight(10);
                dog.setName("Vasiliy");
                dog.setVaccinated(true);

                dog.printInfo();
                System.out.println(dog.voice());
                System.out.println(dog.move());
                System.out.println(dog.love());
                break;
            case "guideDog":

                GuideDog guideDog = new GuideDog();
                guideDog.setId("85963 - o -D");
                guideDog.setAge(4);
                guideDog.setColor("Grey");
                guideDog.setWeight(10);
                guideDog.setName("Vasiliy");
                guideDog.setVaccinated(true);
                guideDog.setTrained(true);

                guideDog.printInfo();
                System.out.println(guideDog.voice());
                System.out.println(guideDog.move());
                System.out.println(guideDog.love());
                System.out.println(guideDog.goHome());
                break;

            case "crocodile":
                Crocodile crocodile = new Crocodile();
                crocodile.setId("8569/4556- C");
                crocodile.setAge(88);
                crocodile.setColor("Green");
                crocodile.setWeight(200);

                crocodile.printInfo();
                System.out.println(crocodile.voice());
                System.out.println(crocodile.move());
                System.out.println(crocodile.hunt());
                break;
            case "lion":
                Lion lion = new Lion();
                lion.setId("856925-L");
                lion.setAge(20);
                lion.setColor("Yellow");
                lion.setWeight(150);
                lion.setPredator(true);

                lion.printInfo();
                System.out.println(lion.voice());
                System.out.println(lion.move());
                System.out.println(lion.hunt());
                break;
            case "wolf":
                Wolf wolf = new Wolf();
                wolf.setId("8596-W");
                wolf.setAge(4);
                wolf.setColor("Gray");
                wolf.setWeight(80);
                wolf.setPredator(true);

                wolf.printInfo();
                System.out.println(wolf.voice());
                System.out.println(wolf.move());
                System.out.println(wolf.hunt());
                break;
            case "giraffe":
                Giraffe giraffe = new Giraffe();
                giraffe.setId("8596-W");
                giraffe.setAge(4);
                giraffe.setColor("Gray");
                giraffe.setWeight(80);
                giraffe.setPredator(false);

                giraffe.printInfo();
                System.out.println(giraffe.voice());
                System.out.println(giraffe.move());
                break;

            default:
                System.out.println("Wrong!Try again");
        }


    }
}
