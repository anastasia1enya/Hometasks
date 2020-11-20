package home.com.Lesson3.Factorial;

public class FactorialDoWhile {
    public static void main(String[] args) {
        int i = 1;// вводим начальную точку
        int n = 6;// число факториал кот.нужно рассчитать
        int fact = 1;
        do {
            fact *= i;
            i++;
        }
        while (i <= n);

        System.out.println("Factorial of number " + n + " is:" + fact);
    }
}
