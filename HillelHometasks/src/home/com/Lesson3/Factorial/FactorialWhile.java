package home.com.Lesson3.Factorial;

public class FactorialWhile {
    public static void main(String[] args) {
        int i = 1;// вводим начальную точку
        int n = 4;// число факториал кот.нужно рассчитать
        int fact = 1;
        while (i <= n) {
            fact *= i;
            i++;
        }
        System.out.println("Factorial of number " + n + " is:" + fact);
    }
}
