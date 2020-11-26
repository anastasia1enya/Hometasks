package home.com.Lesson6;

public class GuideDog extends Pets implements GuideDogInterface, Cloneable {

    // перемнные только для тренированных животных:
    private boolean isTrained;

    public GuideDog(String id, double age, double weight, String color, String name, boolean isVaccinated, boolean isTrained) {
        super(id, age, weight, color, name, isVaccinated);
        this.isTrained = isTrained;
    }

    // геттеры/сеттеры
    public boolean isTrained() { return isTrained;
    }

    public void setTrained(boolean trained) {
        isTrained = trained;
    }
    // стандартные методы для всех животных + особенности


    @Override
    public void voice() {
        super.voice() ;
        System.out.println("I can take you home");
    }

    @Override
    public void love() {
        super.love();
        System.out.println("And i really care about him.");
    }

    @Override
    public void goHome() {
        System.out.println("Let's go home!");

    }
    // метод только для тренированных животных
    @Override
    public void Trained() {
        System.out.println("IsTrained: "+ isTrained());
    }


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
    
   

