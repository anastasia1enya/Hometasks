package classroom.Lesson6;

public class Lol {

    public static void main(String[] args) throws CloneNotSupportedException {
        Test testClone = new Test();
        Test c = (Test)testClone.clone();
        Test c1 = testClone;

        System.out.println("___________");

        System.out.println(testClone);
        System.out.println(c1);
        System.out.println(c);
    }
}
