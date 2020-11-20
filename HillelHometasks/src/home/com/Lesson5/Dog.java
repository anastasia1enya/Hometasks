package home.com.Lesson5;

public class Dog extends Pets {

    @Override
    public String voice() {
        return super.voice() + ". Woof! ";
    }

    @Override
    public String love() {
        return super.love() + "Especially to play with him.";
    }
}
