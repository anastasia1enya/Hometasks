package home.com.Lesson6;

public class Predators extends Wild implements PredatorInterface {


    public Predators(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void voice() {
        super.voice() ;
        System.out.println(", and I am hungry.");
    }

    @Override
    public void hunt() {
        System.out.print("I see you, and I'm gonna catch you up.");
    }
}
