package classroom.Lesson6;

public class Test implements Cloneable {
    int i =0;
    @Override
    public Object clone() throws CloneNotSupportedException {
        System.out.println(15);
        return super.clone();
    }
}
