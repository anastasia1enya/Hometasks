package home.com.Lesson5;

public class Cat extends Pets {
    @Override
    public String voice() {
        return super.voice()+ ". Meow! ";
    }

    @Override
    public String love() {
        return super.love()+ "But myself i love more ♥";
    }
}
