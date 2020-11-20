package home.com.Lesson3.Factorial;

public class FactorialFor {
    public static void main(String[] args) {
        int n = 4;// число факториал кот.нужно рассчитать
        int fact = 1;
        for (int i = 1; i <= n; i++) {

            fact *= i;
        }
        System.out.println("Factorial of number " + n + " is:" + fact);
    }
}
