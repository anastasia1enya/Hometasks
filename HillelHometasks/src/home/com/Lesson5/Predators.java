package home.com.Lesson5;

public class Predators extends Wild {
    @Override
    public String voice() {

        return super.voice() + ", and I am hungry.";
    }

    public Predators(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color, isPredator);
    }

    // метод только для хищных животных
    public String hunt() {
        return "I see you, and I'm gonna catch you up.";
    }
}
