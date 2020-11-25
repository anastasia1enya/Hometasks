package home.com.Lesson6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose you animal");

        String a = scanner.nextLine();

        System.out.println("Info:");

        //создаем экземпляры для каждого гласса животных, в связи с тем какое животное выбрали
        switch (a) {
            case "fish":

                Fish fish = new Fish("0056935-F",1,0.02,"Gold","Robert",false);
                fish.move();
                fish.voice();
                fish.printInfo();
                fish.Vaccinated();


                break;
            case "cat":

               Cat cat = new Cat("5890*96-C",5,4,"White","Murka",true );
               cat.move();
               cat.voice();
               cat.love();
               cat.printInfo();
               cat.Vaccinated();

                break;
            case "hamster":

                Hamster hamster = new Hamster("012/2020/56 - H",1.5,0.015,"Ginger","Funtik",true);

                hamster.move();
                hamster.voice();
                hamster.love();
                hamster.printInfo();
                hamster.Vaccinated();
                break;
            case "dog":
                Dog dog = new Dog("85963 - o -D",4,10, "Grey","Vasiliy",true);

                dog.move();
                dog.voice();
                dog.love();
                dog.printInfo();
                dog.Vaccinated();


                break;
            case "guideDog":

                GuideDog guideDog = new GuideDog("85963 - o -D",4,10,"Grey","Vasiliy",true,true);
                guideDog.move();
                guideDog.voice();
                guideDog.love();
                guideDog.goHome();
                guideDog.printInfo();
                guideDog.Vaccinated();
                guideDog.Trained();

                break;

            case "crocodile":
                Crocodile crocodile = new Crocodile("8569/4556- C",88,200,"Green",true);
                crocodile.move();
                crocodile.voice();
                crocodile.hunt();
                crocodile.printInfo();
                crocodile.Predator();
                break;
            case "lion":
                Lion lion = new Lion("856925-L",20,150,"Yellow",true);

                lion.move();
                lion.voice();
                lion.hunt();
                lion.printInfo();
                lion.Predator();

                break;
            case "wolf":
                Wolf wolf = new Wolf("8596-W",4,80,"Gray",true);
                wolf.move();
                wolf.voice();
                wolf.hunt();
                wolf.printInfo();
                wolf.Predator();

                break;
            case "giraffe":
                Giraffe giraffe = new Giraffe("115696-G",15,130,"Yellow with brown",false);
                giraffe.move();
                giraffe.voice();
                giraffe.printInfo();
                giraffe.Predator();

                break;

            default:
                System.out.println("Wrong!Try again");
        }
    }
}
