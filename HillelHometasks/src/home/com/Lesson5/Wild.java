package home.com.Lesson5;

public class Wild extends Animals {
    // перемнная только для хищных животных
    private boolean isPredator;
    //// геттеры/сеттеры
    public boolean isPredator() {
        return isPredator;
    }

    public void setPredator(boolean predator) {
        isPredator = predator;
    }

    public Wild(String id, double age, double weight, String color, boolean isPredator) {
        super(id, age, weight, color);
        this.isPredator = isPredator;
    }

    // стандартные методы для всех животных + особенности
    @Override
    public String voice() {
        return super.voice() + "I am a wild animal ";

    }

    @Override
    public String move() {
        return super.move() + " on the fresh air!";

    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("IsPredator: " + isPredator);

    }

}
