package classroom.Lesson6;

public class Main {
    public static void main(String[] args) {

    }
}

class M {
    String getAndPrintClassName(){
        class Prtn implements PrintInfo{
            @Override
            public String print(String message) {
                System.out.println("print message : " + message);

                return message;
            }
        }
        return new Prtn().print(getClass().getName());

    }


}