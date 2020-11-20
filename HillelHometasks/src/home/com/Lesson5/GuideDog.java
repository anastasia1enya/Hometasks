package home.com.Lesson5;

public class GuideDog extends Dog {
    // перемнные только для тренированных животных:
    private boolean isTrained;
    // геттеры/сеттеры
    public boolean isTrained() {
        return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
   // стандартные методы для всех животных + особенности
    @Override
    public String voice() {
        return super.voice() + ". I can take you home";
    }

    @Override
    public String love() {
        return super.love() + "And i really care about him.";
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("IsTrained: "+ isTrained());
    }
    // метод только для тренированных животных
    public String goHome(){
        return "Let's go home!";
    }
}
