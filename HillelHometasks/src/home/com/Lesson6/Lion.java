package home.com.Lesson6;

public class Lion extends Predators {

    public Lion(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    @Override
    public void hunt() {
        super.hunt();
        System.out.println("I am a king!");
    }
}
