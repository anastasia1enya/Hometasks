package home.com.Lesson6;

public class Wild2 extends Animals2 implements WildInterface {

    // перемнная только для хищных животных
    private boolean isPredator;
    //// геттеры/сеттеры
    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Wild2(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }// стандартные методы для всех животных + особенности

    @Override
    public void voice() {
        super.voice();
        System.out.println(", I am a wild animal ");
    }

    @Override
    public void move() {
        super.move();
        System.out.println(" on the fresh air!");
    }

    @Override
    public void printInfo() {
        super.printInfo();
    }

    @Override
    public void Predator() {
        System.out.println("IsPredator: " + isPredator);
    }
}
