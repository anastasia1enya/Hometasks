package home.com.Lesson5;

public class Lion extends Predators {

    @Override
    public String hunt() {
        return super.hunt() + ".I am a king!";
    }
}
