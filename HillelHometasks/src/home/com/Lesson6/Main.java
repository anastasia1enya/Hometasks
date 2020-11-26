package home.com.Lesson6;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
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

                //создаем клонов
                System.out.println("_________________________ clone:");

                Fish cloneRobert = (Fish) fish.clone();
                cloneRobert.setName("Angel");
                cloneRobert.setColor("Red");
                cloneRobert.move();
                cloneRobert.voice();
                cloneRobert.printInfo();
                cloneRobert.Vaccinated();


                break;
            case "cat":

               Cat cat = new Cat("5890*96-C",5,4,"White","Murka",true );
               cat.move();
               cat.voice();
               cat.love();
               cat.printInfo();
               cat.Vaccinated();

               //создаем клонов

                System.out.println("_________________________ clone:");

                Cat cat2 = (Cat) cat.clone();
                cat2.setName("Vasya");
                cat2.setAge(98);
                cat2.setVaccinated(false);
                cat2.move();
                cat2.love();
                cat2.voice();
                cat2.printInfo();
                cat2.Vaccinated();

                break;
            case "hamster":

                Hamster hamster = new Hamster("012/2020/56 - H",1.5,0.015,"Ginger","Funtik",true);

                hamster.move();
                hamster.voice();
                hamster.love();
                hamster.printInfo();
                hamster.Vaccinated();

                 //создаем клонов
                System.out.println("_________________________ clone:");

                Hamster h = (Hamster) hamster.clone();
                h.setId("hamster 2.0");
                h.setColor("Black as your soul");
                h.setVaccinated(false);
                h.move();
                h.love();
                h.voice();
                h.printInfo();
                h.Vaccinated();

                break;
            case "dog":
                Dog dog = new Dog("85963 - o -D",4,10, "Grey","Vasiliy",true);

                dog.move();
                dog.voice();
                dog.love();
                dog.printInfo();
                dog.Vaccinated();
                //создаем клонов
                System.out.println("_________________________ clone:");

                Dog dog2 = (Dog) dog.clone();
                dog2.setName("Horror");
                dog2.setVaccinated(false);
                dog2.move();
                dog2.love();
                dog2.voice();
                dog2.printInfo();
                dog2.Vaccinated();


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
                //создаем клонов

                System.out.println("_________________________ clone:");

                GuideDog d = (GuideDog) guideDog.clone();
                d.setName("Careness");
                d.setWeight(87);
                d.move();
                d.love();
                d.voice();
                d.goHome();
                d.printInfo();
                d.Vaccinated();


                break;

            case "crocodile":
                Crocodile crocodile = new Crocodile("8569/4556- C",88,200,"Green",true);
                crocodile.move();
                crocodile.voice();
                crocodile.hunt();
                crocodile.printInfo();
                crocodile.Predator();
                //создаем клонов

                System.out.println("_________________________ clone:");

                Crocodile c = (Crocodile) crocodile.clone();
                c.setAge(156);
                c.setId("kdfjfjfii");
                c.move();
                c.voice();
                c.hunt();
                c.printInfo();
                c.Predator();

                break;
            case "lion":
                Lion lion = new Lion("856925-L",20,150,"Yellow",true);

                lion.move();
                lion.voice();
                lion.hunt();
                lion.printInfo();
                lion.Predator();
                //создаем клонов

                System.out.println("_________________________ clone:");

                Lion lionClone = (Lion) lion.clone();
                lionClone.setId("4556545/2255");
                lionClone.move();
                lionClone.voice();
                System.out.println("I don't want to hunt, i'm kind");
                lionClone.printInfo();
                lionClone.Predator();

                break;
            case "wolf":
                Wolf wolf = new Wolf("8596-W",4,80,"Gray",true);
                wolf.move();
                wolf.voice();
                wolf.hunt();
                wolf.printInfo();
                wolf.Predator();
                //создаем клонов

                System.out.println("_________________________ clone:");

                Wolf w = (Wolf) wolf.clone();

                w.move();
                w.voice();
                System.out.println("But in my soul,  I'm the kitten. Meow!");
                w.printInfo();
                w.Predator();

                break;
            case "giraffe":
                Giraffe giraffe = new Giraffe("115696-G",15,130,"Yellow with brown",false);
                giraffe.move();
                giraffe.voice();
                giraffe.printInfo();
                giraffe.Predator();
                //создаем клонов

                System.out.println("_________________________ clone:");

                Giraffe g = (Giraffe) giraffe.clone();

                g.setPredator(true);
                g.move();
                g.voice();
                g.printInfo();
                g.Predator();
                System.out.println("I am a wild giraffe!!!!");

                break;

            default:
                System.out.println("Wrong!Try again");
        }
    }
}
